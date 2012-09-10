package database

import dbp.{Main =>_, Manage =>_, CommandLineParser =>_, _}

/**
 * All information about an mysql instance
 */
class ConfMySql(hosting: java.net.URL, db: String, user: String, pw: String)
	extends Configuration {
	val host = hosting
	val username = user
	val password = pw
	val database = db
}

case class MySqlInstance(con: ConfMySql, set: ProjectSetup) extends
	DBInstance(set: ProjectSetup) {
  val conf = con
  
}