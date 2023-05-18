// ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / scalaVersion     := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "test-slick-database-scala3",
    libraryDependencies += ("com.typesafe.slick" %% "slick" % "3.4.1").cross(CrossVersion.for3Use2_13)
  )
