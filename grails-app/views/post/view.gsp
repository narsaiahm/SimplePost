<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>
	${post.title}
</title>
</head>
<body class="body">
	<h1>
		${post.title}
	</h1>
	<p>
		${post.teaser}
	</p>
	<div>
		${post.content}
	</div>


<g:each in="${post.comments}" var="comment">
	<div class="comment">
		<p>
			${comment.comment}
		</p>
		<p>
			Made by:
			${comment.who.name}
			on
			${comment.dateCreated}
		</p>
	</div>
</g:each>

</body>
</html>

