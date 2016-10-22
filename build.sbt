name := """my_app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
}

enablePlugins(DebianPlugin)

maintainer := "Oleg email@addres.ru"

packageSummary := "My custom package"

packageDescription := "Package"
