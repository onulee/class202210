<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 로그인</title>
		<style>
		  a{text-decoration: none;}
		  a:link,a:visited,a:hover,a:active {color:#000; }
		</style>
	</head>
	<body>
	  
	  <h2>메인페이지</h2>
	  <ul>
	    <%
	      Cookie[] getCookie = request.getCookies();
	      int check=0;
	      if(getCookie != null){
	    	  for(int i=0;i<getCookie.length;i++){
	    		  if(getCookie[i].getName().equals("cookieId")){  //cookieId
	    			  check=1;
	    %> 
	    		    <!-- 로그인 후 -->
				    <h3>길동스 님 환영합니다.</h3>
				    <li>회원정보수정</li>
				    <li><a href="doNaver_logout.jsp">로그아웃</a></li>
	    	  <%	  
	    		  }//if
	    	  }//for
	          %>	  
	    <%}%>
	    
	    <%if(check == 0){%>	  
		    <!-- 로그인 전 -->
		    <h3>로그인을 하셔야 게시판 글쓰기가 가능합니다.</h3>
		    <li>회원가입</li>
		    <li><a href="naver_login.jsp">로그인</a></li>
	    <%}%>
	    <li>자유게시판</li>
	  </ul>
	
	</body>
</html>