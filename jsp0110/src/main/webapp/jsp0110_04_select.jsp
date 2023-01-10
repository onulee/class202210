<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    int no,result;
    String title,content;
    Timestamp bdate;
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>select</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  th,td{width:150px; height:40px;}
		  th:nth-child(3){width:250px;}
		  th:nth-child(4){width:250px;}
		  .del,.update{cursor: pointer;}
		</style>
		<script>
	        function delBtn(no){
	        	alert(no);
	        	if(confirm("정말 삭제하시겠습니까?")){
	        		location.href="jsp0110_04_del.jsp?no="+no;
	        	}else{
	        		return false;
	        	}
	        }
	        
	        function updateBtn(no){
	        	alert(no);
	        	location.href="jsp0110_04_update.jsp?no="+no;
	        }
		</script> 
	</head>
	<body>
	  <h2>게시판</h2>
	  <table>
	    <tr>
	      <th>번호</th>
	      <th>제목</th>
	      <th>내용</th>
	      <th>날짜</th>
	      <th>수정</th>
	      <th>삭제</th>
	    </tr>
	  <%
	    try{
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
		    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "orauser", "1111");
		    stmt = conn.createStatement();
		    String query = "select * from board2 order by no desc";
		    rs = stmt.executeQuery(query);
		    
		    while(rs.next()){
		      no = rs.getInt("no");
		      title = rs.getString("title");
		      content = rs.getString("content");
		      bdate = rs.getTimestamp("bdate");
	   %>	      
		    <tr>
		      <td><%=no %></td>
		      <td><%=title %></td>
		      <td><%=content %></td>
		      <td><%=bdate %></td>
		      <td class="update" onclick="updateBtn(<%=no %>)">수정</td>
		      <td class="del" onclick="delBtn(<%=no %>)">삭제</td>
		    </tr> 
		    
		    
	  <%	      
		    }  
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(stmt!=null) rs.close();
	    		if(conn!=null) rs.close();
	    	}catch(Exception e2){
	    		e2.printStackTrace();
	    	}
	    }
	   %> 
	  </table>
	  <br>
	  <button><a href="jsp0110_04_insert.jsp">글쓰기</a></button>
	</body>
</html>