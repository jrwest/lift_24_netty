import sbt._
import Keys._

object LiftNettyProjectBuild extends Build {
  override lazy val settings = super.settings ++ buildSettings

  lazy val buildSettings = Seq(
    scalaVersion := "2.9.1"
  )

  lazy val defaultSettings = Defaults.defaultSettings ++ Seq(
    name := "lift_netty_basic",
    libraryDependencies ++= {
      val liftVersion = "2.4"
      Seq(
	"net.liftweb" %% "lift-webkit" % liftVersion % "compile",
        "ch.qos.logback" % "logback-classic" % "1.0.0" % "compile",
        "org.jboss.netty" % "netty" % "3.2.7.Final"
      )
    }    
  )

  lazy val tempDepProj = RootProject(file("../../../lift-netty"))

  lazy val project = Project(
    id = "lift_netty_basic",
    base = file("."),
    settings = defaultSettings
  ) dependsOn tempDepProj  
}
