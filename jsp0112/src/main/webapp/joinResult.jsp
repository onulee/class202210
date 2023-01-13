<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입완료</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  h2{text-align: center; }
		  div{border:1px solid black; width:500px; height:200px; margin:0 auto;
		    text-align: center; font-size: 30px; padding-top:50px; box-sizing: border-box;
		  }
		  button{display: block; width:200px; height:40px; margin:30px auto;}
		</style>
	</head>
	<body>
	  <h2>회원가입완료</h2>
	  <div>
	    회원가입이 완료되었습니다.<br>
	    감사합니다.
	  </div>
	  <%
	    int tempPage=0;
	    tempPage = Integer.parseInt(request.getParameter("tempPage"));
	    if(tempPage==0){
	  %>
    	<button onclick="location.href='index.jsp'">페이지 이동</button>
      <%}else{ %>	
    	<button onclick="location.href='memberAll.jsp'">페이지 이동</button>
      <%}%>
	
	</body>
</html>