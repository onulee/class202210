<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class="com.java.ex.Member" scope="page" />  
<jsp:setProperty name="member" property="*" />  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입정보</title>
	</head>
	<body>
	   <h2>회원가입정보</h2>
	   <table>
		   <tr>
		     <th>이름</th>
	     	 <td>${member.name}</td>
		   </tr>
		   <tr>
		     <th>아이디</th>
	     	 <td>${member.id}</td>
		   </tr> 
		   <tr>
		     <th>패스워드</th>
	     	 <td>${member.pw}</td>
		   </tr>
		   <tr>
		     <th>성별</th>
	     	 <td>${member.gender}</td>
		   </tr>
		   <tr>
		     <th>취미</th>
		     <%
		       String[] hobbys= request.getParameterValues("hobbys");
		       String hobby="";
		       for(int i=0;i<hobbys.length;i++){
		    	   if(i==0) hobby += hobbys[i];
		    	   else hobby +=","+hobbys[i];
		       }
		       member.setHobbys(hobby);
		     %>
	     	 <td>${ member.hobbys }</td>
		   </tr>
	     
	   </table>
	
	</body>
</html>