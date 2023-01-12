<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  div{width:400px; height:300px; border:1px solid black; margin:50px auto;
		      padding:30px;
		   }
		</style>
		<script>
		  function loginBtn(){
			  if($("#id").val().length<1){
				  alert("ID를 입력하셔야 합니다.");
				  $("#id").focus();
				  return false;
			  }
			  
			  loginFrm.submit();
		  }
		</script>
		
	</head>
	<body>
	  <div>
		  <h2>로그인</h2>
		  <form action="DoLogin" method="post" name="loginFrm">
		    <label>아이디</label>
		    <input type="text" name="id" id="id"><br>
		    <label>패스워드</label>
		    <input type="password" name="pw" id="pw"><br>
		    <input type="button" onclick="loginBtn()" value="로그인">
		  </form>
	  </div>
	
	</body>
</html>