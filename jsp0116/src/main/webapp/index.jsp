<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
	  <% if(session.getAttribute("sessionId")==null){ %>
	  <h2>메인페이지</h2>
	  <h3>로그인을 하셔야 글을 입력할 수 있습니다.</h3>
	  <ul>
	    <li><a href="login.jsp">로그인</a></li>
	    <li><a href="join.jsp">회원가입</a></li>
	  </ul>
	  <%}else{ %>
	  <h3><%=session.getAttribute("sessionName") %>님 환영합니다.</h3>
	  <ul>
	    <li><a href="logout.jsp">로그아웃</a></li>
	    <li><a href="freeboard.jsp">게시판</a></li>
	    <li>회원정보수정</li>
	    <li><a href="memberAll.jsp">전체회원보기</a></li>
	  </ul>
	  <%} %>
	
	</body>
</html>