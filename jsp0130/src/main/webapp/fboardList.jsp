<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판</title>
		<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse; }
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  div{width: 250px; height:60px; margin:12px auto 0;   }
		  button{display: inline-block; width:120px; height:40px; }
		  .material-symbols-outlined {
			  font-variation-settings:
			  'FILL' 0,
			  'wght' 200,
			  'GRAD' 0,
			  'opsz' 22
			}
		</style>
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
			<c:if test="${result=='success' }">
				<c:forEach items="${list}" var="bBean">
					<tr>
					  <td>${bBean.bno}</td>
					  <td>
						  <a href="fboardView.do?bno=${bBean.bno}">
						  	${bBean.btitle}</a> <c:if test="${bBean.bfile!=null }">
						  	<span class="material-symbols-outlined">folder_open</span></c:if>
						  
					  </td>
					  <td>${bBean.id}</td>
					  <td>
					    <fmt:formatDate value="${bBean.bdate}" pattern="yyyy-MM-dd"/>
					  </td>
					  <td>${bBean.bhit}</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${result=='fail'}">
				<tr>
				  <td colspan="5">데이터가 없습니다.</td>
				</tr>
			</c:if>
		</table>
		<div>
		  <a href="fboardWrite.do"><button type="button">글쓰기</button></a>
		  <a href="index.do"><button type="button">메인페이지</button></a>
		</div>
	</body>
</html>