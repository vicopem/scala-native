import java.nio.file.Files
import java.io.File
import java.nio.file.attribute.PosixFileAttributes

import scalanative.unsafe._
import scalanative.libc._

object Test {

  def makeTemporaryDir(): File = {
    val file = File.createTempFile("test", ".tmp")
    file
  }

  def withTemporaryDirectory(fn: File => Unit) {
    fn(makeTemporaryDir())
  }

  def main(args: Array[String]): Unit = {
    withTemporaryDirectory { dirFile =>
      val dir   = dirFile.toPath
      val attrs = Files.readAttributes(dir, classOf[PosixFileAttributes])
      println(attrs.isDirectory())
      println(attrs.isOther())
      println(attrs.isRegularFile())
      println(attrs.isSymbolicLink())
    }
  }
}