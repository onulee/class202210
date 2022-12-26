<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main페이지</title>
		<link rel="stylesheet" href="css/style1.css">
	</head>
	<body>
	  <div>
		  <h2>메인페이지</h2>
		  <!-- include 부분 -->
		     <%-- <%@ include file="main_top.jsp" %> --%>
		     <jsp:include page="main_top.jsp" />
		  <!-- include 부분 끝 -->
		  <h2>푸터내용이 들어갑니다.</h2>
		  <!-- 푸터 include -->
		     <%-- <%@ include file="main_footer.jsp" %> --%>
		     <jsp:include page="main_footer.jsp" />
		  <!-- 푸터 include 끝 -->
	  </div>
	  
	  
	  
	
	</body>
</html>