<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	index page<br><br>
	
	<h3>get 방식</h3> 
	<form action="/root/my/result" method="get"> 
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="get 전송"><br>
	</form>
<hr>
	<h3>post 방식</h3>
	<form action="result" method="post">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="post 전송"><br>
	</form>
<hr>	
	<h3>DTO 방식</h3>
	<form action="dto" method="post">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="text" name="addr"><br>
		<input type="submit" value="dto 전송"><br>
	</form>
	
	<!-- result : 상대경로(맨 뒷부분만 변경), http://localhost:8085/root/my/result 
		 /result : 절대경로(포트번호 뒤부터 변경), http://localhost:8085/result (경로 오류)
		 → /root/my/result 로 해야 오류 안남
	-->
</body>
</html>