<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form</title>
		<!-- 필수!! 제이쿼리 링크 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		  $(function(){
			 $("#formBtn").click(function(){
				 alert("데이터를 전송합니다.")
				 frm.submit();
			 }); 
		  });
		</script>
	</head>
	<body>
	  <h2>회원가입</h2>
	  <!-- <form action="receiveForm.jsp" method="post" name="frm"> -->
	  <form action="formWrite.jsp" method="post" name="frm">
	     <label>이름</label>
	     <input type="text" name="name" id="name"><br>
	     <label>아이디</label>
	     <input type="text" name="id" id="id"><br>
	     <label>패스워드</label>
	     <input type="password" name="pw" id="pw"><br>
	     <label>패스워드확인</label>
	     <input type="text" name="pw2" id="pw2"><br>
	     <label>성별</label><br>
	     <input type="radio" name="gender" id="male" value="male" >
	     <label for="male">남자</label>
	     <input type="radio" name="gender" id="female" value="female" >
	     <label for="female">여자</label>
	     <br>
	     <label>취미</label><br>
	     <input type="checkbox" name="hobbys" id="golf" value="golf">
	     <label for="golf">골프</label>
	     <input type="checkbox" name="hobbys" id="game" value="game">
	     <label for="game">게임</label>
	     <input type="checkbox" name="hobbys" id="swim" value="swim">
	     <label for="swim">수영</label>
	     <input type="checkbox" name="hobbys" id="book" value="book">
	     <label for="book">독서</label>
	     <br>
	     <label>이메일</label>
	     <input type="text" name="email1" id="email1">@
	     <input type="text" name="email2" id="email2">
	     <select name="email3">
	       <option value="" selected>직접선택</option>
	       <option value="naver.com">네이버</option>
	       <option value="daum.net">다음</option>
	       <option value="gmail.com">지메일</option>
	       <option value="nate.com">네이트</option>
	     </select>
	     <br>
	     <br>
	     <input type="button" id="formBtn" onclick="formBtn()" value="전송">
	     <input type="reset" value="취소">
	  </form>
	</body>
</html>