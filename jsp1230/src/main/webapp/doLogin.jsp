<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<%
   session.setAttribute("sessionId", request.getParameter("id"));
   session.setAttribute("sessionNname", request.getParameter("nicName"));
   response.sendRedirect("main.jsp");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
		<script src="http://code.jquery.com/jquery-latest.min.js" ></script>
	</head>
	<body>
	
	</body>
</html>