<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th,td{width:150px; height:40px; font-size:20px;}
		</style>
	</head>
	<body>
	  <%
	     String[] data ={"010-1111-2222","010-2222-3333","010-3333-4444",
	    		 "010-4444-5555","010-4444-5555" };
	     String[] tel=null;
	  %>
	  
	  <h2><%=Arrays.toString(data) %></h2>
	  <table id="table">
	   
	    <% 
	        for(int i=0;i<5;i++){
	    	tel = data[i].split("-");  //split분리함수 -
	    %>
	    <tr>
	      <th>f_tel</th>
	      <td><%=tel[0] %></td>
	    </tr>
	    <tr>
	      <th>m_tel</th>
	      <td><%=tel[1] %></td>
	    </tr>
	    <tr>
	      <th>l_tel</th>
	      <td><%=tel[2] %></td>
	    </tr>
	    <% } %>
	  </table>
	
	</body>
</html>