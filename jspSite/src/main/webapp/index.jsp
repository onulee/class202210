<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
	</head>
	<body>
	  <c:if test="${update=='update' && result==1}">
		   <script>alert("회원정보수정이 완료되었습니다.")</script>
	  </c:if>
	  <c:if test="${sessionId == null }">
		  <h2>메인페이지</h2>
		  <h3>로그인을 해주세요.</h3>
		  <ul>
		    <li><a href="login.do">로그인</a></li>
		    <li><a href="join.do">회원가입</a></li>
		  </ul>
	  </c:if>
	  <c:if test="${sessionId != null }">
		  <h3>${sessionName}님 환영합니다.</h3>
		  <ul>
		    <li><a href="logout.do">로그아웃</a></li>
		    <li><a href="memberModify.do?id=${sessionId}">회원정보수정</a></li>
		    <li><a href="fboardList.do">게시판</a></li>
		    <c:if test="${sessionId == 'admin' }">
		    	<li><a href="memberAll.do">전체회원보기</a></li>
		    </c:if>
		  </ul>
	  </c:if>
	
	</body>
</html>