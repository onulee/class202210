<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>logout</title>
	</head>
	<body>
	  <h2>로그아웃</h2>
	  <% session.invalidate(); %>
	  <script>
	    alert("로그아웃 되었습니다.");
	    location.href="index.jsp";
	  </script>
	
	</body>
</html>