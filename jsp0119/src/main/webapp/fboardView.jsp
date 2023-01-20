<%@page import="com.java.www.FreeboardDto"%>
<%@page import="com.java.www.FreeboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int bno = Integer.parseInt(request.getParameter("bno"));
    FreeboardDao fdao = new FreeboardDao();
    FreeboardDto fdto = fdao.fboardSelectOne(bno);
%>
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
		<script>
		   function deleteBtn(){
			   if(confirm("게시글을 삭제하시겠습니까?")){
				   location.href="DoBoardDelete?bno=";
			   }
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
			  <td><%=fdto.getBtitle() %></td>
			</tr>
			<tr>
			  <th>작성자</th>
			  <td><%=fdto.getName() %></td>
			</tr>
			<tr>
			  <th>날짜</th>
			  <td><%=fdto.getBdate() %></td>
			</tr>
			<tr>
			  <th>조회수</th>
			  <td><%=fdto.getBhit() %></td>
			</tr>
			<tr id="content">
			  <th>내용</th>
			  <td><%=fdto.getBcontent() %></td>
			</tr>
			<tr>
			  <th>파일명</th>
			  <td><%if(fdto.getBfile()==null) out.println("파일없음"); else out.println(fdto.getBfile()); %></td>
			</tr>
			<tr>
			  <th>첨부파일</th>
			  <td>
			    <%if(fdto.getBfile()==null) out.println("파일없음"); else out.println("<img src='upload/"+fdto.getBfile()+"'>"); %>
			  </td>
			</tr>
		</table>
		<div>
		  <a href="fboardList.jsp"><button type="button">목록</button></a>
		  <a href="fboardUpdate.jsp?bno="><button type="button">수정</button></a>
		  <button type="button" onclick="deleteBtn()">삭제</button>
		</div>
	
	</body>
</html>