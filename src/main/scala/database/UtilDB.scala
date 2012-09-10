package database

abstract class UtilDB {
	type Conf <: Configuration
	def print2DB(conf: Conf): Unit
}