<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>구구단</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th,td{width:150px; height:40px; text-align: center; }
		</style>
	</head>
	<body>
	   <h2>구구단</h2>
	   <table>
	     <tr>
	        <th>숫자</th>
	        <th>*</th>
	        <th>숫자</th>
	        <th>=</th>
	        <th>결과값</th>
	     </tr>
	     
	     <%
	       int i=2;
	       for(i=2;i<=9;i++){
	    	   for(int j=1;j<=9;j++){
	     %>
		     <tr>
		        <td><%=i %></td>
		        <td>*</td>
		        <td><%=j %></td>
		        <td>=</td>
		        <td><%=i*j %></td>
		     </tr>
	     <%
	    	   }
	       }
	     %>
	     
	     <script>
	        alert("i의 값 : "+<%=i %>);
	     </script>
	   </table>
	
	</body>
</html>