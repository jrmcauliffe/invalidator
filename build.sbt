name := "invalidator"

version := "0.0.6"

organization := "org.birchavenue.aws"

scalaVersion := "2.11.7"

target in assembly := file("target/scala-2.11/deploy/")

libraryDependencies ++= Seq(
  "org.specs2"                   %% "specs2-core"              % "3.4"    % "test",
  "com.amazonaws"                %  "aws-lambda-java-core"      % "1.0.+",
  "com.amazonaws"                %  "aws-lambda-java-events"    % "1.0.+"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")
