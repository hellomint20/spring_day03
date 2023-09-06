<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	login page<br><br>
	
	<form action="login_chk" method="post">
		<input type="text" name="id"><br>
		<input type="text" name="pwd"><br>
		<input type="submit" value="로그인">
	</form>
	<a href="register">회원가입</a><br>
	<a href="list">모든 회원</a>
</body>
</html>