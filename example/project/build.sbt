addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")

lazy val root = project.in(file(".")).dependsOn(file("../.."))
