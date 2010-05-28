import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
   val scalatools_snapshot = "Scala Tools Snapshot" at
  "http://scala-tools.org/repo-snapshots/"

  val scalatools_release = "Scala Tools Snapshot" at
  "http://scala-tools.org/repo-releases/"

  val liftVersion = "2.0-scala280-SNAPSHOT"

  override def libraryDependencies = Set(
    "net.liftweb" % "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" % "lift-mapper" % liftVersion % "compile->default",
    "net.liftweb" % "lift-testkit" % liftVersion % "compile->default",
    "net.liftweb" % "lift-wizard" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "org.scala-tools.testing" % "specs_2.8.0.Beta1" % "1.6.4-SNAPSHOT" % "test->default",
    "com.h2database" % "h2" % "1.2.121"
  ) ++ super.libraryDependencies
}
