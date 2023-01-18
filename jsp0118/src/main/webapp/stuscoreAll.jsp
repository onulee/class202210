<%@page import="com.stu.www.StuscoreDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.stu.www.StuscoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    StuscoreDao sdao = new StuscoreDao();
    ArrayList<StuscoreDto> list = sdao.stuSelectAll();
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적 전체보기</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:1270px; margin: 0 auto; text-align: center; }
		  th,td{width:140px; height:40px;}
		  div{width: 500px; height:60px; margin:30px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		<script>
		  function rankBtn(){
			  if(confirm("등수처리를 진행할까요?")) location.href="DoRank";
		  }
		  
		  function gradeBtn(){
			  if(confirm("학점처리를 진행할까요?")) location.href="DoGrade";
		  }
		</script>
	</head>
	<body>
		<h2>학생성적 전체보기</h2>
		<table>
			<tr>
			  <th>학번</th>
			  <th>이름</th>
			  <th>국어</th>
			  <th>영어</th>
			  <th>수학</th>
			  <th>합계</th>
			  <th>평균</th>
			  <th>등수</th>
			  <th>학점</th>
			</tr>
			<% if(list.size()>0){
				for(int i=0;i<list.size();i++){ %>
			<tr>
			  <td><%=list.get(i).getStuno() %></td>
			  <td><%=list.get(i).getName() %></td>
			  <td><%=list.get(i).getKor() %></td>
			  <td><%=list.get(i).getEng() %></td>
			  <td><%=list.get(i).getMath() %></td>
			  <td><%=list.get(i).getTotal() %></td>
			  <td><%=list.get(i).getAvg() %></td>
			  <td><%=list.get(i).getRank() %></td>
			  <td>
			  <%
			    if(list.get(i).getGrade()==null){
			    	out.println("미처리");
			    }else{
			    	out.println(list.get(i).getGrade());
			    }
			  %>
			  </td>
			</tr>
			<%}}else{ %>
			<tr>
			  <td colspan="9">데이터가 없습니다.</td>
			</tr>
			<%} %>
		</table>
		<div>
		  <a href="stuWrite.jsp"><button type="button">학생성적등록</button></a>
		  <button type="button" onclick="rankBtn()">등수등록</button>
		  <button type="button" onclick="gradeBtn()">학점등록</button>
		  <button type="button" onclick="location.href='index.jsp'">메인페이지</button>
		</div>
	
	</body>
</html>