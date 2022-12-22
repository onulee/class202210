<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request</title>
		<style>
		  table,td{border:1px solid black; border-collapse: collapse;}
		  td{width:400px; height:40px;}
		  table{width:800px; margin:0 auto;}
		</style>
	</head>
	<body>
	  <h2>request 정보</h2>
	  <%
	    String name = request.getServerName();
	    int port = request.getServerPort();
	    String method = request.getMethod();
	    String protocol = request.getProtocol();
	    String context = request.getContextPath();
	    StringBuffer url = request.getRequestURL();
	    String uri = request.getRequestURI();
	    String ip = request.getRemoteAddr();
	  %>
	  
	  
	  <h2>파일명 : <%=uri.substring(context.length()) %> </h2>
	  <form>
	    <input type="hidden" name="ip" id="ip" value="<%=ip %>">
	  </form>
	  
	  
	  <table>
	    <tr>
	      <td>getServerName</td>
	      <td><%= name %></td>
	    </tr>
	    <tr>
	      <td>getServerPort</td>
	      <td><%= port %></td>
	    </tr>
	    <tr>
	      <td>getMethod</td>
	      <td><%= method %></td>
	    </tr>
	    <tr>
	      <td>getProtocol</td>
	      <td><%= protocol %></td>
	    </tr>
	    <tr>
	      <td>getContextPath</td>
	      <td><%= context %></td>
	    </tr>
	    <tr>
	      <td>getRequestURL</td>
	      <td><%= url %></td>
	    </tr>
	    <tr>
	      <td>getRequestURI</td>
	      <td><%= uri %></td>
	    </tr>
	    <tr>
	      <td>getRemoteAddr</td>
	      <td><%= ip %></td>
	    </tr>
	    
	  </table>
	  
	
	</body>
</html>