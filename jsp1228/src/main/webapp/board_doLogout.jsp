<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session Logout</title>
	</head>
	<body>
	  <%
	    session.invalidate();
	  %>
	  <script>
	    alert("로그아웃이 되었습니다.");
	    location.href="board_main.jsp";
	  </script>
	
	</body>
</html>