<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie read</title>
	</head>
	<body>
	  <%
	     Cookie[] cookies = request.getCookies();
         if(cookies != null){
		     for(int i=0;i<cookies.length;i++){
		    	 out.println("쿠키 저장변수명 : "+cookies[i].getName()+"<br>");
		    	 out.println("쿠키 저장변수값 : "+cookies[i].getValue()+"<br>");
		    	 out.println("쿠키 저장변수값 : "+cookies[i].getMaxAge()+"<br>");
		    	 out.println("<br>===============================<br>");
		     }
         }else{
        	 out.println("쿠키 데이터가 존재하지 않습니다.<br>");
         }
	  %>
	  <button><a href="jsp1226_11_delete.jsp">저장한 쿠키 삭제</a></button>
	
	</body>
</html>