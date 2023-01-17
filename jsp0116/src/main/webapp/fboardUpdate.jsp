<%@page import="com.java.www.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    BoardDao bdao = new BoardDao();
    int bno = Integer.parseInt(request.getParameter("bno"));
    BoardDto bdto = bdao.boardSelectOne(bno);
%>    
  
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
		</style>
		<script>
		  function fboardBtn(){
			  if($("#btitle").val()<1){
				  alert("제목을 입력하셔야 저장이 가능합니다.");
				  $("#btitle").focus();
				  return false;
			  }
			  fboardFrm.submit();
		  }//
		  
		  function cancelBtn(){
			  if(confirm("글쓰기를 취소하시겠습니까?")){
				  location.href="freeboard.jsp";
			  }
		  }//
		</script>
	</head>
	<body>
		<h2>자유게시판 수정</h2>
		<form action="DoFboardUpdate" method="post" name="fboardFrm" enctype="multipart/form-data">
		<table>
		   <colgroup>
		     <col width="30%">
		     <col width="70%">
		   </colgroup>
		    <input type="hidden" name="bno" value="<%=bdto.getBno() %>">
		    <input type="hidden" name="boldfile" value="<%=bdto.getBfile() %>">
			<tr>
			  <th>제목</th>
			  <td><input type="text" name="btitle" id="btitle" value="<%=bdto.getBtitle() %>"></td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td><input type="text" name="bname" id="bname" value="<%= session.getAttribute("sessionName")%>" readonly></td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td>
			    <textarea rows="20" cols="80" name="bcontent" id="bcontent"><%=bdto.getBcontent() %></textarea>
			  </td>
			</tr>
			<tr>
			  <th>기존첨부파일</th>
			  <td><%=bdto.getBfile() %></td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td><input type="file" name="bfile" id="bfile"></td>
			</tr>
		</table>
		<div>
		  <button type="button" onclick="fboardBtn()">수정</button>
		  <button type="button" onclick="cancelBtn()" >취소</button>
		</div>
		</form>
	
	</body>
</html>