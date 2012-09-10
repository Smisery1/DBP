package database

import dbp._

/**
 * Factory methods for to manipulate a MySql instance
 */
object UtilDBMySql extends UtilDB {
	type Conf = ConfMySql
	def print2DB(conf: Conf, setup: ProjectSetup) = 2
	print2DB(new ConfMySql(new java.net.URL(""), "","",""), new ProjectSetup(""))
}