<%@page import="com.java.www.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  MemberDao mdao = new MemberDao();
  ArrayList<MemberDto> list = mdao.MemberAllselect();
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>전체회원보기</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{width:150px; height:40px;}
		  div{width: 250px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
	</head>
	<body>
		<h2>전체회원보기</h2>
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
			  if(list.size()!=0){
				  for(int i=0;i<list.size();i++){
			%>		  
				<tr>
				  <td><%=list.get(i).getId() %></td>
				  <td><%=list.get(i).getPw() %></td>
				  <td><%=list.get(i).getName() %></td>
				  <td><%=list.get(i).getPhone() %></td>
				  <td><%=list.get(i).getGender() %></td>
				  <td><%=list.get(i).getHobby() %></td>
				</tr>
			<%   }
			  }else{ %>
				<tr>
				  <td colspan="6">데이터가 없습니다.</td>
				</tr>
			<%} %>
		</table>
		<div>
		  <button type="button">회원등록</button>
		  <button type="button" onclick="location.href='index.jsp'">메인페이지</button>
		</div>
	
	</body>
</html>