<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
			<c:if test="${list != null}">
				<c:forEach items="${list}" var="fbdto">
					<tr>
					  <td>${fbdto.bno}</td>
					  <td><a href="fboardView.do?bno=${fbdto.bno}">${fbdto.btitle}</a>
					    <c:if test="${fbdto.bfile !=null}"> ▣</c:if>
					  </td>
					  <td>${fbdto.id}</td>
					  <td>${fbdto.bdate}</td>
					  <td>${fbdto.bhit}</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${list==null}">
				<tr><td colspan="5">데이터가 없습니다.</td></tr>
			</c:if>
		</table>
		<div>
		  <button type="button" onclick="writeBtn()">글쓰기</button></a>
		  <button type="button" onclick="location.href='index.do'">메인페이지</button>
		</div>
	
	</body>
</html>