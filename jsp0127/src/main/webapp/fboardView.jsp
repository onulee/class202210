<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
		  td{ text-align: left; padding-left:30px; }
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
			  <td>${fbdto.btitle}</td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td>${fbdto.id}</td>
			</tr>
			<tr>
			  <th>날짜</th>
			  <td>${fbdto.bdate}</td>
			</tr>
			<tr>
			  <th>조회수</th>
			  <td>${fbdto.bhit}</td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td>${fbdto.bcontent}</td>
			</tr>
			<tr>
			  <th>파일명</th>
			  <td>${fbdto.bfile}</td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td><img src="upload/${fbdto.bfile}"> </td>
			</tr>
		</table>
		<div>
		  <button type="button" onclick="location.href='fboardList.do'">목록</button>
		  <button type="button" onclick="modifyBtn()">수정</button>
		  <button type="button" onclick="deleteBtn()">삭제</button>
		</div>
	
	</body>
</html>