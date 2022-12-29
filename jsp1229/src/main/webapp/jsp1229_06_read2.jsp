<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키읽기</title>
	</head>
	<body>
	  <h2>쿠키이름 : ${cookie.cookieId.name }</h2>
	  <h2>쿠키값 : ${cookie.cookieId.value }</h2>
	  <hr>
	  <h2>스크립트릿 세션1 : <%= session.getAttribute("administrator") %></h2>
	  <h2>스크립트릿 세션2 : <%= session.getAttribute("nicName") %></h2>
	  <h2>el 세션1 : ${sessionScope.administrator }</h2>
	  <h2>el 세션2 : ${sessionScope.nicName }</h2>
	  
	</body>
</html>