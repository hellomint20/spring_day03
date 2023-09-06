<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	list page <br><br>
	
	<table border="1">
		<tr>
			<th>아이디</th> <th>비밀번호</th> <th>이름</th>
		</tr>
		<c:forEach var="d" items="${ list }">
			<tr>
				<td>${ d.id }</td>
				<td>${ d.pwd }</td>
				<td><a href="getInfo?id=${ d.id }">${ d.name }</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>