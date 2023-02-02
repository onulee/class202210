<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>페이지확인</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	</head>
	<body>
	  <c:choose>
	    <c:when test="${result=='s-login'}">
	      <script>
	        alert("로그인 되었습니다."); 
	        location.href="index.do";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-login'}">
	      <script>
	        alert("아이디 또는 패스워드가 일치하지 않습니다."); 
	        location.href="login.do";
	      </script>
	    </c:when>
	  </c:choose>
	  
	  
	
	</body>
</html>