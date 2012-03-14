name := "lift_netty_basic"

libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-webkit" % "2.5-SNAPSHOT" % "compile",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "compile",
  "org.jboss.netty" % "netty" % "3.2.7.Final"  
)

scalaVersion := "2.9.1"

