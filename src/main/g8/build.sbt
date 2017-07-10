pgpPassphrase := Some(getEnvVar("PGP_PASSPHRASE").getOrElse("").toCharArray)
pgpPublicRing := file(s"\$gpgFolder/pubring.gpg")
pgpSecretRing := file(s"\$gpgFolder/secring.gpg")

lazy val root = project
  .in(file("."))
  .settings(name := "$project$")
  .settings(moduleName := "root")
  .settings(noPublishSettings: _*)
  .settings(scalaMetaSettings: _*)
  .settings(libraryDependencies ++= commonDeps ++ freestyleCoreDeps())
  .aggregate(`$project$JS`, `$project$JVM`)

lazy val `$project$` = crossProject
  .in(file("$project$"))
  .settings(moduleName := "$project$")
  .settings(scalaMetaSettings: _*)
  .crossDepSettings(commonDeps ++ freestyleCoreDeps(): _*)
  .jsSettings(sharedJsSettings: _*)

lazy val `$project$JVM` = `$project$`.jvm
lazy val `$project$JS` = `$project$`.js
