<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<jsp:useBean id="stuScore" class="com.java.ex.StuScore" scope="page" />      
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적처리</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  table{width:400px; margin: 0 auto;}
		  th,td{width:200px; height:40px;}
		</style>
	</head>
	<body>
	  <jsp:setProperty name="stuScore" property="*" />
	  <table>
	    <tr>
	      <th>학번</th>
	      <td><%= stuScore.getStuNum() %></td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td><%= stuScore.getName() %></td>
	    </tr>
	    <tr>
	      <th>국어</th>
	      <td><%= stuScore.getKor() %></td>
	    </tr>
	    <tr>
	      <th>영어</th>
	      <td><%= stuScore.getEng() %></td>
	    </tr>
	    <tr>
	      <th>수학</th>
	      <td><%= stuScore.getMath() %></td>
	    </tr>
	    <tr>
	      <th>합계</th>
	      <td>
	        <% stuScore.setTotal(stuScore.getKor()+stuScore.getEng()+stuScore.getMath()); %>
	        <%= stuScore.getTotal() %>
	      </td>
	    </tr>
	    <tr>
	      <th>평균</th>
	      <% stuScore.setAvg(stuScore.getTotal()/3.0); %>
	      <td><%= String.format("%.2f", stuScore.getAvg()) %></td>
	    </tr>
	  </table>
	
	</body>
</html>