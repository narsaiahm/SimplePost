package samplepostapp

class CommentController {

    def editComment = {
		def post = Post.get(params.id)
		if(!post) {
			post = new Post()
		}
        render(view:'editComment',
                model:[
                        comment:new Comment(),
                        postId:params.id])
    }
//save the post
    def save = {
        def comment = new Comment(params)
        comment.dateCreated = new Date();
        comment.post = loadPost(params.id)
        if(comment.save()) {
            redirect(
                    controller:'post',
                    action:'view',
                    id:params.id)
        } else {
            render(view:'editComment',
                    model:[comment:comment,
                            postId:params.id])
        }
    }
	
	private loadPost(id) {
		def post = new Post();
		if(id) {
			post = Post.get(id)
		}
		return post
	}
}
