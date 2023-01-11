<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    String id,pw,name,phone,gender,hobby="";
%> 
<%
    try{
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orauser","1111");
        stmt = conn.createStatement();
        id = (String)(session.getAttribute("sessionId"));
        String query = "select * from member where id='"+id+"'";
        rs = stmt.executeQuery(query);
        while(rs.next()){
        	name = rs.getString("name");
        	phone = rs.getString("phone");
        	gender = rs.getString("gender");
        	hobby = rs.getString("hobby");
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
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
	</head>
	<body>
	  <h2>회원정보수정</h2>
	  <form action="./DoModify" method="post" name="join">
	    <label>아이디</label>
	    <input type="text" name="id" id="id" value="<%=id %>"><br>
	    <label>패스워드</label>
	    <input type="text" name="pw" id="pw"><br>
	    <label>이름</label>
	    <input type="text" name="name" id="name" value="<%= name%>"><br>
	    <label>전화번호</label>
	    <input type="text" name="phone" id="phone" value="<%= phone%>"><br>
	    <label>성별</label><br>
	    <input type="radio" name="gender" id="male" value="male" <%if(gender.equals("male")) out.println("checked"); %>>
	    <label for="male">남성</label>
	    <input type="radio" name="gender" id="female" value="female" <%if(gender.equals("female")) out.println("checked"); %>>
	    <label for="female">여성</label>
	    <br>
	    <label>취미</label><br>
	    <input type="checkbox" name="hobby" id="game" value="game" <%if(hobby.contains("game")) out.println("checked"); %>>
	    <label for="game">게임</label>
	    <input type="checkbox" name="hobby" id="golf" value="golf" <%if(hobby.contains("golf")) out.println("checked"); %>>
	    <label for="golf">골프</label>
	    <input type="checkbox" name="hobby" id="swim" value="swim" <%if(hobby.contains("swim")) out.println("checked"); %>>
	    <label for="swim">수영</label>
	    <input type="checkbox" name="hobby" id="run" value="run" <%if(hobby.contains("run")) out.println("checked"); %>>
	    <label for="run">조깅</label>
	    <input type="checkbox" name="hobby" id="book" value="book" <%if(hobby.contains("book")) out.println("checked"); %>>
	    <label for="book">독서</label>
	    <br>
	    <input type="submit" value="회원정보수정"><br>
	    
	  </form>
	
	</body>
</html>