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
    String title,content;
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doupdate</title>
	</head>
	<body>
	  <%
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "orauser", "1111");
	     stmt = conn.createStatement();
	     no = Integer.parseInt(request.getParameter("no"));
	     title = request.getParameter("title");
	     content = request.getParameter("content");
	     String query = "update board2 set title='"+title+"',content='"+content+"',bdate=sysdate where no="+no;
	     result = stmt.executeUpdate(query);
	  %>
	  <script>
	    alert("수정이 되었습니다.");
	    location.href="jsp0110_04_select.jsp";
	  </script>
	
	</body>
</html>