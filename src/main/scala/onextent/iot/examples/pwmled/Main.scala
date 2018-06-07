package onextent.iot.examples.pwmled

object Main {

  // --- Main method to test our native library
  def main(args: Array[String]): Unit = {

    println(s"args len ${args.length}")

    val pin = args(0).toInt

    println(s"running pin: $pin")

    val rc = PwmLed(pin)

    println(s"rc: $rc")

  }

}

