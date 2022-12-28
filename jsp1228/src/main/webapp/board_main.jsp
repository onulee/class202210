<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %> 
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인페이지</title>
	</head>
	<body>
	  <h2>메인페이지</h2>
	  <% if(session.getAttribute("sessionId")==null){ %>
		<h4>로그인을 해주세요.</h4>
		<ul>
		  <li>회원가입</li>
		  <li><a href="board_login.jsp">로그인</a></li>
	  <%}else{ %>
	    <h4><%=session.getAttribute("sessionNname")%>님 환영합니다.</h4>
	    <ul>
		  <li>회원정보</li>
		  <li><a href="board_doLogout.jsp">로그아웃</a></li>
	      <li><a href="board_list.jsp">게시판</a></li>
	  <%} %>
	    <li><a href="board.jsp">링크페이지</a></li>
	    <li><a href="board_doLogin2.jsp">로그인테스트</a></li>
	  </ul>
	
	</body>
</html>