package database

object UtilDBMySql extends UtilDB {
	type Conf = ConfMySql
	def print2DB(conf: Conf) = println("")
	print2DB(new ConfMySql(new java.net.URL(""), "","",""))
}