<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적처리</title>
	</head>
	<body>
	  <h2>학생성적처리</h2>
	  <form action="jsp1229_03.jsp" method="post" name="frm">
	    <label>학번</label>
	    <input type="text" name="stuNum"><br>
	    <label>이름</label>
	    <input type="text" name="name"><br>
	    <label>국어</label>
	    <input type="text" name="kor"><br>
	    <label>영어</label>
	    <input type="text" name="eng"><br>
	    <label>수학</label>
	    <input type="text" name="math"><br>
	    <!-- <label>합계</label>
	    <input type="text" name="total"><br>
	    <label>평균</label>
	    <input type="text" name="avg"><br> -->
	    <br>
	    <input type="submit" value="저장">
	  </form>
	
	</body>
</html>