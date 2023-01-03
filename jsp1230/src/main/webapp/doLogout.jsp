<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
		<script src="http://code.jquery.com/jquery-latest.min.js" ></script>
	    <%
		   session.invalidate();
		%>
		<script>
		   alert("로그아웃 되었습니다.");
		   location.href="main.jsp";
		</script>
	</head>
	<body>
	
	</body>
</html>