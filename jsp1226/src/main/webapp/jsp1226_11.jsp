<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <h2>쿠키 저장</h2>
	  <p>cookieId,cNicName 2개의 파일을 쿠키로 저장합니다.</p>
	  <%
	    // 2개 쿠키 생성
	    Cookie cookie = new Cookie("cookieId","aaa");  //name,value
	    Cookie cookie2 = new Cookie("cNicName","smile");  //name,value
	    cookie.setMaxAge(60*60); //60초*60분=1시간(3600)
	    cookie2.setMaxAge(60*60); //60초*60분=1시간(3600)
	    
	    response.addCookie(cookie);
	    response.addCookie(cookie2);
	  %>
	  <h2>cookie 시간 :  <%= cookie.getMaxAge() %> </h2>
	  
	  <button><a href="jsp1226_11_read.jsp">저장한 쿠키 읽기</a></button>
	
	</body>
</html>