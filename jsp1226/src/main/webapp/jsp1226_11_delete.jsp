<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie delete</title>
	</head>
	<body>
	<%
	  Cookie[] cookies = request.getCookies();
	  //쿠키 모두 삭제  
	  /* for(int i=0;i<cookies.length;i++){
		  cookies[i].setMaxAge(0);
		  response.addCookie(cookies[i]);
	  } */
	  
	  //특정 쿠키만 삭제
	  for(int i=0;i<cookies.length;i++){
		  //if(cookies[i].getName().equals("cookieId")){
			  cookies[i].setMaxAge(0);
			  response.addCookie(cookies[i]);
		  //}
	  }
	
	%>
	<button><a href="jsp1226_11_read.jsp">저장한 쿠키 읽기</a></button>
	
	</body>
</html>