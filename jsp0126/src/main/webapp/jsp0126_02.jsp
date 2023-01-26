<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request</title>
	</head>
	<body>
	  <h2>request : <%= request.getAttribute("reqId") %></h2>
	  <h2>session : <%= session.getAttribute("sessionId") %></h2>
	  <h2>application : <%= application.getAttribute("appId") %></h2>
	  <hr>
	  <h2>${requestScope.reqId }</h2>
	  <h2>${sessionScope.sessionId }</h2>
	  <h2>${applicationScope.appId }</h2>
	  <hr>
	  <h2>${reqId }</h2>
	  <h2>${sessionId }</h2>
	  <h2>${appId }</h2>
	</body>
</html>