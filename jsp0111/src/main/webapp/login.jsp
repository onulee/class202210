<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
	</head>
	<body>
	  <h2>login</h2>
	  <form action="./DoLogin" method="post" name="login">
	    <label>아이디</label>
	    <input type="text" name="id" id="id"><br>
	    <label>패스워드</label>
	    <input type="password" name="pw" id="pw"><br>
	    <input type="submit" value="로그인">
	    
	  
	  </form>
	
	</body>
</html>