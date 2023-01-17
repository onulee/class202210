<%@page import="com.java.www.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    BoardDao bdao = new BoardDao();
    ArrayList<BoardDto> list = bdao.boardSelectAll();
%> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  div{width: 250px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		<% if(session.getAttribute("sessionId")==null){ %>
		    <script>
		      alert("로그인을 하셔야 접근이 가능합니다.");
		      location.href="login.jsp";
		    </script>
		<%} %>    
	</head>
	<body>
		<h2>자유게시판</h2>
		<table>
		   <colgroup>
		     <col width="8%">
		     <col width="49%">
		     <col width="13%">
		     <col width="20%">
		     <col width="10%">
		   </colgroup>
			<tr>
			  <th>번호</th>
			  <th>제목</th>
			  <th>작성자</th>
			  <th>날짜</th>
			  <th>조회수</th>
			</tr>
			<% if(list.size()!=0){
			      for(int i=0;i<list.size();i++){	
			%>
				<tr>
				  <td><%=list.get(i).getBno() %></td>
				  <td><a href="fboardView.jsp?bno=<%=list.get(i).getBno() %>"><%=list.get(i).getBtitle() %></a></td>
				  <td><%=list.get(i).getBname() %></td>
				  <td><%=list.get(i).getBdate() %></td>
				  <td><%=list.get(i).getBhit() %></td>
				</tr>
			<% }
			  }else{ %>
				<tr>
				  <td colspan="5">데이터가 없습니다.</td>
				</tr>
			<%} %>
		</table>
		<div>
		  <a href="fboardWrite.jsp"><button type="button">글쓰기</button></a>
		  <button type="button" onclick="location.href='index.jsp'">메인페이지</button>
		</div>
	
	</body>
</html>