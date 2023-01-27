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
		  table{width:1060px; margin: 0 auto; text-align: center; }
		  th,td{width:150px; height:40px;}
		  div{width: 250px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		<script>
		  function deleteBtn(id){
			  if(confirm(id+" 회원을 삭제하시겠습니까?"))
				 location.href="memberDelete.do?id="+id;  
		  }
		  
		  function modifyBtn(id){
			  if(confirm(id+" 회원을 수정하시겠습니까?"))
				  location.href="memberModify.do?id="+id;
		  }
		  
		</script>
	</head>
	<body>
		<c:if test="${update=='update' && result==1}">
		   <script>alert("회원정보수정이 완료되었습니다.")</script>
		</c:if>
	    <c:if test="${delete=='delete' && result==1}">
	      <script>
	        alert("삭제처리가 되었습니다.");
	      </script>
	    </c:if>
	    <c:if test="${sessionId != 'admin'}">
	      <script>
	        alert("관리자만 접근이 가능합니다.");
	        location.href="index.jsp";
	      </script>
	    </c:if>
		<h2>전체회원보기</h2>
		<table>
			<tr>
			  <th>아이디</th>
			  <th>패스워드</th>
			  <th>이름</th>
			  <th>전화번호</th>
			  <th>성별</th>
			  <th>취미</th>
			  <th>삭제</th>
			</tr>
			<!-- for시작 -->
			<c:if test="${list != null}">
				<c:forEach items="${list}" var="mdto">
					<tr>
					  <td>${mdto.id}</td>
					  <td>${mdto.pw}</td>
					  <td><button onclick="modifyBtn('${mdto.id}')">${mdto.name}</button></td>
					  <td>${mdto.phone}</td>
					  <td>${mdto.gender}</td>
					  <td>${mdto.hobby}</td>
					  <td><button onclick="deleteBtn('${mdto.id}')">삭제</button></td>
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