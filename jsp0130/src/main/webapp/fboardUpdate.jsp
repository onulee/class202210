<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판 수정</title>
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
		  img{width:200px;}
		</style>
		<script>
		    function cancelBtn(){
		    	if(confirm("수정을 취소하시겠습니까?")) location.href="fboardList.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}";
		    }
		    function fboardBtn(){
		    	if($("#btitle").val().length<2){
		    		alert("제목은 2글자 이상이어야 수정이 가능합니다.");
		    		$("#btitle").focus();
		    		return
		    	}
		    	fboardFrm.submit();
		    }
		</script>
	</head>
	<body>
		<h2>자유게시판 수정</h2>
		<form action="doFboardUpdate.do" method="post" name="fboardFrm" enctype="multipart/form-data">
		<table>
		   <colgroup>
		     <col width="30%">
		     <col width="70%">
		   </colgroup>
		    <input type="hidden" name="bno" value="${bBean.bno}">
		    <input type="hidden" name="bOldFile" value="${bBean.bfile}">
		    <input type="hidden" name="page" value="${page}">
		    <input type="hidden" name="searchTitle" value="${searchTitle}">
		    <input type="hidden" name="searchWord" value="${searchWord}">
			<tr>
			  <th>제목</th>
			  <td><input type="text" name="btitle" id="btitle" value="${bBean.btitle}"></td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td>${bBean.id}</td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td>
			    <textarea rows="20" cols="80" name="bcontent" id="bcontent">${bBean.bcontent}</textarea>
			  </td>
			</tr>
			<tr>
			  <th>기존첨부파일</th>
			  <td>${bBean.bfile}</td>
			</tr>
			<tr>
			  <th>이미지</th>
			  <td><img src="upload/${bBean.bfile}"></td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td><input type="file" name="bfile" id="bfile"></td>
			</tr>
		</table>
		<div>
		  <button type="button" onclick="fboardBtn()">수정</button>
		  <button type="button" onclick="cancelBtn()">취소</button>
		</div>
		</form>
	
	</body>
</html>