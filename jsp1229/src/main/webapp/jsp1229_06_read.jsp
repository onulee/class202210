<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키읽기</title>
	</head>
	<body>
	  <%
	    //쿠키모두 읽어오기
	    Cookie[] cookies = request.getCookies();
	    if(cookies!=null){
	    	for(int i=0;i<cookies.length;i++){
	    		if(cookies[i].getName().equals("cookieId")){
	    			out.println("cookieId변수의 값 : "+cookies[i].getValue());
	    		}
	    	}
	    }
	  %>
	
	</body>
</html>