<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session setAttribute</title>
	</head>
	<body>
	 <h2>sessionId,sessionNname 섹션 저장하기</h2>
	 <%
	    session.setAttribute("sessionId", "admin");
	    session.setAttribute("sessionNname", "gildongs길동스");

	    
	    /* Cookie cookie = new Cookie("cookieId","admin");
	    Cookie cookie2 = new Cookie("cookieNname","hong");
	    cookie.setMaxAge(60*30);
	    cookie2.setMaxAge(60*30);
	    response.addCookie(cookie);
	    response.addCookie(cookie2); */
	 %>
	 <br>
	 <button type="button"><a href="jsp1227_02_read.jsp">session 읽기</a></button>
	
	</body>
</html>