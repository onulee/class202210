<%@page import="com.java.www.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  MemberDao mdao = new MemberDao();
  ArrayList<MemberDto> list = mdao.selectMemberAll();
  MemberDto mdto = new MemberDto(); 
  String id,pw,name,phone,gender,hobby;
%>
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>전체회원리스트</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse; text-align: center;}
		  h2{text-align: center; }
		  table{width:900px; margin:20px auto;}
		  th,td{width:150px; height:40px; }
		  div{width:220px; margin:0 auto;}
		  button{width:100px; height:40px; }
		</style>
	</head>
	<body>
	  <h2>전체회원리스트</h2>
	  <table>
	    <tr>
	      <th>아이디</th>
	      <th>패스워드</th>
	      <th>이름</th>
	      <th>전화번호</th>
	      <th>성별</th>
	      <th>취미</th>
	    </tr>
	    <%  
		  for(int i=0;i<list.size();i++){
			  mdto = list.get(i);
			  id = mdto.getId();
			  pw = mdto.getPw();
			  name = mdto.getName();
			  phone = mdto.getPhone();
			  gender = mdto.getGender();
			  hobby = mdto.getHobby();
		%>	  
	    <tr>
	      <td><%=id%></td>
	      <td><%=pw%></td>
	      <td><%=name%></td>
	      <td><%=phone%></td>
	      <td><%=gender%></td>
	      <td><%=hobby%></td>
	    </tr>
		<%}%> 
	  </table>
	  <br>
	  <div>
		  <button onclick="location.href='index.jsp'">메인페이지</button>
		  <button>회원등록</button>
	  </div>
	</body>
</html>