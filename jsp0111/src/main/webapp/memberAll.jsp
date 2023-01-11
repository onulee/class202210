<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
    Connection conn=null;
    Statement stmt = null;
    ResultSet rs = null;
    String id,pw,name,phone,gender,hobby;
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto;}
		  th,td{width:150px; height:40px; text-align: center;}
		</style>
	</head>
	<body>
	  <h2><a href="index.jsp">전체회원정보</a></h2>  
	  <table>
	    <tr>
	      <th>아이디</th>
	      <th>패스워드</th>
	      <th>이름</th>
	      <th>전화번호</th>
	      <th>성별</th>
	      <th>취미</th>
	    </tr>
	   
	  
		<%
		  try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "orauser", "1111");
			  stmt = conn.createStatement();
			  String query = "select * from member";
			  rs = stmt.executeQuery(query); 
			  
			  while(rs.next()){
				  id = rs.getString("id");
				  pw = rs.getString("pw");
				  name = rs.getString("name");
				  phone = rs.getString("phone");
				  gender = rs.getString("gender");
				  hobby = rs.getString("hobby");
			 
		%>   	  
		<tr>
	      <td><%=id %></td>
	      <td><%=pw %></td>
	      <td><%=name %></td>
	      <td><%=phone %></td>
	      <td><%=gender %></td>
	      <td><%=hobby %></td>
	    </tr>  
		<%
			  }
		  }catch(Exception e){
			  e.printStackTrace();
		  }finally{
			  try{
				  if(rs!=null) rs.close();
				  if(stmt!=null) stmt.close();
				  if(conn!=null) conn.close();
			  }catch(Exception e2){
				  e2.printStackTrace();
			  }
		  }
		%>
	</table>
	</body>
</html>