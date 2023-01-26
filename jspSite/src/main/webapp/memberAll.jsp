<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
			<!-- for시작 -->
			<c:if test="${list != null}">
				<c:forEach items="${list}" var="mdto">
					<tr>
					  <td>${mdto.id}</td>
					  <td>${mdto.pw}</td>
					  <td>${mdto.name}</td>
					  <td>${mdto.phone}</td>
					  <td>${mdto.gender}</td>
					  <td>${mdto.hobby}</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${list==null}">
				<tr>
				  <td colspan="6">데이터가 없습니다.</td>
				</tr>
			</c:if>
			<!-- for끝 -->
		</table>
		<div>
		  <button type="button" onclick="location.href='join.do'">회원등록</button>
		  <button type="button" onclick="location.href='index.jsp'">메인페이지</button>
		</div>
	
	</body>
</html>