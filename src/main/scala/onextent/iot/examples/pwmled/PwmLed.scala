package onextent.iot.examples.pwmled

import ch.jodersky.jni.nativeLoader

@nativeLoader("pwmled0")
object PwmLed {

  // --- Native methods
  @native def apply(pin: Int): Int

}

