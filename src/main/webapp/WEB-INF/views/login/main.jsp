<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	main page<br><br>
	
	id : ${ id }<br>
	session id : ${ sessionScope.id }<br>
	nick : ${ nick }<hr>
	<a href="logout">로그아웃</a>
</body>
</html>