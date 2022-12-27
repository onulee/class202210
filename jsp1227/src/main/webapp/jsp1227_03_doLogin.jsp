<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session addAttribute</title>
	</head>
	<body>
	   <%
	      String id = request.getParameter("id");
	      String pw = request.getParameter("pw");
	      
	      if(id.equals("admin") && pw.equals("1111")){
	    	  //session저장
	    	  session.setAttribute("sessionId", id);
	    	  session.setAttribute("sessionNname", "길동스");
	      %>
              <script>
	              alert("로그인이 되었습니다.");
	              location.href="jsp1227_03_main.jsp";
              </script>
	      <% }else{ %>
	          <script>
	              alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인하세요.");
	              location.href="jsp1227_03_login.jsp";
	          </script>
	      <% } %>
	
	</body>
</html>