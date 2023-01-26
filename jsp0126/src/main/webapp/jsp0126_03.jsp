<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>dispatcher</title>
		<style>
		  table{width:920px; margin:50px auto;}
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th,td{width:150px; height:40px; text-align: center; }
		</style>
	</head>
	<body>
	  <table>
	    <tr>
	      <th>아이디</th>
	      <th>비밀번호</th>
	      <th>이름</th>
	      <th>전화번호</th>
	      <th>성별</th>
	      <th>취미</th>
	    </tr>
	    <c:forEach items="${list}" var="mdto">
		    <tr>
		      <td>${mdto.id }</td>
		      <td>${mdto.pw }</td>
		      <td>${mdto.name }</td>
		      <td>${mdto.phone }</td>
		      <td>${mdto.gender }</td>
		      <td>${mdto.hobby }</td>
		    </tr>
	    </c:forEach>
	  
	  </table>
	
	</body>
</html>