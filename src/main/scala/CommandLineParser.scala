import org.clapper.argot._

class CommandLineParser(args: Array[String]) {
	
	import ArgotConverters._

	private val parser = new ArgotParser( "DataPuzzler",
			preUsage=Some("DataPuzzler: Version 0.1. Copyright (c) " +
                  "2012, Patrick B.H.J. Großmann, patrick.grossmann(at)uni-bielefeld(dot)de. + " +
                  "Towards a modular and generic data builder in cancer research."),
                  postUsage=Some("Currently supporting TCGA Queries, MySql and Linux"
            )
	)
	val project = parser.parameter[String]("Project-Folder",
	    "Directory of project to be edited", false)
	val sourceTemplate = parser.parameter[String]("Source",
	    "Specifies which source is queried. Either one of: TCGA", false)

	def parse { parser.parse(args) }
	
}