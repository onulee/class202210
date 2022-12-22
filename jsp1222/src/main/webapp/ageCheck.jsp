<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>response</title>
	</head>
	<body>
	   <%
	      request.setCharacterEncoding("utf-8");
	      String name = URLEncoder.encode(request.getParameter("name"),"utf-8");
	      int age = Integer.parseInt(request.getParameter("age"));
	      
	      if(age>=18){
	   %> 
	      <script>
	        alert("당신은 성인입니다. 주류판매가 가능합니다.");
	        //location.href("pass.jsp");
	      </script>
	   <%
	      response.sendRedirect("pass.jsp?age="+age+"&name="+name); 
	      }else{
	   %>
	      <script>alert("당신은 미성년자입니다. 주류판매가 불가능합니다.");</script>	  	  
	   <% 
	      response.sendRedirect("ng.jsp");
	      }
	   %>
	
	</body>
</html>