<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session invalidate</title>
	</head>
	<body>
	  <%
	    session.invalidate();
	    //session.removeAttribute("sessionId");
	    //session.removeAttribute("sessionNname");
	  %>
	  <script>
	     alert("로그아웃이 되었습니다.");
	     location.href="jsp1227_03_main.jsp";
	  </script>
	</body>
</html>