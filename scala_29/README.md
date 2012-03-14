This directory contains example projects using Lift and Netty with Scala 2.9.1:

* lift_netty_basic uses `RestHelper` to serve a simple JSON response

# Running the Projects

each of these projects are setup so the server can be run the same way across all of them. You can either run them from the sbt console or from a jar using a main class. 

## From SBT

    $ sbt run

## From a JAR

Create the JAR:

    $ sbt assembly
    $ java -jar target/[JARNAME].jar 
