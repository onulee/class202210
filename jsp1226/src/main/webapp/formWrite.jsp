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
	      <th>이름</th>
	      <td><%=request.getParameter("name") %></td>
	    </tr>
	    <tr>
	      <th>아이디</th>
	      <td><%= request.getParameter("id") %></td>
	    </tr>
	    <tr>
	      <th>패스워드</th>
	      <td><%= request.getParameter("pw") %></td>
	    </tr>
	    <tr>
	      <th>성별</th>
	      <td><%= request.getParameter("gender") %></td>
	    </tr>
	    <tr>
	      <th>취미</th>
	      <td>
		      <% String[] hobbys = request.getParameterValues("hobbys"); 
		         String hobby="";
		         for(int i=0;i<hobbys.length;i++){
		        	 if(i==0) hobby += hobbys[i];
		        	 else hobby += ","+hobbys[i];  
		         }
		         out.println(hobby);
		      %>
	      </td>
	    </tr>
	    <tr>
	      <th>이메일1</th>
	      <td><%= request.getParameter("email1") %></td>
	    </tr>
	    <tr>
	      <th>이메일2</th>
	      <td><%= request.getParameter("email2") %></td>
	    </tr>
	    <tr>
	      <th>이메일3</th>
	      <td><%= request.getParameter("email3") %></td>
	    </tr>
	  </table>
	  <br>
	  <script type="text/javascript">
	    function send_write(){
	    	alert("글쓰기 페이지 이동");
	    	location.href="jsp1226_03.jsp";
	    }
	  </script>
	  <form action="jsp1226_04.jsp">
	  <input type="hidden" name="name" value='<%=request.getParameter("name") %>'>
	  <input type="hidden" name="id" value='<%=request.getParameter("id") %>'>
	  <input type="hidden" name="pw" value='<%=request.getParameter("pw") %>'>
	  <input type="hidden" name="gender" value='<%=request.getParameter("gender") %>'>
	  <input type="hidden" name="hobby" value='<%=hobby %>'>
	  <input type="hidden" name="email1" value='<%=request.getParameter("email1") %>'>
	  <input type="hidden" name="email2" value='<%=request.getParameter("email2") %>'>
	  <input type="hidden" name="email3" value='<%=request.getParameter("email3") %>'>
	  <button type="button" onclick="javascript:location.href='jsp1226_01.jsp'">글쓰기</button>
	  <button type="submit">글수정</button>
	  </form>
	
	</body>
</html>