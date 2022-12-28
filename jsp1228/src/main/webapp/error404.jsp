<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error페이지</title>
		<style>
		  *{margin:0; padding:0;}
		  div{width:1200px; margin:50px auto;}
		</style>
	</head>
	<body>
	  <div>
	    <img src="images/error404.jpg" usemap="#linkPage">
	    <map name="linkPage">
	      <area shape="rect" coords="475,640,590,680" alt="home" href="board_main.jsp">
	      <area shape="rect" coords="600,640,720,680" alt="prev" href="javascript:history.back();">
	    </map>
	  </div>
	
	</body>
</html>