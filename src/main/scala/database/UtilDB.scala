package database

import dbp.{CommandLineParser => _, Main => _, Manage =>_, _}

/**
 * Provide general DB manipulation methods
 */
abstract class UtilDB {
	type Conf <: Configuration
	def print2DB(conf: Conf, setup: ProjectSetup): Int
}