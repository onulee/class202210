<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>join</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:755px; margin: 0 auto; }
		  th{width:150px; height:40px;}
		  td{width:600px; height:40px; padding-left:10px; }
		  div{height:60px; width: 250px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		  #checkId{width:100px; height:30px;}
		</style>
		<script>
		  function joinBtn(){
			  var pw = $("#pw").val();
			  var pw2 = $("#pw2").val();
			  if(pw!=pw2){
				  alert("패스워드가 일치하지 않습니다. 다시 입력하세요.");
				  $("#pw2").val("").focus();
				  return false;
			  }
			  joinFrm.submit();
		  }
		  
		  //중복확인 버튼
		  function checkBtn(){
			  id = $("#id").val();
			  alert(id);
			  $.ajax({
				 url:"DoCheckId",
				 type:"post",
				 data:{"id":id},
				 dataType:"json",//json,xml,html,text
				 success:function(data){
					 alert("성공");
					 console.log("넘어온 data : "+data);
				 },
				 error:function(){
					 alert("실패");
				 }
			  });
			  
			  
		  }
		</script>
	</head>
	<body>
	  <h2>회원가입</h2>
	  <form action="doJoin.do" name="joinFrm" method="post">
	  <table>
	    <tr>
	      <th>아이디</th>
	      <td>
	        <input type="text" name="id" id="id">
	        <button type="button" id="checkId" onclick="checkBtn()">중복확인</button>
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드</th>
	      <td>
	        <input type="text" name="pw" id="pw">
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드확인</th>
	      <td>
	        <input type="password" name="pw2" id="pw2">
	      </td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td>
	        <input type="text" name="name" id="name">
	      </td>
	    </tr>
	    <tr>
	      <th>전화번호</th>
	      <td>
	        <input type="text" name="phone" id="phone">
	      </td>
	    </tr>
	    <tr>
	      <th>성별</th>
	      <td>
	        <input type="radio" name="gender" id="male" value="male">
	        <label for="male">남성</label>
	        <input type="radio" name="gender" id="female" value="female">
	        <label for="female">여성</label>
	      </td>
	    </tr>
	    <tr>
	      <th>취미</th>
	      <td>
	        <input type="checkbox" name="hobby" id="game" value="game">
	        <label for="game">게임</label>
	        <input type="checkbox" name="hobby" id="golf" value="golf">
	        <label for="golf">골프</label>
	        <input type="checkbox" name="hobby" id="run" value="run">
	        <label for="run">조깅</label>
	        <input type="checkbox" name="hobby" id="swim" value="swim">
	        <label for="swim">수영</label>
	        <input type="checkbox" name="hobby" id="book" value="book">
	        <label for="book">독서</label>
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2">
	        <div>
	          <button type="button" onclick="joinBtn()">회원가입</button>
	          <button type="button" onclick="location.href='index.jsp'">취소</button>
	        </div>
	      </td>
	    </tr>
	  </table>
	  </form>
	
	</body>
</html>