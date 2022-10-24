<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table{
		margin: auto;
		align: center;
		/* border: 1px solid black; */
		width: 600px;
		margin-top: 100px;
		border-collapse: collapse;
	}
	table td{
		text-align: center;
	}
	table #title{
		width: 300px;
		text-align: left;
	}
	tr:first-child th{
		border-bottom: 2px solid black;
		padding: 8px;
	}
	tr td{
		padding: 8px;
	}
</style>
</head>
<body>
<table>
	<tr>
		<th> 번호 </th>
		<th> 제목 </th>
		<th> 조회수 </th>
		<th> 작성일 </th>
	</tr>
<c:forEach items="${list}" var="bvo">
	<tr>
		<td> ${bvo.id} </td>
		<td id="title"> <a href="readnum?id=${bvo.id}">${bvo.title}</a></td>
		<td> ${bvo.readnum} </td>
		<td> ${bvo.writeday} </td>
	</tr>
</c:forEach>
	<tr>
		<td colspan="4" align="right">
		<a href="write">글쓰기</a>
		</td>
	</tr>
</table>

</body>
</html>