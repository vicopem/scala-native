import scala.Array
import scala.scalanative.unsafe._

object Test {
  def main(args: Array[String]): Unit = {
    val diff = 1000
    for(i <- 0 until 100000) {
      val strings = for(j <- 0 until diff) yield (i*diff+j).toBinaryString
      //strings.foreach(println)
    }
  }
}