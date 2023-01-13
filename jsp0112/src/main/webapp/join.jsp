<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 페이지관련
    String id="";
    int tempPage=0; //index페이지로 이동
    
    if(session.getAttribute("sessionId")!=null){
    	tempPage=1; //전체페이지로 이동
    }
%>      
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  h2{text-align: center; }
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  table{width:800px; margin:0 auto; }
		  th{width:200px; height:40px; }
		  td{height:40px; padding-left:20px; }
		  #btn{width:150px; height:30px; display:block; margin:0 auto;}
		</style>
		<script>
		  function joinBtn(){
			  if($("#id").val().length<1){
				  alert("아이디를 입력하셔야 됩니다.");
				  $("#id").focus();
				  return false;
			  }
			  joinFrm.submit();
		  }
		  
		  function checkBtn(){
			  alert("test");
			  $.ajax({
				  url:"CheckIdMember",//servlet
				  type:"post",
				  data:{id:$("#id").val() },
				  dataType:"text", //json,html,text,xml
				  success:function(data){
					  alert("성공");
					  alert(data);
					  
				  },
				  error:function(){
					  alert("실패");
				  }
			  });//
		  }
		</script>
	</head>
	<body>
	  <h2>회원가입</h2>
	  <form action="DoJoin" method="post" name="joinFrm">
	  <input type="hidden" name="tempPage" id="tempPage" value="<%=tempPage %>">
	  <table>
	    <tr>
	      <th>아이디</th>
	      <td>
	        <input type="text" name="id" id="id"> 
	        <button type="button" onclick="checkBtn()">중복체크</button>
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드</th>
	      <td><input type="text" name="pw" id="pw"></td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td><input type="text" name="name" id="name"></td>
	    </tr>
	    <tr>
	      <th>전화번호</th>
	      <td><input type="text" name="phone" id="phone"></td>
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
		    <input type="checkbox" name="hobby" id="swim" value="swim">
		    <label for="swim">수영</label>
		    <input type="checkbox" name="hobby" id="run" value="run">
		    <label for="run">조깅</label>
		    <input type="checkbox" name="hobby" id="book" value="book">
		    <label for="book">독서</label>
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2"><input type="button" id="btn" onclick="joinBtn()" value="회원가입"></td>
	    </tr>
	  </table>
	  </form>
	
	</body>
</html>