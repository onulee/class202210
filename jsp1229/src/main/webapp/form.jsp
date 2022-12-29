<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form</title>
	</head>
	<body>
	  <h2>학생정보입력</h2>
	  <form action="jsp1229_02.jsp" method="post" name="frm">
	    <label>학번</label>
	    <input type="text" name="stuNum"><br>
	    <label>이름</label>
	    <input type="text" name="name"><br>
	    <label>나이</label>
	    <input type="text" name="age"><br>
	    <label>학년</label>
	    <input type="text" name="grade"><br>
	    <br>
	    <input type="submit" value="전송"><br>
	  </form>
	
	</body>
</html>