name := "nano"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.2-RC1"
libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.2.18" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
