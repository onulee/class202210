<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>뷰페이지</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  table{width:600px;}
		  th{width:180px; height:40px; }
		  td{width:420px; height:40px; }
		</style>
	</head>
	<body>
	  <h2>뷰페이지</h2>
	  <table>
	    <tr>
	      <th>제목</th>
	      <td><%=request.getParameter("title") %></td>
	    </tr>
	    <tr>
	      <th>작성자</th>
	      <td><%= request.getParameter("writer") %></td>
	    </tr>
	    <tr>
	      <th>작성일</th>
	      <td><%= request.getParameter("date") %></td>
	    </tr>
	    <tr>
	      <th>조회수</th>
	      <td>1</td>
	    </tr>
	    <tr>
	      <th>내용</th>
	      <td><%= request.getParameter("content") %></td>
	    </tr>
	  </table>
	  <br>
	  <script type="text/javascript">
	    function send_write(){
	    	alert("글쓰기 페이지 이동");
	    	location.href="jsp1226_01.jsp";
	    }
	  </script>
	  <form action="jsp1226_02.jsp">
	  <input type="hidden" name="title" value='<%=request.getParameter("title") %>'>
	  <input type="hidden" name="date" value='<%=request.getParameter("date") %>'>
	  <input type="hidden" name="writer" value='<%=request.getParameter("writer") %>'>
	  <input type="hidden" name="content" value='<%=request.getParameter("content") %>'>
	  <button type="button" onclick="javascript:location.href='jsp1226_01.jsp'">글쓰기</button>
	  <button type="submit">글수정</button>
	  </form>
	
	</body>
</html>