<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적 등록</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  td{ text-align: left; padding-left:30px; }
		  input,select {width:300px; height:30px; font-size:16px; }
		  div{width: 400px; height:60px; margin:12px auto 0;  }
		  button{display: inline-block; width:120px; height:40px; }
		</style>
		<script>
		  $(function(){
			 var htmlData=""; 
			 for(var i=0;i<=100;i++){
				 htmlData += "<option value='"+i+"'>"+i+"</option>";
			 }
			 $("#kor").html(htmlData);
		  });
		
		  function stuscoreBtn(){
			  if($("#name").val()<1){
				  alert("이름을 입력하셔야 저장이 가능합니다.");
				  $("#name").focus();
				  return false;
			  }
			  
			  var kor = Number($("#kor").val());
			  var eng = Number($("#eng").val());
			  var math = Number($("#math").val());
			  
			  if(confirm("학생성적을 등록할까요?"+"\n"+"이름 : "+$("#name").val()+"\n"+"국어점수 :"+kor+"\n"
						+"영어점수 : "+eng+"\n"+"수학점수 :"+math+"\n"
						+"합계 : "+(kor+eng+math)+"\n"
						+"평균 : "+Math.round((kor+eng+math)/3*100)/100+"\n")){
			  }
			  stuFrm.submit();
		  }//
		  
		  function cancelBtn(){
			  if(confirm("학생성적 등록을 취소하시겠습니까?")){
				  location.href="stuscoreAll.jsp";
			  }
		  }//
		</script>
	</head>
	<body>
		<h2>학생성적 등록</h2>
		<form action="DoStuWrite" method="post" name="stuFrm" >
		<table>
		   <colgroup>
		     <col width="30%">
		     <col width="70%">
		   </colgroup>
			<tr>
			  <th>이름</th>
			  <td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
			  <th>국어점수</th>
			  <td>
			     <select name="kor" id="kor">
			       <option value="0">0</option>
			     </select>
			  
			  
			  </td>
			</tr>
			<tr>
			  <th>영어점수</th>
			  <td><input type="text" name="eng" id="eng"></td>
			</tr>
			<tr>
			  <th>수학점수</th>
			  <td><input type="text" name="math" id="math"></td>
			</tr>
		</table>
		<div>
		  <button type="button" onclick="stuscoreBtn()">학생성적등록</button>
		  <button type="button" onclick="cancelBtn()">취소</button>
		</div>
		</form>
	
	</body>
</html>