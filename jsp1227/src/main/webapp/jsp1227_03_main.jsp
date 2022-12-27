<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session main</title>
	</head>
	<body>
	   <h2>메인페이지</h2>
	   <ul>
	     <% if(session.getAttribute("sessionId") == null){ %>
		     <li>로그인을 하셔야 글 작성이 가능합니다.</li>
		     <li>회원가입</li>
		     <li><a href="jsp1227_03_login.jsp">로그인</a></li>
	     <%}else{%>
		     <li><%=session.getAttribute("sessionNname")%> 님 환영합니다.</li>
		     <li>회원정보수정</li>
		     <li><a href="jsp1227_03_doLogout.jsp">로그아웃</a></li>
	     <%}%>
	     <li>자유게시판</li>
	     <li>사용후기</li>
	   </ul>
	
	</body>
</html>