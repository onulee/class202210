<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>html1229_01.html 정규표현식</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script> 
		<script>
		  function frmChk(){
			  var chkNum = /^[0-9]{1,11}$/;  // 숫자0-9까지 1자리에서 5자리까지만 가능
			  var chkAlpha = /^[a-zA-Z]+$/;  // 영문자만 가능
			  var chkId = /^[A-Z]{1}[a-zA-Z0-9]{2,9}$/;
			  var chkKor = /^[ㄱ-ㅎㅏ-ㅣ가-힣\s]{3,}$/;  // 국문 3자리 이상 \s 빈공백가능
			  var chkPass = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>?]).{4,12}$/;
			  var chkMemo = /apple/i;  // apple 대소문자 구분없이 검색
			  var chkTel = /010|011|017/;
			  
			  /* //id입력체크
			  alert($("#id").val());
			  var id=$("#id").val();
			  if(!chkAlpha.test(id)){
				  alert("영문자만 입력이 가능합니다!!");
				  $("#id").focus();
			  }else{
				  alert("정상입니다.");
			  }//id체크 */
			  
			  /* alert($("#tel").val());
			  var tel = $("#tel").val();
			  if(!chkNum.test(tel)){
				  alert("숫자만 입력이 가능합니다.");
				  $("#tel").focus();
			  }else{
				  alert("정상입니다.");
			  } */
			  
			  alert($("#tel").val());
			  var tel = $("#tel").val();
			  if(!chkTel.test(tel)){
				  alert("숫자만 입력이 가능합니다.");
				  $("#tel").focus();
			  }else{
				  alert("정상입니다.");
			  } 
			  
			  /* // 이름체크-한글처리
			  var name = $("#name").val()
			  alert(name);
			  if(!chkKor.test(name)){
				  alert("한글만 입력이 가능합니다.");
				  $("#name").focus();
			  }else{
				  alert("정상입니다.");
			  } */
			  
			  /* // 패스워드 체크
			  var pw = $("#pw").val()
			  alert(pw);
			  if(!chkPass.test(pw)){
				  alert("영문소문자,영문대문자,숫자,특수문자가 1개이상 입력을 해야 합니다.");
				  $("#pw").focus();
			  }else{
				  alert("정상입니다.");
			  } */
			  
			  /* //id체크 첫글자 대문자
			  var id = $("#id").val();
			  alert(id);
			  if(!chkId.test(id)){
				  alert("첫글자는 영문대문자를 입력하셔야 합니다.");
				  $("#id").focus();
			  }else{
				  alert("정상입니다.");
			  } */
			  
			  /* //Apple,apple,APPLE 대소문자 구분없이 입력가능
			  var memo = $("#memo").val();
			  alert(memo);
			  if(!chkMemo.test(memo)){
				  alert("apple 을 입력하세요.");
				  $("#memo").focus();
			  }else{
				  alert("정상입니다.");
			  } */
		  }
		
		</script>
	</head>
	<body>
	  <h2>회원가입</h2>
	  <form action="">
	    <label>아이디</label>
	    <input type="text" name="id" id="id"><br>
	    <label>패스워드</label>
	    <input type="text" name="pw" id="pw"><br>
	    <label>이름</label>
	    <input type="text" name="name" id="name"><br>
	    <label>전화번호</label>
	    <input type="text" name="tel" id="tel"><span>-빼고 숫자만 입력하세요.</span><br>
	    <label>메모</label>
	    <input type="text" name="memo" id="memo"><span>대소문자 구분이 없습니다.</span><br>
	    
	    
	    
	    <button type="button" onclick="frmChk()" >표현식체크</button>
	  </form>
	
	</body>
</html>