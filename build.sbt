
name := "spark-hbase"

version := "0.1"

scalaVersion := "2.11.12"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

resolvers += "Hortonworks Repository" at "http://repo.hortonworks.com/content/repositories/releases/"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:postfixOps"
)

libraryDependencies ++= Seq(
  "com.hortonworks.shc" % "shc-core" % "1.1.0.3.1.5.6-1",
  "org.apache.hadoop" % "hadoop-aws" % "3.1.1"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
