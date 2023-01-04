<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
		<script src="http://code.jquery.com/jquery-latest.min.js" ></script>
	</head>
	<body>
	   <script>
	      alert('request.getParameter("id")');
	   </script>
	   <% 
	     String id = request.getParameter("id");
	     String nicName = request.getParameter("nicName");
	     
	     session.setAttribute("sessionId", id);
	     session.setAttribute("snicName", nicName);
	     response.sendRedirect("main.jsp");
	   %>
	
	</body>
</html>