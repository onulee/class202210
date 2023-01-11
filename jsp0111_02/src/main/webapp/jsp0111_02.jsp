<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>select</title>
	</head>
	<body>
	<%
	   Connection conn=null;
	   PreparedStatement pstmt=null;
	   ResultSet rs=null;
	   String id,pw,name,phone;
	   try{
		   Context init = new InitialContext();
		   DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/Oracle18c");
		   conn = ds.getConnection();
		   String query="select * from member2";
		   pstmt = conn.prepareStatement(query);
		   rs = pstmt.executeQuery();
		   
		   while(rs.next()){
			   id = rs.getString("id");
			   pw = rs.getString("pw");
			   name = rs.getString("name");
			   phone = rs.getString("phone");
			   out.println("아이디 : "+id+",패스워드 : "+pw+",이름 : "+name+",전화번호 : "+phone+"<br>");
		   }
		   
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   try{
			   if(rs!=null) rs.close();
			   if(pstmt!=null) pstmt.close();
			   if(conn!=null) conn.close();
		   }catch(Exception e2){
			   e2.printStackTrace();
		   }
	   }
	
	
	%>
	
	</body>
</html>