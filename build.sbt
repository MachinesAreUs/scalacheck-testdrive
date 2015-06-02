name         := "scalacheck-test-drive"
version      := "1.0"
scalaVersion := "2.11.1"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.3" % "test"
libraryDependencies += "fun4java" % "sudoku" % "0.1" % "compile"

