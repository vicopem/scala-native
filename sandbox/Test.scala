import java.util.concurrent.TimeUnit
import java.io.{File, FileInputStream, FileOutputStream, InputStream}
import java.nio.file.Files

import scala.io.Source
import scala.scalanative.posix.{fcntl, unistd}
import scala.scalanative.unsafe.{Zone, toCString}
import scala.scalanative.unsigned._

object Test {

  def readInputStream(s: InputStream) = Source.fromInputStream(s).mkString

  val resourceDir =
    s"${System.getProperty("user.dir")}/unit-tests/src/test/resources/process"

  def assertProcessExitOrTimeout(process: Process): Unit = {
    // Suspend execution of the test until either the specified
    // process has exited or a reasonable wait period has timed out.
    //
    // A waitFor() prevents zombie processes and makes the exit value
    // available. A timed waitfor means the test will eventually complete,
    // even if there is a problem with the underlying process.
    //
    // In the normal case, the process will exit within milliseconds or less.
    // The timeout will not increase the expected execution time of the test.
    //
    // Ten seconds is an order of magnitude guess for a "reasonable"
    // completion time.  If a process expected to exit in milliseconds
    // takes that three orders of magnitude longer, it must be reported.

    val tmo    = 10
    val tmUnit = TimeUnit.SECONDS

    println(s"Process took more than $tmo ${tmUnit.name} to exit.", process.waitFor(tmo, tmUnit))
  }

  val scripts = Set("echo.sh", "err.sh", "ls", "hello.sh")

  def ls(): Unit = {
    val proc = new ProcessBuilder("ls", resourceDir).start()
    val out  = readInputStream(proc.getInputStream)

    assertProcessExitOrTimeout(proc)

    println(out)
  }

  def inherit(): Unit = {
    val f       = Files.createTempFile("/tmp", "out")
    val savedFD = unistd.dup(unistd.STDOUT_FILENO)
    val flags   = fcntl.O_RDWR | fcntl.O_TRUNC | fcntl.O_CREAT
    val fd = Zone { implicit z =>
      fcntl.open(toCString(f.toAbsolutePath.toString), flags, 0.toUInt)
    }

    val out =
      try {
        unistd.dup2(fd, unistd.STDOUT_FILENO)
        fcntl.close(fd)
        val proc = new ProcessBuilder("ls", resourceDir).inheritIO().start()
        proc.waitFor(5, TimeUnit.SECONDS)
        readInputStream(new FileInputStream(f.toFile))
      } finally {
        unistd.dup2(savedFD, unistd.STDOUT_FILENO)
        fcntl.close(savedFD)
      }

    println(out)
  }

  def checkPathOverride(pb: ProcessBuilder) = {
    val proc = pb.start()
    val out  = readInputStream(proc.getInputStream) // must read before exit

    assertProcessExitOrTimeout(proc)

    println(out)// Should be 1
  }

  def pathOverride(): Unit = {
    val pb = new ProcessBuilder("ls", resourceDir)
    //pb.environment.put("PATH", resourceDir)
    checkPathOverride(pb)
  }

  def pathPrefixOverride(): Unit = {
    val pb = new ProcessBuilder("ls", resourceDir)
    pb.environment.put("PATH", s"$resourceDir:${pb.environment.get("PATH")}")
    checkPathOverride(pb)
  }

  def inputAndErrorStream(): Unit = {
    val pb  = new ProcessBuilder("err.sh")
    val cwd = System.getProperty("user.dir")
    pb.environment.put("PATH", s"$cwd/unit-tests/src/test/resources/process")
    val proc = pb.start()

    assertProcessExitOrTimeout(proc)

    println(readInputStream(proc.getErrorStream))
    println(readInputStream(proc.getInputStream))
  }

  def inputStreamWritesToFile(): Unit = {
    val pb = new ProcessBuilder("echo.sh")
    pb.environment.put("PATH", resourceDir)
    val file = File.createTempFile("istest", ".tmp", new File("/tmp"))
    //pb.redirectOutput(file)

    try {
      val proc = pb.start()
      proc.getOutputStream.write("hello\n".getBytes)
      proc.getOutputStream.write("quit\n".getBytes)
      proc.getOutputStream.flush()

      assertProcessExitOrTimeout(proc)
      for (i <- 0 to 10) {
        println(proc.getInputStream.read())
      }
      val out = Source.fromFile(file.toString).getLines mkString "\n"
      println(out)
    } finally {
      file.delete()
    }
  }

  def outputStreamReadsFromFile(): Unit = {
    val pb = new ProcessBuilder("echo.sh")
    pb.environment.put("PATH", resourceDir)
    val file = File.createTempFile("istest", ".tmp", new File("/tmp"))
    pb.redirectInput(file)

    try {
      val proc = pb.start()
      val os   = new FileOutputStream(file)
      os.write("hello\n".getBytes)
      os.write("quit\n".getBytes)

      assertProcessExitOrTimeout(proc)

      println("hello" == readInputStream(proc.getInputStream))
    } finally {
      file.delete()
    }
  }

  def redirectErrorStream(): Unit = {
    val pb  = new ProcessBuilder("err.sh")
    val cwd = System.getProperty("user.dir")
    pb.environment.put("PATH", s"$cwd/unit-tests/src/test/resources/process")
    pb.redirectErrorStream(true)
    val proc = pb.start()

    assertProcessExitOrTimeout(proc)

    println("" == readInputStream(proc.getErrorStream))
    println("foobar" == readInputStream(proc.getInputStream))
  }

  def waitForWithTimeoutCompletes(): Unit = {
    val proc = new ProcessBuilder("sleep", "0.1").start()

    println("process should have exited but timed out",
      proc.waitFor(1, TimeUnit.SECONDS))
    println(0 == proc.exitValue)
  }

  // Design Notes:
  //   1) The timing on the next few tests is pretty tight and subject
  //      to race conditions.
  //
  //      The waitFor(100, TimeUnit.MILLISECONDS) assumes that the
  //      process has not lived its lifetime by the time it
  //      executes, a race condition.  Just because two instructions are
  //      right next to each other, does not mean they execute without
  //      intervening interruption or significant elapsed time.
  //
  //      This section has been hand tweaked for the __slow__ conditions
  //      of Travis CI. It may still show intermittent failures, requiring
  //      re-tweaking.
  //
  //   2) The code below has zombie process mitigation code.  That is,
  //      It assumes a competent destroyForcibly() and attempts to force
  //      processes which _should_have_ exited on their own to do so.
  //
  //      A number of other tests in this file have the potential to
  //      strand zombie processes and are candidates for a similar fix.

  def waitForWithTimeoutTimesOut(): Unit = {
    val proc = new ProcessBuilder("sleep", "2.0").start()

    println("process should have timed out but exited" == !proc.waitFor(500, TimeUnit.MILLISECONDS))
    println("process should be alive" == proc.isAlive)

    // await exit code to release resources. Attempt to force
    // hanging processes to exit.
    if (!proc.waitFor(10, TimeUnit.SECONDS))
      proc.destroyForcibly()
  }

  def destroy(): Unit = {
    val proc = new ProcessBuilder("sleep", "2.0").start()

    println("process should be alive" == proc.isAlive)
    proc.destroy()
    println("process should have exited but timed out",
      proc.waitFor(500, TimeUnit.MILLISECONDS))
    println(0x80 + 9 == proc.exitValue) // SIGKILL, excess 128
  }

  def destroyForcibly(): Unit = {
    val proc = new ProcessBuilder("sleep", "2.0").start()

    println("process should be alive", proc.isAlive)
    val p = proc.destroyForcibly()
    println("process should have exited but timed out",
      p.waitFor(500, TimeUnit.MILLISECONDS))
    println(0x80 + 9 == p.exitValue) // SIGKILL, excess 128
  }

  def shellFallback(): Unit = {
    val pb = new ProcessBuilder("hello.sh")
    pb.environment.put("PATH", resourceDir)
    val proc = pb.start()

    assertProcessExitOrTimeout(proc)

    println("hello\n" == readInputStream(proc.getInputStream))
  }

  def main(args: Array[String]): Unit = {
    ls()
  }/*{
    val i = args(0).toInt
    val funs = Array(
      {_:Unit => ls()},
      {_:Unit => inherit()},
      {_:Unit => pathOverride()},
      {_:Unit => pathPrefixOverride()},
      {_:Unit => inputAndErrorStream()},
      {_:Unit => inputStreamWritesToFile()},
      {_:Unit => outputStreamReadsFromFile()},
      {_:Unit => redirectErrorStream()},
      {_:Unit => waitForWithTimeoutCompletes()},
      {_:Unit => waitForWithTimeoutTimesOut()},
      {_:Unit => destroy()},
      {_:Unit => destroyForcibly()},
      {_:Unit => shellFallback()}
    )
    (funs(i))(())
  }*/
}