<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="main"/>
<title>My Posts</title>
</head>
<body>
  <div class="body">
  
  <h1>My Posts</h1>
	<g:each in="${posts}" var="post">
		<div>
			<h2>
				${post.title}
			</h2>
			<p>
				${post.teaser}
			</p>
			<p>
				Last Updated:
				${post.lastUpdated}
			</p>
		</div>
		<g:link controller="post" action="edit" id="${post.id}"> Edit this post </g:link>  &nbsp;&nbsp;&nbsp;
		
		<g:link controller="post" action="view" id="${post.id}"> View this post </g:link> &nbsp;&nbsp;&nbsp;
		
		<g:link controller="comment" action="editComment" id="${post.id}"> Comment this post </g:link> &nbsp;&nbsp;&nbsp;
	</g:each>
	
	<br/><br/><br/><br/>
	<g:link controller="post" action="edit"> Create a new post </g:link> 
  </div>
</body>
</html>