<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>checkbox radio</title>
	</head>
	<body>
	  <h2>원하는 것을 클릭하시오.</h2>
	  <form action="checkWrite.jsp">
	    <h4>이름을 입력하세요.</h4>
	    <input type="text" name="name" id="name" value="<%= request.getParameter("name") %>"><br>
	    <h4>좋아하는 색상을 선택하세요.</h4>
	    <input type="checkbox" name="colors" id="blue" value="blue" <%if(request.getParameter("color").contains("blue")) out.println("checked"); %>>
	    <label for="blue">파랑</label>
	    <input type="checkbox" name="colors" id="red" value="red" <%if(request.getParameter("color").contains("red")) out.println("checked"); %>>
	    <label for="red">빨강</label>
	    <input type="checkbox" name="colors" id="yellow" value="yellow" <%if(request.getParameter("color").contains("yellow")) out.println("checked"); %>>
	    <label for="yellow">노랑</label>
	    <input type="checkbox" name="colors" id="green" value="green" <%if(request.getParameter("color").contains("green")) out.println("checked"); %>>
	    <label for="green">녹색</label>
	    <input type="checkbox" name="colors" id="pink" value="pink" <%if(request.getParameter("color").contains("pink")) out.println("checked"); %>>
	    <label for="pink">핑크</label>
	    <h4>좋아하는 과일 1개만 선택하세요.</h4>
	    <input type="radio" name="fruit" id="apple" value="apple" <%if(request.getParameter("fruit").equals("apple")) out.println("checked");%> >
	    <label for="apple">사과</label>
	    <input type="radio" name="fruit" id="banana" value="banana" <%if(request.getParameter("fruit").equals("banana")) out.println("checked");%>>
	    <label for="banana">바나나</label>
	    <input type="radio" name="fruit" id="strawberry" value="strawberry" <%if(request.getParameter("fruit").equals("strawberry")) out.println("checked");%>>
	    <label for="strawberry">딸기</label>
	    <input type="radio" name="fruit" id="melon" value="melon" <%if(request.getParameter("fruit").equals("melon")) out.println("checked");%>>
	    <label for="melon">멜론</label>
	    <input type="radio" name="fruit" id="peach" value="peach" <%if(request.getParameter("fruit").equals("peach")) out.println("checked");%>>
	    <label for="peach">복숭아</label>
	    <h4>가고 싶은 나라를 선택하세요.</h4>
	    <select name="country">
	    	<option value="france" <%if(request.getParameter("country").equals("france")) out.println("selected");%> >프랑스</option>
	    	<option value="italy" <%if(request.getParameter("country").equals("italy")) out.println("selected");%>>이탈리아</option>
	    	<option value="swiss" <%if(request.getParameter("country").equals("swiss")) out.println("selected");%>>스위스</option>
	    	<option value="england" <%if(request.getParameter("country").equals("england")) out.println("selected");%>>영국</option>
	    </select>
	    <br>
	    <input type="submit" value="전송">
	    <input type="reset" value="취소">
	    <br>
	  </form>
	
	</body>
</html>