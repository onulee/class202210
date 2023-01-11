<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>insert</title>
	</head>
	<body>
	   <h2>회원가입</h2>
	   <form action="./Jsp0111_do" method="post" name="insert">
	     <label>아이디</label>
	     <input type="text" name="id" ><br>
	     <label>패스워드</label>
	     <input type="text" name="pw" ><br>
	     <label>이름</label>
	     <input type="text" name="name" ><br>
	     <label>전화번호</label>
	     <input type="text" name="phone" ><br>
	     <input type="submit" value="회원가입"><br>
	   </form>
	
	</body>
</html>