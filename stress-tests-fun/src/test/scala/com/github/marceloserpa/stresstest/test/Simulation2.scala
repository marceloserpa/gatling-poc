package com.github.marceloserpa.stresstest.test

import scala.concurrent.duration._

import java.util.concurrent.ThreadLocalRandom

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Simulation2 extends Simulation {

  val httpConf = http
    .baseURL("http://computer-database.gatling.io")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .shareConnections

  val scn = scenario("Stress test scenario sample")
    .exec(http("Get books").get("/").check(status.is(200))
    )
  setUp(
    scn.inject(constantUsersPerSec(1).during(60))
  ).protocols(httpConf)

}
