<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>주류판매</title>
	</head>
	<body>
	   <% request.setCharacterEncoding("utf-8"); %>
	   <h2>당신의 나이 : <%=request.getParameter("age") %></h2>
	   <h2>당신의 이름 : <%=request.getParameter("name") %></h2>
	   <h2>무슨 종류의 주류를 구매하시겠습니까?</h2>
	   <form action="#">
	     <input type="radio" name="drink" id="soju" value="soju">
	     <label for="soju">소주</label>
	     <input type="radio" name="drink" id="beer" value="beer">
	     <label for="beer">맥주</label>
	     <input type="radio" name="drink" id="wine" value="wine">
	     <label for="wine">와인</label>
	   </form>
	
	</body>
</html>