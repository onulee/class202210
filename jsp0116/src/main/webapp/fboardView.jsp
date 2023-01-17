<%@page import="com.java.www.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  BoardDao bdao = new BoardDao();
  request.setCharacterEncoding("utf-8");
  int bno = Integer.parseInt(request.getParameter("bno"));
  BoardDto bdto = bdao.boardSelectOne(bno); //해당 게시글 가져오기
%>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판 뷰페이지</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  div{width: 400px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		  #content{height:500px;}
		  img{width:500px;}
		</style>
	</head>
	<body>
		<h2>자유게시판 뷰페이지</h2>
		<table>
		   <colgroup>
		     <col width="30%">
		     <col width="70%">
		   </colgroup>
			<tr>
			  <th>제목</th>
			  <td><%=bdto.getBtitle() %></td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td><%=bdto.getBname() %></td>
			</tr>
			<tr>
			  <th>날짜</th>
			  <td><%=bdto.getBdate() %></td>
			</tr>
			<tr>
			  <th>조회수</th>
			  <td><%=bdto.getBhit() %></td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td><%=bdto.getBcontent() %></td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td><img src="./upload/<%=bdto.getBfile() %>"></td>
			</tr>
		</table>
		<div>
		  <a href="freeboard.jsp"><button type="button">목록</button></a>
		  <a href=""><button type="button">수정</button></a>
		  <a href=""><button type="button">삭제</button></a>
		</div>
	
	</body>
</html>