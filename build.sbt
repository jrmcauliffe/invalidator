name := "invalidator"

version := "0.0.1"

organization := "org.birchavenue.aws"

scalaVersion := "2.11.7"

proguardSettings

ProguardKeys.options in Proguard ++= Seq("-dontnote", "-dontwarn", "-ignorewarnings")

ProguardKeys.options in Proguard += ProguardOptions.keepMain("invalidator.main")

libraryDependencies ++= Seq(
  "org.specs2"                   %% "specs2-core"              % "3.4"    % "test",
  "com.amazonaws"                % "aws-lambda-java-core"      % "1.0.0",
  "com.amazonaws"                % "aws-lambda-java-core"      % "1.0.0",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.5.2"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")
