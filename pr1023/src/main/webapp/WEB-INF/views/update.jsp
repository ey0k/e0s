<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	div{
		margin: auto;
		width: 300px;
		margin-top: 100px;

	}
	hr{
		width: 300px;
		text-align: left;
		border: 1px solid black;
		outline: none;
	}
	input[type=text],input[type=password]{
		border: none;
	}
</style>
</head>
<body>
<form method="post" action="update_ok">
<input type="hidden" value="${bvo.id}" name="id">
	<div><input type="text" name="title" placeholder="title" value="${bvo.title}"> <p>
	<hr>
	<input type="text" name="name" placeholder="name" value="${bvo.name}"> <p>
	<hr>
	<textarea cols="40" rows="5" name="content" placeholder="content">${bvo.content}</textarea><p>
	<input type="password" name="pwd" placeholder="pwd"> 
	<hr>
	<input type="submit" value="수정">
	</div>
</form>
</body>
</html>