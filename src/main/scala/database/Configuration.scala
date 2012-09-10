package database

import dbp.{Main =>_, Manage =>_, CommandLineParser =>_, _}

/**
 * Provides essential information needed for any DB manipulation
 */
abstract class Configuration {
	val host: java.net.URL
	val username: String
	val password : String
	val database: String
	
	def dbAdress = host.toString + "/" + database
}

abstract class DBInstance(setup: ProjectSetup) {
  type Conf <: Configuration
  val conf: Conf
  val printer: (Conf, ProjectSetup) => Int
  def print2DB: Int = printer(conf, setup)
}