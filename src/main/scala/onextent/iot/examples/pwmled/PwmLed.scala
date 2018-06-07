package onextent.iot.examples.pwmled

import ch.jodersky.jni.nativeLoader

@nativeLoader("pwmled0")
class PwmLed {
  // --- Native methods
  @native def intMethod(n: Int): Int
  @native def booleanMethod(b: Boolean): Boolean
  @native def stringMethod(s: String): String
  @native def intArrayMethod(a: Array[Int]): Int
}

