<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>액션태그-param</title>
	</head>
	<body>
	   <% 
	     String id = request.getParameter("id");
	     String pw = request.getParameter("pw");
	   %>
	   
	   <h2>아이디 : <%= id %></h2>
	   <h2>패스워드 : <%= pw %></h2>
	
	</body>
</html>