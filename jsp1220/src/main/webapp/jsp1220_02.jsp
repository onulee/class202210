<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset="UTF-8">
		<title>jsp form</title>
		<!-- 필수!! 제이쿼리 링크 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script>
		    function zipBtn(){
			    new daum.Postcode({
			        oncomplete: function(data) {
			            $("#zipcode").val(data.zonecode);
			            $("#addr1").val(data.address);
			        }
			    }).open();
		    }
		    
		    function domain_change(){
		    	console.log($("#domain").val());
		    	if($("#domain").val()==""){
		    		$("#email2").val("");
			    	$("#email2").attr("readOnly",false);
		    	}else{
			    	$("#email2").val($("#domain").val());
			    	$("#email2").attr("readOnly",true);
		    	}
		    }
		</script>
	</head>
	<body>
	  <h2>회원정보</h2>
	  <form action="" method="post">
	     <label>주소</label><br>
	     <input type="text" name="zipcode" id="zipcode"> <button type="button" onclick="zipBtn()">우편번호</button><br>
	     <input type="text" name="addr1" id="addr1"><br>
	     <input type="text" name="addr2" id="addr2"><br>
	     <br>
	     <input type="text" name="email1">@
	     <input type="text" name="email2" id="email2" >
	     <select name="domain" id="domain" onchange="domain_change()">
	        <option value="">직접입력</option>
	        <option value="naver.com">네이버</option>
	        <option value="daum.net">다음</option>
	        <option value="gmail.com">지메일</option>
	     </select>
	     <br><br>
	     <input type="submit" value="전송"><br>
	  </form>
	   
	</body>
</html>