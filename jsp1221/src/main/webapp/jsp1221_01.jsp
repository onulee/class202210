<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>팝업창</title>
		<!-- 필수!! 제이쿼리 링크 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		   function popup(){
			   //alert($("#id").val());
			   openWin = window.open("popup.html","popupHtml",
					   "width=600,height=400,resizable=no,scrollbars=no");
		   }
		   //자식창에서 부모창으로 데이터 전송
		   
		   //부모창에서 자식창으로 데이터 전송
		   function send(){
			   openWin.$("#pId").val($("#id").val());
		   }
		   
		   function checkBtn(){
			   location.href="join02_info_input.html";
		   }
		
		</script>
	</head>
	<body>
	   <h2>회원가입</h2>
	   <form action="s01" method="post" name="frm">
	     <label>아이디</label>
	     <input type="text" name="id" id="id" onclick="popup()" readonly>
	     <button type="button" onclick="popup()">아이디 중복확인</button>
	     <!-- <button type="button" onclick="send()">전송</button> -->
	     <br>
	     <label>아이디2</label>
	     <input type="text" name="id2" id="id2">
	     <br>
	     <label>패스워드</label>
	     <input type="password" name="pw" id="pw"><br>
	     <input type="button" onclick="checkBtn()" value="로그인">
	   </form>
	
	</body>
</html>