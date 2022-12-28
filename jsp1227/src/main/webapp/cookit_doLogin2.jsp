<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login Check</title>
	</head>
	<body>
	  <%
	     String id = request.getParameter("id");
	     String pw = request.getParameter("pw");
	     String nicName = request.getParameter("nicName");
	     session.setAttribute("sessionId", id);
    	 session.setAttribute("sessionNname", nicName);
    	 response.sendRedirect("cookit_main.jsp");
	  %>
	    
	</body>
</html>