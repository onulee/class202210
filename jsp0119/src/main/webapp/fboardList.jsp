<%@page import="com.java.www.FreeboardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.FreeboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    FreeboardDao fdao = new FreeboardDao();
    ArrayList<FreeboardDto> list = fdao.fboardSelectAll();
%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  #menu{width: 250px; height:60px; margin:12px auto 0;  }
		  #searchFrm{width:500px; margin:30px auto 10px;}
		  #searchFrm select{width:100px; height:40px; }
		  input{height:35px; width:250px; }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		<script>
		  function searchBtn(){
			  var search = $("#search").val();
			  var searchWord = $("#searchWord").val();
			  console.log("검색부분 : "+search);
			  console.log("검색어 : "+searchWord);
			  $.ajax({
				  url:"DoSearch",
				  type:"post",
				  data:{"search":search,"searchWord":searchWord},
				  dataType:"json",
				  success:function(data){
					  alert("성공");
					  var htmlData="";
					  for(var dto of data){
						  htmlData += "<tr>";
						  htmlData += "<td>"+dto.bno+"</td>";
						  htmlData += "<td><a href='fboardView.jsp?bno="+dto.bno+"'>"+dto.btitle+"</a></td>";
						  htmlData += "<td>"+dto.name+"</td>";
						  htmlData += "<td>"+dto.bdate+"</td>";
						  htmlData += "<td>"+dto.bhit+"</td>";
						  htmlData += "</tr>";
					  }
					  
					  $("#tbody").html(htmlData);
				  },
				  error:function(){
					  alert("실패");
				  }
			  });
		  }//
		</script>
	</head>
	<body>
		<h2>자유게시판</h2>
		<div id="searchFrm">
		  <form action="" method="post" name="searchFrm">
		     <select name="search" id="search">
		       <option value="all">전체</option>
		       <option value="title">제목</option>
		       <option value="content">내용</option>
		     </select>
		     <input type="text" name="searchWord" id="searchWord">
		     <button type="button" onclick="searchBtn()">검색</button>
		  </form>
		</div>
		<table>
		   <colgroup>
		     <col width="8%">
		     <col width="49%">
		     <col width="13%">
		     <col width="20%">
		     <col width="10%">
		   </colgroup>
			<tr>
			  <th>번호</th>
			  <th>제목</th>
			  <th>작성자</th>
			  <th>날짜</th>
			  <th>조회수</th>
			</tr>
			<tbody id="tbody">
			  <%if(list.size()!=0){ 
			       for(int i=0;i<list.size();i++){ %>
				<tr>
				  <td><%=list.get(i).getBno() %></td>
				  <td><a href="fboardView.jsp?bno=<%=list.get(i).getBno()%>"><%=list.get(i).getBtitle() %></a></td>
				  <td><%=list.get(i).getName() %></td>
				  <td><%=list.get(i).getBdate() %></td>
				  <td><%=list.get(i).getBhit() %></td>
				</tr>
			  <%}}else{ %>	
				<tr>
				  <td colspan="5">데이터가 없습니다.</td>
				</tr>
			  <%} %>	
			</tbody>
		</table>
		<div id="menu">
		  <a href="fboardWrite.jsp"><button type="button">글쓰기</button></a>
		  <button type="button" onclick="location.href='index.jsp'">메인페이지</button>
		</div>
	
	</body>
</html>