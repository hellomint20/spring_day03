<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${ pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- 
<script type="text/javascript">
	function test(){ alert("test 클릭")}
	window.onload = () => {
		const btn = document.getElementById("btn")
		btn.addEventListener("click", test);
	}
</script>--%>
<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/test.js"></script>
<link href="${ contextPath }/css/test.css" rel="stylesheet">
</head>
<body>
	<h3>login page</h3>
	
	<button type="button" id="btn">클릭</button>
	<button type="button" onclick="test()">test클릭</button>
	<form action="login_chk" method="post">
		<input type="text" name="id"><br>
		<input type="text" name="pwd"><br>
		<input type="submit" value="로그인"><br>
	</form>
</body>
</html>