package database

class ConfMySql(hosting: java.net.URL, db: String, user: String, pw: String)
	extends Configuration {
	val host = hosting
	val username = user
	val password = pw
	val database = db
}