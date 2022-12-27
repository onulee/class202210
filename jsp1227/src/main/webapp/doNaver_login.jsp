<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doNaver_login</title>
	</head>
	<body>
	  <%
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    
	    if(id.equals("admin") && pw.equals("1111")){
	    	// 쿠키 또는 섹션에 저장 (아이디,닉네임)
	    	Cookie loginCookie = new Cookie("cookieId",id);
	    	Cookie loginNicName = new Cookie("cookieNname","길동스");
	    	loginCookie.setMaxAge(60*60); //1시간
	    	loginNicName.setMaxAge(60*60); //1시간
	    	response.addCookie(loginCookie);
	    	response.addCookie(loginNicName);
	  %>
	       <script>
	          alert("로그인이 되었습니다.!"); 
	          location.href="jsp1227_01.jsp";
	       </script>
	  <%}else{%>  	
           <script>
	    	// 아이디 또는 패스워드가 틀릴경우
             alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인하세요.!!");
             location.href="naver_login.jsp";
           </script>	       
	   <%}%> 	
	
	</body>
</html>