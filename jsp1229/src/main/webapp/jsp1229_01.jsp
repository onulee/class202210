<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- id:참조변수명, class:객체위치, scope:사용범위  -->
<jsp:useBean id="student" class="com.java.ex.Student" scope="page" />    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean</title>
	</head>
	<body>
	    <!-- name:참조변수명, proerty:변수명, value:값 -->
		<jsp:setProperty name="student" property="stuNum" value="1" />
		<jsp:setProperty name="student" property="name" value="홍길동" />
		<jsp:setProperty name="student" property="age" value="20" />
		<jsp:setProperty name="student" property="grade" value="2" />
		<!-- name:참조변수명, property:변수명 -->
	    <p>학번 : <jsp:getProperty name="student" property="stuNum" /></p>
	    <p>이름 : <jsp:getProperty name="student" property="name" /></p>
	    <p>나이 : <jsp:getProperty name="student" property="age" /></p>
	    <p>학년 : <jsp:getProperty name="student" property="grade" /></p>
	
	</body>
</html>