<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<% response.setStatus(200); //정상페이지임 %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error페이지</title>
		<style>
		  *{margin:0; padding:0;}
		  div,p {width:1200px; margin:50px auto;}
		  img{width:1200px;}
		  p{font-size:15px; }
		</style>
	</head>
	<body>
	  <div>
	    <a href="board_main.jsp"><img src="images/error500.jpg"></a>
	  </div>
	  <p><%= exception.getMessage() %></p>
	
	</body>
</html>