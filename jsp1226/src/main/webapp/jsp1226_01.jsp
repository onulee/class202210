<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글쓰기</title>
	</head>
	<body>
	  <h2>게시판 입력</h2>
	  <form action="doWrite.jsp" method="post" name="boardFrm">
	    <label>제목</label>
	    <input type="text" name="title" id="title">
	    <br>
	    <label>날짜</label>
	    <input type="text" name="date" id="date">
	    <br>
	    <label>작성자</label>
	    <input type="text" name="writer" id="writer">
	    <br>
	    <label>내용</label>
	    <textarea name="content" rows="10" cols="40"></textarea>
	    <br>
	    <input type="submit" value="완료">
	    <input type="reset" value="취소">
	    <br>
	    
	  </form>
	
	</body>
</html>