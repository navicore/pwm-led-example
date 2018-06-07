package onextent.iot.examples.pwmled

object Main {

  // --- Main method to test our native library
  def main(args: Array[String]): Unit = {
    val pwmled = new PwmLed
    val square = pwmled.intMethod(5)
    val bool = pwmled.booleanMethod(true)
    val text = pwmled.stringMethod("java")
    val sum = pwmled.intArrayMethod(Array(1, 1, 2, 3, 5, 8, 13))

    println(s"intMethod: $square")
    println(s"booleanMethod: $bool")
    println(s"stringMethod: $text")
    println(s"intArrayMethod: $sum")
  }
}

