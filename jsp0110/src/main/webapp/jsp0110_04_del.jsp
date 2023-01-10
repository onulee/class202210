<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
    Connection conn;
    Statement stmt;
    ResultSet rs;
    int no,result;
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>delete</title>
	</head>
	<body>
	  
	  <%
	    try{
	    	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(stmt!=null) rs.close();
	    		if(conn!=null) rs.close();
	    	}catch(Exception e2){
	    		e2.printStackTrace();
	    	}
	    }
	  
	  
	    no = Integer.parseInt(request.getParameter("no"));
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orauser","1111");
	    stmt = conn.createStatement();
	    String query ="delete board2 where no="+no;
	    // select-executeQuery,    insert,update,delete-executeUpdate
	    result = stmt.executeUpdate(query);
	  %>
	  <script>
	    alert("삭제되었습니다.");
	    location.href="jsp0110_04_select.jsp";
	  </script>
	
	</body>
</html>