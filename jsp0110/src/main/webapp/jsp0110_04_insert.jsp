<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>insert</title>
	</head>
	<body>
	  <h2>게시글 작성</h2>
	  <form action="jsp0110_04_doinsert.jsp" name="frm" method="post">
	    <label>제목</label>
	    <input type="text" name="title" id="title"><br>
	    <label>내용</label>
	    <input type="text" name="content" id="content"><br>
	    <input type="submit" value="전송">
	  </form>
	 
	  
	</body>
</html>