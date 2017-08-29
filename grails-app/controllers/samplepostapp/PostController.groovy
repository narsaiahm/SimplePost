package samplepostapp

class PostController {

	def defaultAction = 'list'

	
	def edit = {
		def post = Post.get(params.id)
		if(!post) {
			post = new Post()
		}
		render(view:'edit', model:[post:post])
	}
//post added for the list committ
	def list = {

		render( view:'list', model:[posts:Post.list( sort:'lastUpdated', order:'desc')])
	}
	//test save

	def save = {
		def post = loadPost(params.id) 
		post.properties = params 
		if(post.save()) {
			redirect(action:'list')
		} else {
			render(view:'edit', model:[post:post])
		}
	} 
	
	private loadPost(id) {
		def post = new Post(); 
		if(id) {
			post = Post.get(id)
		} 
		return post
	} 
	
	def view = { 
		def post = Post.get(params.id)
		if(!post) {
			post = new Post()
		}
		render(view:'view', model:[post:Post.get(params.id)]) 
		
		}

}
