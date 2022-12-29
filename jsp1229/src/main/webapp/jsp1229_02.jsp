<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<jsp:useBean id="student" class="com.java.ex.Student" scope="page" />    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>bean</title>
	</head>
	<body>
	  <%-- <jsp:setProperty name="student" property="*"/> --%>
	  <jsp:setProperty name="student" property="stuNum" value='<%= Integer.parseInt(request.getParameter("stuNum")) %>' />
	  <jsp:setProperty name="student" property="name" value='<%=request.getParameter("name") %>' />
	  <jsp:setProperty name="student" property="age" value='<%= Integer.parseInt(request.getParameter("age")) %>' />
	  <jsp:setProperty name="student" property="grade" value='<%= Integer.parseInt(request.getParameter("grade")) %>' />
	  <p>학번 : <jsp:getProperty property="stuNum" name="student"/></p>
	  <p>이름 : <jsp:getProperty property="name" name="student"/></p>
	  <p>나이 : <jsp:getProperty property="age" name="student"/></p>
	  <p>학년 : <jsp:getProperty property="grade" name="student"/></p>
	  <p>request : <%=request.getParameter("name") %></p>
	</body>
</html>