import scala.Array
import scala.scalanative.unsafe._

object Test {

  def main(args: Array[String]): Unit = {
    val x: Long = 3
    try {
      throw new Exception
    } catch {
      case e: Exception => println("I got it !")
    }

  }

}