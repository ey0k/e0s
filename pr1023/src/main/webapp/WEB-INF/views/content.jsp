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
	<div>${bvo.title}<p>
	<hr>
	${bvo.name} <p>
	<hr>
	${bvo.content}<p>
	<hr>
	<a href="update?id=${bvo.id}">수정</a>
	<a href="delete?id=${bvo.id}">삭제</a>
	<a href="list">목록</a>
	</div>

</body>
</html>