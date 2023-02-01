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
		  div{width: 500px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		  #content{height:500px;}
		  img{width:500px;}
		</style>
		<script>
		   function deleteBtn(){
			   if(confirm("게시글을 삭제하시겠습니까?")) location.href="doFboardDelete.do?bno=${bBean.bno}&page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
		   }
		   function updateBtn(){
			   if(confirm("게시글을 수정하시겠습니까?")) location.href="fboardUpdate.do?bno=${bBean.bno}&page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
		   }
		</script>
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
			  <td>${bBean.btitle}</td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td>${bBean.id}</td>
			</tr>
			<tr>
			  <th>날짜</th>
			  <td>${bBean.bdate}</td>
			</tr>
			<tr>
			  <th>조회수</th>
			  <td>${bBean.bhit}</td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td>${bBean.bcontent}</td>
			</tr>
			<tr>
			  <th>파일명</th>
			  <td>
				  <c:if test="${bBean.bfile!=null}">
				    <a href="./upload/${bBean.bfile}" download>${bBean.bfile}</a>
				  </c:if>
				  <c:if test="${bBean.bfile==null}">파일없음</c:if>
			  </td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td>
			      <c:if test="${bBean.bfile!=null}">
				    <img src="./upload/${bBean.bfile}">
				  </c:if>
				  <c:if test="${bBean.bfile==null}">파일없음</c:if>
			  </td>
			</tr>
		</table>
		<div>
		  <a href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}"><button type="button">목록</button></a>
		  <a href="fboardReply.do?bno=${bBean.bno}&page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}"><button type="button">답변달기</button></a>
		  <button type="button" onclick="updateBtn()">수정</button>
		  <button type="button" onclick="deleteBtn()">삭제</button>
		</div>
	
	</body>
</html>