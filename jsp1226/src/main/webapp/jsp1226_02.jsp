<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글수정</title>
	</head>
	<body>
	  <h2>게시판 수정</h2>
	  <form action="doWrite.jsp" method="post" name="boardFrm">
	    <label>제목</label>
	    <input type="text" name="title" id="title" value='<%=request.getParameter("title") %>'>
	    <br>
	    <label>날짜</label>
	    <input type="text" name="date" id="date" value='<%=request.getParameter("date") %>'>
	    <br>
	    <label>작성자</label>
	    <input type="text" name="writer" id="writer" value='<%=request.getParameter("writer") %>'>
	    <br>
	    <label>내용</label>
	    <textarea name="content" rows="10" cols="40"><%=request.getParameter("content") %></textarea>
	    <br>
	    <input type="submit" value="완료">
	    <input type="reset" value="취소">
	    <br>
	    
	  </form>
	
	</body>
</html>