<%@page import="com.java.ex.MemDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.ex.MemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적처리프로그램</title>
	</head>
	<body>
	<%
	   MemDao dao = new MemDao();
	   ArrayList<MemDto> list = dao.stuSelect();
	   
	   for(int i=0;i<list.size();i++){
		   MemDto dto = (MemDto)list.get(i);
		   out.println("학생번호 : "+dto.getStuno()+"<br>");
	   }
	   
	%>
	  
	
	</body>
</html>