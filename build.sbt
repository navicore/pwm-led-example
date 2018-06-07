name := "PwmLedExample"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++=
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )

lazy val main = Project(id = "PwmLedExample", base = file(".")).dependsOn(native % Runtime)

lazy val native = (project in file("native")).
  settings(sourceDirectory in nativeCompile := sourceDirectory.value).
  enablePlugins(JniNative)

mainClass in assembly := Some("onextent.iot.examples.pwmled.Main")
assemblyJarName in assembly := "PwmLedExample.jar"

(Test / test) := ((Test / test) dependsOn javah).value

