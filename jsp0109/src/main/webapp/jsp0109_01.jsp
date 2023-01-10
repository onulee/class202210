<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>oracle 연결</title>
	</head>
	<body>
	 <%!
	   Connection conn;
	   Statement stmt;
	   ResultSet rs;
	   
	   String driver = "oracle.jdbc.driver.OracleDriver";
	   String url = "jdbc:oracle:thin:@localhost:1521:xe";
	   String uid = "orauser";
	   String upw = "1111";
	   String query = "select * from member";
	 %>
	 <%  
	   try{
		   Class.forName(driver); //OracleDriver로딩
		   conn = DriverManager.getConnection(url, uid, upw); //Connection객체생성
		   stmt = conn.createStatement();  //statement객체 sql실행
		   rs = stmt.executeQuery(query);  // sql구문 실행
		   
		   while(rs.next()){
			 String id = rs.getString("id");
			 String pw = rs.getString("pw");
			 String name = rs.getString("name");
			 String phone = rs.getString("phone");
			 
			 out.println("아이디 : "+id+",패스워드 : "+pw+",이름 : "+name+", 전화번호 : "+phone+"<br>");
			 
		   }
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   try{
				  if(rs != null) rs.close();
				  if(stmt != null) stmt.close();
				  if(conn != null) conn.close();
			  }catch(Exception e2){
				  e2.printStackTrace();
			} 
	   }
	 
	 %>
	
	</body>
</html>