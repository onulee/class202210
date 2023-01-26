<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>join</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:755px; margin: 0 auto; }
		  th{width:150px; height:40px;}
		  #t01{width:600px; height:200px; padding-left:10px; font-size:20px; text-align: center; }
		  td{width:600px; height:40px; padding-left:10px; font-size:20px; text-align: center; }
		  div{height:60px; width: 122px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		
	</head>
	<body>
	  <h2>회원가입완료</h2>
	  <table>
	    <tr>
	      <td id="t01">감사합니다.<br>회원가입이 완료되었습니다.</td>
	    </tr>
	    <tr>
	      <td>
	        <div>
	          <button type="button" onclick="location.href='index.jsp'">메인페이지</button>
	        </div>
	      </td>
	    </tr>
	  </table>
	
	</body>
</html>