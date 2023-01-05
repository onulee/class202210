<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% String data ="swim,game,book"; %>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js" ></script>
		<script>
		  function btn(){
			  //alert("test");
			  //alert($("input:checkbox[name=hobby]").length);
			  var checkData = "<%=data%>";
			  $("input:checkbox[name=hobby]").each(function(){
				     alert($(this).attr("value"));
				     if(checkData.includes($(this).attr("value"))==true){
				    	 this.checked = true;
				     }
			  });
		  }
		</script>
	</head>
	<body>
	  <!-- 버튼클릭시 data("golf,swim")에 포함되어 있는 값에 해당되는 체크박스가 선택되도록 출력하시오. -->
	  <button onclick="btn()">데이터 가져오기</button>
	  <br>
	  <form action="">
	     <label>취미</label><br>
	     <input type="checkbox" name="hobby" id="game" value="game"
	      <%if(data.contains("game")) out.println("checked"); %>
	     >
	     <label for="game">게임</label>
	     <input type="checkbox" name="hobby" id="golf" value="golf" <%if(data.contains("golf")) out.println("checked"); %>>
	     <label for="golf">골프</label>
	     <input type="checkbox" name="hobby" id="swim" value="swim" <%if(data.contains("swim")) out.println("checked"); %>>
	     <label for="swim">수영</label>
	     <input type="checkbox" name="hobby" id="book" value="book" <%if(data.contains("book")) out.println("checked"); %>>
	     <label for="book">독서</label>
	  </form>
	
	</body>
</html>