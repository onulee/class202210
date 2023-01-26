<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request</title>
	</head>
	<body>
		<%
		  request.setAttribute("reqId", "aaa");
		
		  session.setAttribute("sessionId", "hong1");
		  
		  application.setAttribute("appId", "admin");
		  
		  //response.sendRedirect("jsp0126_02.jsp");
		  RequestDispatcher dispatcher = request.getRequestDispatcher("jsp0126_02.jsp");
		  dispatcher.forward(request,response);
		
		%>
	
	</body>
</html>