<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>액션태그-param</title>
	</head>
	<body>
	   <jsp:forward page="jsp1226_10_02.jsp">
	      <jsp:param name="id" value="aaa" />
	      <jsp:param name="pw" value="1111" />
	   </jsp:forward>
	
	</body>
</html>