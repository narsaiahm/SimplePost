<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="main"/>
<head>
      <title>Manage Post</title>
  </head>
<body>
  <div class="body">
  
  </div>
  
  <body>
  <h1>Edit your post</h1>
  <div id="validationerrors">
      <g:renderErrors bean="${post}"/>
  </div>
  <g:form controller="post" action="save">
      <g:hiddenField name="id" value="${post.id}"/>
      <dl>
          <dt>Post Title:</dt>
          <dd>
          <g:textField name="title" value="${post.title}" size="50"/>
          </dd>
          <dt>Post Teaser:</dt>
          <dd>
          <g:textArea name="teaser" value="${post.teaser}" cols="50"/>
          </dd>
          <dt>Post:</dt>
          <dd>
          <g:textArea name="content" value="${post.content}" rows="20" cols="50"/>
          </dd>
      </dl>
        <g:submitButton name="submit" value="Save"/>
  </g:form>
  </body>

<g:link controller="post" action="edit" id="${post.id}"> Edit this post </g:link> 

</html>