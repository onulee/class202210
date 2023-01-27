<%@page import="com.site.www.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<% MemberDto memdto = (MemberDto)request.getAttribute("mdto"); %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
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
		  .on{color:blue; }
		  .off{color:red; }
		  span{color:red; font-weight: 600;}
		</style>
		<script>
		   function modifyBtn(){
			   if($("input:checkbox[name=hobby]:checked").length<1){
				   alert("취미를 1개 이상 체크하셔야 가입이 가능합니다.");
				   return;
			   }
			   modifyFrm.submit();
		   }//modifyBtn
		</script>
	</head>
	<body>
	
	<c:if test="${update=='update' && result==0}">
	   <script>alert("비밀번호가 맞지 않아 회원정보수정이 되지 않았습니다. 다시 수정바랍니다.")</script>
	</c:if>
	
	  <h2>회원정보수정</h2>
	  <form action="memberDoModify.do" name="modifyFrm" method="post">
	  <table>
	    <tr>
	      <th>아이디</th>
	      <td>
	        <input type="text" name="id" id="id" value="${mdto.id}" readonly>
	        <br>
	        <span class="useTxt"></span>
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드</th>
	      <td>
	        <input type="text" name="pw" id="pw">
	      </td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td>
	        <input type="text" name="name" id="name" value="${mdto.name }">
	      </td>
	    </tr>
	    <tr>
	      <th>전화번호</th>
	      <td>
	        <input type="text" name="phone" id="phone" value="${mdto.phone }">
	      </td>
	    </tr>
	    <tr>
	      <th>성별</th>
	      <td>
	        <input type="radio" name="gender" id="male" value="male" <% if(memdto.getGender().equals("male")) out.println("checked"); %> >
	        <label for="male">남성</label>
	        <input type="radio" name="gender" id="female" value="female" <% if(memdto.getGender().equals("female")) out.println("checked"); %>>
	        <label for="female">여성</label>
	      </td>
	    </tr>
	    <tr>
	      <th>취미</th>
	      <td>
	        <input type="checkbox" name="hobby" id="game" value="game" <% if(memdto.getHobby().contains("game")) out.println("checked"); %>>
	        <label for="game">게임</label>
	        <input type="checkbox" name="hobby" id="golf" value="golf" <% if(memdto.getHobby().contains("golf")) out.println("checked"); %>>
	        <label for="golf">골프</label>
	        <input type="checkbox" name="hobby" id="run" value="run" <% if(memdto.getHobby().contains("run")) out.println("checked"); %>>
	        <label for="run">조깅</label>
	        <input type="checkbox" name="hobby" id="swim" value="swim" <% if(memdto.getHobby().contains("swim")) out.println("checked"); %>>
	        <label for="swim">수영</label>
	        <input type="checkbox" name="hobby" id="book" value="book" <% if(memdto.getHobby().contains("book")) out.println("checked"); %>>
	        <label for="book">독서</label>
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2">
	        <div>
	          <button type="button" onclick="modifyBtn()">회원수정</button>
	          <button type="button" onclick="location.href='memberAll.do'">취소</button>
	        </div>
	      </td>
	    </tr>
	  </table>
	  </form>
	
	</body>
</html>