import samplepostapp.Post

class BootStrap {

	def init = {
		servletContext ->
		/*new Post(title:"First Grails Project", 
			teaser:"Clearing out the clutter", 
			content:"The full content of the article", published:true).save(failOnError:true) 
			
			new Post(title:"Getting Ready for Go Live", 
				teaser:"The follow up on some real world issues.",
				 content:"The full content of the article", published:false).save(failOnError:true)*/
	}
	def destroy = {
	}
}
