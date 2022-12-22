<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <%
	  	for(int i=0;i<10;i++){
	        int ranNum = (int)((Math.random()*10))+1;  //1-10
	  		out.println("<h2>"+ranNum+"</h2>");
	  	}
	  %>
	
	</body>
</html>