package database

abstract class Configuration {
	val host: java.net.URL
	val username: String
	val password : String
	val database: String
	
	def dbAdress = host.toString + "/" + database
}