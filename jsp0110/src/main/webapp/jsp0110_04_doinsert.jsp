<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Timestamp"%>
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
    String title,content,query;
    Timestamp bdate;
%> 
<%
  title = request.getParameter("title");
  content = request.getParameter("content");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파일 저장</title>
	</head>
	<body>
	<%
		try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orauser","1111");
			  stmt = conn.createStatement();
			  query = "insert into board2 values(board2_seq.nextval,'"+title+"','"+content+"',sysdate)";
			  result = stmt.executeUpdate(query);
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
	%>
	<script>
	  alert("저장이 완료되었습니다.");
	  location.href="jsp0110_04_insert.jsp";
	</script>
	</body>
</html>