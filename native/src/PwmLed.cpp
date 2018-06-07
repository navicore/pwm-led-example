#include <jni.h>
#include "onextent_iot_examples_pwmled_PwmLed__.h"
#include <ctype.h>
#include <string.h>
#include <pigpiod_if2.h>

// no idea what the 00024 is about but it is needed for Object
JNIEXPORT jint JNICALL Java_onextent_iot_examples_pwmled_PwmLed_00024_apply

(JNIEnv* env, jobject obj, jint pin) {

  if (gpioInitialise() < 0) {
      fprintf(stderr, "pigpio initialisation failed\n");
      return 1;
   }

  return 0;

}

