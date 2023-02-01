
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판 글쓰기</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  td{ text-align: left; padding-left:30px; }
		  input{width:575px; height:30px; }
		  div{width: 400px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		  #content{height:300px;}
		</style>
		<script>
		  function fboardBtn(){
			  if($("#btitle").val().length<2){
				  alert("제목을 두글자 이상 입력하셔야 합니다.");
				  $("#btitle").focus();
				  return;
			  }
			  
			  if(confirm("글쓰기를 저장하시겠습니까?")){
			    return fboardFrm.submit();
			  } 
		  }
		
		  function cancelBtn(){
			  if(confirm("글쓰기를 취소하시겠습니까?")) location.href="fboardList.do?page=${param.page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
		  }
		</script>
	</head>
	<body>
		<h2>자유게시판 글쓰기</h2>
		<form action="doFboardWrite.do" method="post" name="fboardFrm" enctype="multipart/form-data">
		<table>
		   <colgroup>
		     <col width="30%">
		     <col width="70%">
		   </colgroup>
		    <input type="hidden" name="page" value="${param.page}">
		    <input type="hidden" name="searchTitle" value="${searchTitle}">
		    <input type="hidden" name="searchWord" value="${searchWord}">
			<tr>
			  <th>제목</th>
			  <td><input type="text" name="btitle" id="btitle"></td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td><input type="text" name="id" id="id" value="aaa" readonly></td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td>
			    <textarea rows="20" cols="80" name="bcontent" id="bcontent"></textarea>
			  </td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td><input type="file" name="bfile" id="bfile"></td>
			</tr>
			
		</table>
		<div>
		  <button type="button" onclick="fboardBtn()">글쓰기</button>
		  <button type="button" onclick="cancelBtn()" >취소</button>
		</div>
		</form>
	
	</body>
</html>