name := "nano"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.5.2"
libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
