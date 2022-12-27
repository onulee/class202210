<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doNaver_logout</title>
	</head>
	<body>
	  <%
	    Cookie[] getCookie = request.getCookies();
	    for(int i=0;i<getCookie.length;i++){
	    	if(getCookie[i].getName().equals("cookieId") || getCookie[i].getName().equals("cookieNname")){
	    		getCookie[i].setMaxAge(0);
	    		response.addCookie(getCookie[i]);
	    	}
	    }
	  %>
	  <script>
	    alert("로그아웃이 되었습니다.!!");
	    location.href="jsp1227_01.jsp";
	  </script>
	</body>
</html>