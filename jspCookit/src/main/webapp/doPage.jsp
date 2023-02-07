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
	  
	    <%-- Member관련정보 시작 --%> 
	    <c:when test="${result=='s-login'}">
	      <script> //로그인페이지 
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
	    <c:when test="${result=='s-memberInsert'}">
	      <script> //회원가입페이지
	        //alert("회원가입이 완료되었습니다."); 
	        location.href="join03_success.jsp";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-memberInsert'}">
	      <script>
	        alert("시스템 오류로 인한 회원가입이 되지 않았습니다."); 
	        location.href="index.do";
	      </script>
	    </c:when>
	    <c:when test="${result=='s-memberUpdate'}">
	      <script> //회원정보수정
	        alert("회원수정이 완료되었습니다."); 
	        location.href="index.do";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-memberUpdate'}">
	      <script>
	        alert("시스템 오류로 인한 회원정보수정이 되지 않았습니다."); 
	        location.href="index.do";
	      </script>
	    </c:when>
	    <%-- Member관련정보 끝 --%>
	    
	    
	    <%-- Notice Board 관련정보 시작 --%>
	    <c:when test="${result=='s-boardUpdate'}">
	      <script> //게시글페이지
	        alert("게시글이 수정되었습니다."); 
	        location.href="notice_view.do?page=${page}&bno=${bno}";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-boardUpdate'}">
	      <script>
	        alert("시스템 오류로 인한 게시글 수정이 되지 않았습니다."); 
	        location.href="notice_list.do?page=${page}";
	      </script>
	    </c:when>
	    <c:when test="${result=='s-boardInsert'}">
	      <script> //게시글페이지
	        //alert("게시글이 등록되었습니다."); 
	        location.href="notice_list.do?page=${page}";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-boardInsert'}">
	      <script>
	        alert("시스템 오류로 인한 게시글 등록이 되지 않았습니다."); 
	        location.href="notice_list.do?page=${page}";
	      </script>
	    </c:when>
	    <c:when test="${result=='s-boardDelete'}">
	      <script> //게시글페이지
	        alert("게시글이 삭제되었습니다."); 
	        location.href="notice_list.do?page=${page}";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-boardDelete'}">
	      <script>
	        alert("시스템 오류로 인한 게시글 삭제가 되지 않았습니다."); 
	        location.href="notice_list.do?page=${page}";
	      </script>
	    </c:when>
	    <c:when test="${result=='s-boardUpdate'}">
	      <script> //게시글페이지
	        alert("게시글이 수정되었습니다."); 
	        location.href="notice_view.do?page=${page}&bno=${bno}";
	      </script>
	    </c:when>
	    <c:when test="${result=='f-boardUpdate'}">
	      <script>
	        alert("시스템 오류로 인한 게시글 수정이 되지 않았습니다."); 
	        location.href="notice_list.do?page=${page}";
	      </script>
	    </c:when>
	    <%-- Notice Board 관련정보 끝 --%>
	    
	  </c:choose>
	  
	  
	
	</body>
</html>