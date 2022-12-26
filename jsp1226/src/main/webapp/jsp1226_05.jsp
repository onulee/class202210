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
	    <input type="text" name="name" id="name"><br>
	    <h4>좋아하는 색상을 선택하세요.</h4>
	    <input type="checkbox" name="colors" id="blue" value="blue">
	    <label for="blue">파랑</label>
	    <input type="checkbox" name="colors" id="red" value="red">
	    <label for="red">빨강</label>
	    <input type="checkbox" name="colors" id="yellow" value="yellow">
	    <label for="yellow">노랑</label>
	    <input type="checkbox" name="colors" id="green" value="green">
	    <label for="green">녹색</label>
	    <input type="checkbox" name="colors" id="pink" value="pink">
	    <label for="pink">핑크</label>
	    <h4>좋아하는 과일 1개만 선택하세요.</h4>
	    <input type="radio" name="fruit" id="apple" value="apple">
	    <label for="apple">사과</label>
	    <input type="radio" name="fruit" id="banana" value="banana">
	    <label for="banana">바나나</label>
	    <input type="radio" name="fruit" id="strawberry" value="strawberry">
	    <label for="strawberry">딸기</label>
	    <input type="radio" name="fruit" id="melon" value="melon">
	    <label for="melon">멜론</label>
	    <input type="radio" name="fruit" id="peach" value="peach">
	    <label for="peach">복숭아</label>
	    <h4>가고 싶은 나라를 선택하세요.</h4>
	    <select name="country">
	    	<option value="france">프랑스</option>
	    	<option value="italy">이탈리아</option>
	    	<option value="swiss">스위스</option>
	    	<option value="england">영국</option>
	    </select>
	    <br>
	    <input type="submit" value="전송">
	    <input type="reset" value="취소">
	    <br>
	  
	  
	  </form>
	
	</body>
</html>