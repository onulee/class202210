<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset="UTF-8">
		<title>jsp form</title>
	</head>
	<body>
	   <h2>회원정보</h2>
	   <form action="s05" method="post" name="frm">
	     <label>이름</label>
	     <input type="text" name="name" id="name"><br>
	     <label>아이디</label>
	     <input type="text" name="id" id="id"><br>
	     <label>패스워드</label>
	     <input type="password" name="pw" id="pw"><br>
	     <label>성별</label><br>
	     <input type="radio" name="gender" id="male" value="male">
	     <label for="male">남자</label>
	     <input type="radio" name="gender" id="female" value="female">
	     <label for="female">여자</label>
	     <br>
	     <label>취미</label><br>
	     <input type="checkbox" name="hobbys" id="game" value="game">
	     <label for="game">게임</label>
	     <input type="checkbox" name="hobbys" id="golf" value="golf">
	     <label for="golf">골프</label>
	     <input type="checkbox" name="hobbys" id="swim" value="swim">
	     <label for="swim">수영</label>
	     <input type="checkbox" name="hobbys" id="book" value="book">
	     <label for="book">독서</label>
	     <br>
	     <select name="grade">
	        <option value="1">1학년</option>
	        <option value="2">2학년</option>
	        <option value="3">3학년</option>
	        <option value="4">4학년</option>
	     </select>
	     <br>
	     <br>
	     <input type="submit" value="전송">
	     <input type="reset" value="취소">
	     <br>
	     <br>
	   
	   </form>
		
	</body>
</html>