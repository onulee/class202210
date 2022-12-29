<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>el</title>
	</head>
	<body>
	  <% String id="aaa"; %>
	  <h4>학번 : <%=request.getParameter("stuNum") %></h4>
	  <h4>이름 : <%=request.getParameter("name") %></h4>
	  <h4>나이 : <%=request.getParameter("age") %></h4>
	  <h4>학년 : <%=request.getParameter("grade") %></h4>
	  <h4>학년 : <%= 250+250 %></h4>
	  <hr>
	  <h4>${ param.stuNum }</h4>
	  <h4>${ param.name }</h4>
	  <h4>${ param.age }</h4>
	  <h4>${ param.grade }</h4>
	  <h4>${ 200+400 }</h4>
	  <hr>
	  <h2>id : <%= id %></h2>
	</body>
</html>