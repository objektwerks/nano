name := "nano"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.0-RC3"
libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
