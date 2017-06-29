import freestyle.FreestylePlugin
import sbt._
import sbtorgpolicies.OrgPoliciesPlugin.autoImport._
object ProjectPlugin extends AutoPlugin {
  override def requires: Plugins = FreestylePlugin

  override def trigger: PluginTrigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] = scalaMetaSettings
}
