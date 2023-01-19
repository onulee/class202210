<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:355px; margin: 0 auto; }
		  th{width:150px; height:40px;}
		  td{width:400px; height:40px; padding-left:10px; }
		  div{height:60px; width: 250px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		<script>
		  function loginBtn(){
			  var id = $("#id").val();
			  var pw = $("#pw").val();
			  if(id.length<1){
				  alert("ID를 입력하세요.");
				  $("#id").focus();
				  return false;
			  }
			  loginFrm.submit();
		  }//
		</script>
	</head>
	<body>
	  <h2>로그인</h2>
	    <form action="DoLogin" name="loginFrm" method="post">
		    <table>
		      <tr>
		        <th>아이디</th>
		        <td>
		          <input type="text" name="id" id="id">
		        </td>
		      </tr>
		      <tr>
		        <th>패스워드</th>
		        <td>
		          <input type="text" name="pw" id="pw">
		        </td>
		      </tr>
		      <tr>
			        <td colspan="2">
			        	<div>
				          <button type="button" onclick="loginBtn()">로그인</button>
				          <button type="button" onclick="location.href='index.jsp'">취소</button>
			        	</div>
			        </td>
		      </tr>
		    </table>
	    </form>
	
	</body>
</html>