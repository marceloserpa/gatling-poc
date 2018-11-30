enablePlugins(GatlingPlugin)

name := "stress-tests-fun"
version := "1.0"
scalaVersion := "2.12.7"

libraryDependencies += "io.gatling" % "gatling-test-framework" % "2.3.0"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.0" % "test,it"
libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"