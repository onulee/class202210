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
	     <input type="text" name="name" id="name" value='<%=request.getParameter("name") %>'><br>
	     <label>아이디</label>
	     <input type="text" name="id" id="id" value='<%=request.getParameter("id") %>'><br>
	     <label>패스워드</label>
	     <input type="password" name="pw" id="pw" value='<%=request.getParameter("pw") %>'><br>
	     <label>패스워드확인</label>
	     <input type="text" name="pw2" id="pw2"><br>
	     <label>성별</label><br>
	     <input type="radio" name="gender" id="male" value="male" <% if(request.getParameter("gender").equals("male")) out.println("checked"); %> >
	     <label for="male">남자</label>
	     <input type="radio" name="gender" id="female" value="female" <% if(request.getParameter("gender").equals("female")) out.println("checked"); %>>
	     <label for="female">여자</label>
	     <br>
	     <label>취미</label><br>
	     <input type="checkbox" name="hobbys" id="golf" value="golf" <% if(request.getParameter("hobby").contains("golf")) out.println("checked"); %>>
	     <label for="golf">골프</label>                                           
	     <input type="checkbox" name="hobbys" id="game" value="game" <% if(request.getParameter("hobby").contains("game")) out.println("checked"); %>>
	     <label for="game">게임</label>
	     <input type="checkbox" name="hobbys" id="swim" value="swim" <% if(request.getParameter("hobby").contains("swim")) out.println("checked"); %>>
	     <label for="swim">수영</label>
	     <input type="checkbox" name="hobbys" id="book" value="book" <% if(request.getParameter("hobby").contains("book")) out.println("checked"); %>>
	     <label for="book">독서</label>
	     <br>
	     <label>이메일</label>
	     <input type="text" name="email1" id="email1" value='<%=request.getParameter("email1") %>'>@
	     <input type="text" name="email2" id="email2" value='<%=request.getParameter("email2") %>'>
	     <select name="email3">
	       <option value="" <% if(request.getParameter("email3").equals("")) out.println("selected"); %>>직접선택</option>
	       <option value="naver.com" <% if(request.getParameter("email3").equals("naver.com")) out.println("selected"); %>>네이버</option>
	       <option value="daum.net" <% if(request.getParameter("email3").equals("daum.net")) out.println("selected"); %>>다음</option>
	       <option value="gmail.com" <% if(request.getParameter("email3").equals("gmail.com")) out.println("selected"); %>>지메일</option>
	       <option value="nate.com" <% if(request.getParameter("email3").equals("nate.com")) out.println("selected"); %>>네이트</option>
	     </select>
	     <br>
	     <br>
	     <input type="button" id="formBtn" onclick="formBtn()" value="전송">
	     <input type="reset" value="취소">
	  </form>
	</body>
</html>