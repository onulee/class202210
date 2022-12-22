<%@page import="java.util.Arrays"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>getParameterNames</title>
		<style>
		  table,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	   <%
	      request.setCharacterEncoding("utf-8");
	      Enumeration e = request.getParameterNames();
	      while(e.hasMoreElements()){
	    	  String varName = e.nextElement().toString();
	    	  String[] varValue = request.getParameterValues(varName);
	   %> 	  
	    	<table>
	    	  <tr>
	    	    <td>변수이름(varName)</td>
	    	    <td><%=varName %></td>
	    	    <td>변수값(varValue)</td>
	    	    <td><%=Arrays.toString(varValue) %></td>
	    	  </tr>
	    	</table>  
	    	  
	   <%	  
	      }
	   %>
	
	</body>
</html>