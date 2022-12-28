<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login check</title>
	</head>
	<body>
	  <!-- session추가 -->
	  <%
	     String id = request.getParameter("id");
	     String pw = request.getParameter("pw");
	     String nicName = request.getParameter("nicName");
	     session.setAttribute("sessionId", id);
    	 session.setAttribute("sessionNname", nicName);
    	 response.sendRedirect("board_main.jsp");
	  %>
	  <!-- board_main.jsp -->
	
	</body>
</html>