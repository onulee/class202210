<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>join</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:755px; margin: 0 auto; }
		  th{width:150px; height:40px;}
		  td{width:600px; height:40px; padding-left:10px; }
		  div{height:60px; width: 250px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		  #checkId{width:100px; height:30px;}
		  .on{color:blue; }
		  .off{color:red; }
		  span{color:red; font-weight: 600;}
		</style>
		<script>
		   $(function(){
			  $("#id").focusout(function(){
				  var id = $("#id").val();
				   /* if(id.length<1){
					   alert("id를 입력하셔야 합니다.");
					   $("#id").focus();
					   return;
				   } */
				   
				   $.ajax({
					  url:"checkId.do",
					  type:"post",
					  data:{"id":id},
					  dataType:"text",
					  success:function(data){
						  //alert("성공");
						  console.log(data);
						  if(data==0){
							  alert("ID가 존재합니다. 다른 ID로 변경바랍니다.");
							  //$("#id").val("").focus();
							  $(".useTxt").removeClass("on");
							  $(".useTxt").text("ID를 사용할수 없습니다.");
							  checkFlag=false;
							  return;
						  }else{
							  alert("ID를 사용할 수 있습니다.");
							  $(".useTxt").addClass("on");
							  $(".useTxt").text("ID를 사용할수 있습니다.");
							  checkFlag=true;
						  }
					  },
					  error:function(){
						  alert("실패");
					  }
				   });
			  });
			   
			   
		   });
		
		   var checkFlag=false;
		   function checkBtn(){
			   var id = $("#id").val();
			   if(id.length<1){
				   alert("id를 입력하셔야 합니다.");
				   $("#id").focus();
				   return;
			   }
			   
			   $.ajax({
				  url:"checkId.do",
				  type:"post",
				  data:{"id":id},
				  dataType:"text",
				  success:function(data){
					  //alert("성공");
					  console.log(data);
					  if(data==0){
						  alert("ID가 존재합니다. 다른 ID로 변경바랍니다.");
						  $("#id").val("").focus();
						  $(".useTxt").removeClass("on");
						  $(".useTxt").text("ID를 사용할수 없습니다.");
						  return;
					  }else{
						  alert("ID를 사용할 수 있습니다.");
						  $(".useTxt").addClass("on");
						  $(".useTxt").text("ID를 사용할수 있습니다.");
						  checkFlag=true;
					  }
				  },
				  error:function(){
					  alert("실패");
				  }
			   });
			   
			   
		   }//checkBtn
		   
		   function joinBtn(){
			   if(checkFlag==false){
				   alert("중복확인을 하셔야 회원가입이 가능합니다.");
				   $("#checkId").focus();
				   return;
			   }
			   
			   var idPattern=/^[a-zA-Z]{3,}$/;
			   var id = $("#id").val();
			   if(!idPattern.test(id)){
				   alert("영문자 3자리 이상 입력하셔야 합니다.");
				   $("#id").focus();
				   return false;
			   }
			   
			   if($("input:checkbox[name=hobby]:checked").length<1){
				   alert("취미를 1개 이상 체크하셔야 가입이 가능합니다.");
				   return;
			   }
			   joinFrm.submit();
		   }//joinBtn
		</script>
	</head>
	<body>
	<c:if test="${result!=null}">
	   <script>alert("데이터 오류로 인해 회원가입이 되지 않았습니다. 다시 가입바랍니다.")</script>
	</c:if>
	  <h2>회원가입</h2>
	  <form action="doJoin.do" name="joinFrm" method="post">
	  <table>
	    <tr>
	      <th>아이디</th>
	      <td>
	        <input type="text" name="id" id="id">
	        <button type="button" id="checkId" >중복확인</button>
	        <br>
	        <span class="useTxt"></span>
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드</th>
	      <td>
	        <input type="text" name="pw" id="pw">
	      </td>
	    </tr>
	    <tr>
	      <th>패스워드확인</th>
	      <td>
	        <input type="password" name="pw2" id="pw2">
	      </td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td>
	        <input type="text" name="name" id="name">
	      </td>
	    </tr>
	    <tr>
	      <th>전화번호</th>
	      <td>
	        <input type="text" name="phone" id="phone">
	      </td>
	    </tr>
	    <tr>
	      <th>성별</th>
	      <td>
	        <input type="radio" name="gender" id="male" value="male">
	        <label for="male">남성</label>
	        <input type="radio" name="gender" id="female" value="female">
	        <label for="female">여성</label>
	      </td>
	    </tr>
	    <tr>
	      <th>취미</th>
	      <td>
	        <input type="checkbox" name="hobby" id="game" value="game">
	        <label for="game">게임</label>
	        <input type="checkbox" name="hobby" id="golf" value="golf">
	        <label for="golf">골프</label>
	        <input type="checkbox" name="hobby" id="run" value="run">
	        <label for="run">조깅</label>
	        <input type="checkbox" name="hobby" id="swim" value="swim">
	        <label for="swim">수영</label>
	        <input type="checkbox" name="hobby" id="book" value="book">
	        <label for="book">독서</label>
	      </td>
	    </tr>
	    <tr>
	      <td colspan="2">
	        <div>
	          <button type="button" onclick="joinBtn()">회원가입</button>
	          <button type="button" onclick="location.href='index.jsp'">취소</button>
	        </div>
	      </td>
	    </tr>
	  </table>
	  </form>
	
	</body>
</html>