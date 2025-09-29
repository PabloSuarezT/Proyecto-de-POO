ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "Proyecto-de-POO",
    // Aquí es donde la dependencia DEBE ir:
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )