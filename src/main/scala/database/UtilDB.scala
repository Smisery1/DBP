package database

import central._

abstract class UtilDB {
	type Conf <: Configuration
	def print2DB(conf: Conf, setup: ProjectSetup): Int
}