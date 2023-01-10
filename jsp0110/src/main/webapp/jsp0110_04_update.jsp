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
		<title>update</title>
	</head>
	<body>
	  <%
		    try{
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
		        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "orauser", "1111");
		        stmt = conn.createStatement();
		        no = Integer.parseInt(request.getParameter("no"));
		        String query = "select * from board2 where no="+no;
		        rs = stmt.executeQuery(query);
		        while(rs.next()){
		        	title = rs.getString("title");
		        	content = rs.getString("content");
		        }
		        
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
	  <h2>게시글 수정</h2>
	  <form action="jsp0110_04_doupdate.jsp" name="frm">
	    <label>제목</label>
	    <input type="hidden" name="no" value="<%= no %>">
	    <input type="text" name="title" id="title" value="<%=title %>"><br>
	    <label>내용</label>
	    <input type="text" name="content" id="content" value="<%=content %>"><br>
	    <input type="submit" value="전송">
	  </form>
	 
	  
	</body>
</html>