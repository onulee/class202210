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
	  <script>
		  
	  </script>
	  <!-- session추가 -->
	  <%
	     int[] data = null;
	     for(var mem:data){
	    	 
		 }//for
	     String id = request.getParameter("id");
	     String pw = request.getParameter("pw");
	     String nicName = request.getParameter("nicName");
	     session.setAttribute("sessionId", id);
    	 session.setAttribute("sessionNname", nicName);
	  %>
	  <!-- board_main.jsp -->
	
	</body>
</html>