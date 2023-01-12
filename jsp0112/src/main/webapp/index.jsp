<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
	  <h2>메인페이지</h2>
	  <% if(session.getAttribute("sessionId")==null){ %>
	  <h3>로그인을 해주세요.</h3>
	  <ul>
	    <li><a href="login.jsp">로그인</a></li>
	    <li><a href="join.jsp">회원가입</a></li>
	  <%}else{%>
	  <h3><%=session.getAttribute("sessionName") %>님 환영합니다.</h3>
	  <ul>
	    <li><a href="logout.jsp">로그아웃</a></li>
	    <li><a href="modify.jsp">회원정보수정</a></li>
	    <li>게시판</li>
	    <li><a href="memberAll.jsp">전체회원보기</a></li>
	  <%}%>
	  </ul>
	</body>
</html>