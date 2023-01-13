<%@page import="com.java.www.MemberDto"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String id,pw,name,phone,gender,hobby="";
    String[] hobbys=null;
    
    // 페이지관련
    id = (String)session.getAttribute("sessionId");
    int tempPage=0; //index페이지로 이동
    
    if(request.getParameter("id")!=null){
    	id = request.getParameter("id");
    	tempPage=1; //전체페이지로 이동
    }
    
    MemberDao mdao = new MemberDao();
    MemberDto mdto = mdao.selectMemberOne(id);
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  h2{text-align: center; }
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  table{width:800px; margin:0 auto; }
		  th{width:200px; height:40px; }
		  td{height:40px; padding-left:20px; }
		  .btn{width:150px; height:30px; display:inline-block; }
		  div{width:320px; margin:0 auto;}
		</style>
		<script>
		  function modifyBtn(){
			  if($("#name").val().length<1){
				  alert("이름을 입력하셔야 됩니다.");
				  $("#name").focus();
				  return false;
			  }
			  
			  modifyFrm.submit();
		  }
		</script>
	</head>
	<body>
	  <h2>회원정보수정</h2>
	  <form action="DoModify" method="post" name="modifyFrm">
	  <input type="hidden" name="tempPage" value="<%=tempPage %>">
	  <table>
	    <tr>
	      <th>아이디</th>
	      <td><%=mdto.getId() %>
	         <input type="hidden" name="id" value="<%=mdto.getId() %>">
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드</th>
	      <td><input type="text" name="pw" id="pw"></td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td><input type="text" name="name" id="name" value="<%=mdto.getName() %>"></td>
	    </tr>
	    <tr>
	      <th>전화번호</th>
	      <td><input type="text" name="phone" id="phone" value="<%=mdto.getPhone() %>"></td>
	    </tr>
	    <tr>
	      <th>성별</th>
	      <td>
	        <input type="radio" name="gender" id="male" value="male" <% if(mdto.getGender().equals("male")) out.println("checked"); %>>
		    <label for="male">남성</label>
		    <input type="radio" name="gender" id="female" value="female" <% if(mdto.getGender().equals("female")) out.println("checked"); %>>
		    <label for="female">여성</label>
	      </td>
	    </tr>
	    <tr>
	      <th>취미</th>
	      <td>
	        <input type="checkbox" name="hobby" id="game" value="game" <% if(mdto.getHobby().contains("game")) out.println("checked"); %>>
		    <label for="game">게임</label>
		    <input type="checkbox" name="hobby" id="golf" value="golf" <% if(mdto.getHobby().contains("golf")) out.println("checked"); %>>
		    <label for="golf">골프</label>
		    <input type="checkbox" name="hobby" id="swim" value="swim" <% if(mdto.getHobby().contains("swim")) out.println("checked"); %>>
		    <label for="swim">수영</label>
		    <input type="checkbox" name="hobby" id="run" value="run" <% if(mdto.getHobby().contains("run")) out.println("checked"); %>>
		    <label for="run">조깅</label>
		    <input type="checkbox" name="hobby" id="book" value="book" <% if(mdto.getHobby().contains("book")) out.println("checked"); %>>
		    <label for="book">독서</label>
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2">
		      <div>
		      	<input type="button" class="btn" onclick="modifyBtn()" value="회원정보수정">
		      	<input type="button" class="btn" onclick="location.href='index.jsp'" value="취소">
		      </div>
	      </td>
	    </tr>
	  </table>
	  </form>
	
	</body>
</html>