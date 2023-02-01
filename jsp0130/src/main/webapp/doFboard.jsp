<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doFboardWrite.jsp</title>
	</head>
	<body>
	  <c:choose>
	    <c:when test="${result=='s-w'}">
	     <script>
	       alert("게시글이 저장되었습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='f-w'}">
	     <script>
	       alert("시스템 오류로 게시글 저장이 되지 않았습니다.");
	       location.href="fboardWrite.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='s-d'}">
	     <script>
	       alert("게시글이 삭제되었습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='f-d'}">
	     <script>
	       alert("시스템 오류로 게시글이 삭제되지 않았습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='s-r'}">
	     <script>
	       alert("답글이 등록되었습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='f-r'}">
	     <script>
	       alert("시스템 오류로 답글이 등록되지 않았습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='s-u'}">
	     <script>
	       alert("게시글이 수정되었습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    <c:when test="${result=='f-u'}">
	     <script>
	       alert("시스템 오류로 게시글이 수정되지 않았습니다.");
	       location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
	     </script>
	    </c:when>
	    
	    
	  </c:choose>
	</body>
</html>