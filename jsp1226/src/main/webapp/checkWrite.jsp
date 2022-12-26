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
	      <th>좋아하는 색상</th>
	      <td>
		      <% String[] colors = request.getParameterValues("colors"); 
		         String color="";
		         for(int i=0;i<colors.length;i++){
		        	 if(i==0) color += colors[i];
		        	 else color += ","+colors[i];  
		         }
		         out.println(color);
		      %>
	      </td>
	    </tr>
	    <tr>
	      <th>좋아하는 과일</th>
	      <td><%= request.getParameter("fruit") %></td>
	    </tr>
	    <tr>
	      <th>가고 싶은 나라</th>
	      <td><%= request.getParameter("country") %></td>
	    </tr>
	  </table>
	  <br>
	  <script type="text/javascript">
	    function send_write(){
	    	alert("글쓰기 페이지 이동");
	    	location.href="jsp1226_05.jsp";
	    }
	  </script>
	  <form action="jsp1226_06.jsp">
	  <input type="hidden" name="name" value='<%=request.getParameter("name") %>'>
	  <input type="hidden" name="color" value='<%=color %>'>
	  <input type="hidden" name="fruit" value='<%=request.getParameter("fruit") %>'>
	  <input type="hidden" name="country" value='<%=request.getParameter("country") %>'>
	  <button type="button" onclick="javascript:location.href='jsp1226_01.jsp'">글쓰기</button>
	  <button type="submit">글수정</button>
	  </form>
	
	</body>
</html>