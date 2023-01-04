<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="http://code.jquery.com/jquery-latest.min.js" ></script>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<link rel="stylesheet" type="text/css" href="css/style_join02_info_input.css">
		<title>회원가입 - 회원정보입력</title>
		<script>
		  $(function(){
			  var nameChk = /^[가-힣]{2,}$/;
			  var idChk = /^[a-zA-Z]{1}[a-zA-Z0-9_]{3,15}$/;
			  var pwChk = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{5,}$/;
			  var engChk = /^[a-zA-Z]{2,}$/;
			  var numChk = /^[0-9]{2,}$/;
			  var monthArr = [31,28,31,30,31,30,31,31,30,31,30,31];
			  var idChkFlag=0;
			  
			  var today = new Date();
			  var year = today.getFullYear();
			  
			  //생일 년 select추가
			  var birth_year_data ="<option selected>선택</option>";
			  for(var i=1901;i<=year;i++){
				  birth_year_data +='<option value="'+i+'">'+i+'</option>';
			  }
			  $("#birth_year").html(birth_year_data);
			  
			  //생일 달 select추가
			  var birth_month_data ="<option selected>선택</option>";
			  for(var i=1;i<=12;i++){
				  birth_month_data +='<option value="'+i+'">'+i+'</option>';
			  }
			  $("#birth_month").html(birth_month_data);
			  
			  //생일 일 select추가
			  var birth_day_data ="<option selected>선택</option>";
			  for(var i=1;i<=31;i++){
				  birth_day_data +='<option value="'+i+'">'+i+'</option>';
			  }
			  $("#birth_day").html(birth_day_data);
			  
			  
			  //년도 change시
			  $("#birth_year").change(function(){
				  //윤달체크
				  alert(this.value);
				  if((this.value%4==0 && this.value%100!=0)||this.value%400==0){
					  monthArr[1]=29;
				  }else{
					  monthArr[1]=28;
				  } 
			  });
			  
			  //**** 월 change시
			  $("#birth_month").change(function(){
				  // birth_month : 2  -> monthArr[1]
				  var birth_day_data ="<option selected>선택</option>";
				  for(var i=1;i<=monthArr[$("#birth_month").val()-1];i++){
					  birth_day_data +='<option value="'+i+'">'+i+'</option>';
				  }
				  $("#birth_day").html(birth_day_data);
			  });
			  
			  
			  //메일주소 연결
			  $("#mail").change(function(){
		    		if($("#mail").val()==""){
		    			$("#mail_tail").val("");
		    			$("#mail_tail").prop("readonly",false);
		    		}else{
			    		$("#mail_tail").val($("#mail").val());
			    		$("#mail_tail").prop("readonly",true);
		    		}
		      });
			  
			  //다음주소api 연결
			  $("#zipBtn").click(function(){
		    		new daum.Postcode({
		    	        oncomplete: function(data) {
		    	            $("#f_postal").val(data.zonecode);
		    	            $("#address1").val(data.address);
		    	        }
		    	    }).open();
		      });
			  
	    	// ***** 가입하기 버튼 클릭시 *****
			$("#submitBtn").click(function(){
				//이름패턴 확인
				var name = $("#name").val();
				if(!nameChk.test(name)){
					alert("한글만 적용이 가능합니다.");
					$("#name").focus();
					return false;
				}
				
				//아이디패턴 확인
				var id = $("#id").val();
				if(!idChk.test(id)){
					alert("첫글자는 영문자, 영문자,숫자,특수문자 _만 가능합니다.");
					$("#id").focus();
					return false;
				}
				
				//패스워드패턴 확인
				var pw = $("#pw1").val();
				if(!pwChk.test(pw)){
					alert("영문자,숫자,특수문자 1개 이상 입력하셔야 합니다.");
					$("#pw1").focus();
					return false;
				}	
		    	if($("input:checkbox[name=hobby]:checked").length<3){
		    			alert("취미를 3개 이상 선택해 주세요.");
		    			$("input:checkbox[name=hobby]").focus();
		    			return false;
		    	}
		     });
			  
		  });//function
		
		</script>
	</head>
	<body>
	<!-- header 시작 -->
	<%@ include file="header_join.jsp" %>	
	<!-- header 끝 -->
		<section>
			<form name="agree" method="get" action="join03_success.html">
				<div id="subBanner"></div>
				<div id="locationN">
					<ul>
						<li>HOME</li>
						<li>회원가입</li>
						<li>회원정보입력</li>
					</ul>
				</div>
				
				<div id="sub_top_area">
					<h3>회원가입</h3>
				</div>
				
				<div id="join_step_div">
					<ul>
						<li>
							<span>STEP.1</span>
							<p>약관동의</p>
						</li>
						<li>
							<span>STEP.2</span>
							<p>회원정보</p>
						</li>
						<li>
							<span>STEP.3</span>
							<p>회원가입완료</p>
						</li>
					</ul>
				</div>
				
				<h4>
					필수 정보 입력 
					<span>(* 항목은 필수 항목입니다.)</span>
				</h4>
				
				<fieldset class="fieldset_class">
					<dl id="join_name_dl">
						<dt>
							<div></div>
							<label for="name">이름</label>
						</dt>
						<dd>
							<input type="text" id="name" name="name" required/>
						</dd>
					</dl>
					<script>
					    $(function(){
					    	$("#idChkBtn").click(function(){
					    		idChkFlag=0;
					    		var id = $("#id").val();
					    		$.ajax({
					    			url:"js/member.json",
					    			type:"post",
					    			dataType:"json",
					    			data:{"id":"admin"},
					    			success:function(data){
					    				for(var mem of data){
					    					if(mem.id==id){
					    						alert("아이디가 존재합니다. 다른 아이디를 사용하세요.");
					    						$("#id").val().focus();
					    						return false;
					    					}
					    				}//for
					    				alert("입력한 아이디를 사용할 수 있습니다.");
					    			},
					    			error:function(){
					    				alert("데이터 가져오기 실패");
					    			}
					    		});//ajax
					    		
					    		idChkFlag=1;
					    		
					    	});
					    });
				    </script>
					<dl id="join_id_dl">
						<dt>
							<div></div>
							<label for="id">아이디</label>
						</dt>
						<dd>
							<input type="text" id="id" name="id" minlength="4" maxlength="16" required/>
							<input type="button" id="idChkBtn" value="중복확인"/>
							<span>4~16자리의 영문, 숫자, 특수기호(_)만 사용하실 수 있습니다.</span>
							<span>첫 글자는 영문으로 입력해 주세요.</span>
						</dd>
					</dl>
					<dl id="join_pw1_dl">
						<dt>
							<div></div>
							<label for="pw1">비밀번호</label>
						</dt>
						<dd>
							<input type="password" id="pw1" name="pw1" minlength="8" required />
							<span>영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력</span>
							<span>영문, 숫자, 특수문자 모두 조합 시 8자리 이상 입력</span>
						</dd>
					</dl>
					<dl id="join_pw2_dl">
						<dt>
							<div></div>
							<label for="pw2">비밀번호 확인</label>
						</dt>
						<dd>
							<input type="password" id="pw2" name="pw2" minlength="8" required />
							<span>비밀번호를 다시 한번 입력해 주세요.</span>
						</dd>
					</dl>
					<dl id="join_mail_dl">
						<dt>
							<div></div>
							<label for="mail_id">이메일</label>
						</dt>
						<dd>
							<input type="text" id="mail_id" name="mail_id" />
							<span>@</span>
							<input type="text" id="mail_tail" name="mail_tail" />
							<select id="mail">
								<option value="" selected>직접입력</option>
								<option value="gmail.com">지메일</option>
								<option value="naver.com">네이버</option>
								<option value="nate.com">네이트</option>
								<option value="duam.net">다음</option>
							</select>
						</dd>
					</dl>
					<dl id="join_address_dl">
						<dt> 
							<div></div>
							<label for="">주소</label>
						</dt>
						<dd>
							<input type="text" id="f_postal" name="f_postal"  />
							<input type="button" id="zipBtn" value="우편번호"/>
							<input type="text" id="address1" name="address1"  />
							<input type="text" id="address2" name="address2"  />
						</dd>
						
					</dl>
					
					<dl id="join_tell_dl">
						<dt>
							<div></div>
							<label for="f_tell">휴대전화</label>
						</dt>
						<dd>
							<input type="text" id="f_tell" name="f_tell" maxlength="3" required />
							<span> - </span>
							<input type="text" id="m_tell" name="m_tell" maxlength="4" required />
							<span> - </span>
							<input type="text" id="l_tell" name="l_tell" maxlength="4" required />
						</dd>
					</dl>
					<dl id="join_birth_dl">
						<dt>
							<div></div>
							<label for="birth_year">생년월일</label>
						</dt>
						<dd>
							<select id="birth_year" name="birth_year" >
								<!-- 년도추가 -->
							</select>
							<span>년</span>
							<select id="birth_month" name="birth_month" >
								<!-- 월추가 -->
							</select>
							<span>월</span>
							<select id="birth_day" name="birth_day">
								<!-- 일추가 -->
							</select>
							<span>일</span>
							<div>
								<input type="radio" name="calendar" id="lunar" value="lunar" checked="checked"/>
								<label for="lunar">양력</label>
								<input type="radio" name="calendar" id="solar" value="solar" />
								<label for="solar">음력</label>
							</div>
						</dd>
					</dl>
					<dl id="join_gender_dl">
						<dt>
							<div></div>
							<label for="">성별</label>
						</dt>
						<dd>
							<div>
								<input type="radio" name="gender" id="male" value="male" checked="checked"/>
								<label for="male">남성</label>
								<input type="radio" name="gender" id="female" value="female" />
								<label for="female">여성</label>
							</div>
						</dd>
					</dl>
					<dl id="join_newsletter_dl">
						<dt>
							<div></div>
							<label for="">뉴스레터 수신여부</label>
						</dt>
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							<div>
								<input type="radio" name="newletter" id="newletter_y" value="yes" checked="checked"/>
								<label for="newletter_y">예</label>
								<input type="radio" name="newletter" id="newletter_n" value="no" />
								<label for="newletter_n">아니오</label>
							</div>
						</dd>
					</dl>
					<dl id="join_sms_dl">
						<dt>
							<div></div>
							<label for="">SMS 수신여부</label>
						</dt>
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							<div>
								<input type="radio" name="sms" id="sms_y" value="yes" checked="checked"/>
								<label for="sms_y">예</label>
								<input type="radio" name="sms" id="sms_n" value="no" />
								<label for="sms_n">아니오</label>
							</div>
						</dd>
					</dl>
				</fieldset>

								
				<h4>
					분양 회원 정보 입력 
					<span>(다구좌 회원일 경우 가지고 계신 카드번호 중 하나를 입력해 주시면 됩니다)</span>
				</h4>
				<fieldset class="fieldset_class">
					<dl id="join_member_number_dl">
						<dt>
							<label for="m_number">회원번호</label>
						</dt>
						<dd>
							<input type="text" name="m_number" id="m_number" />
							<span>하이픈(-)이나 띄어쓰기 없이 입력해 주시기 바랍니다.</span>
						</dd>
					</dl>
					<dl id="join_verification_number_dl">
						<dt>
							<label for="v_number">회원인증번호</label>
						</dt>
						<dd>
							<input type="text" name="v_number" id="v_number" />
							<span>숫자 4자리 입력</span>
						</dd>
					</dl>
				</fieldset>
				
				<h4>
					선택 입력 정보 
				</h4>
				<fieldset class="fieldset_class">
					<dl id="join_job_dl">
						<dt>
							<label for="job">직업</label>
						</dt>
						<dd>
							<select id="job" name="job">
								<option selected>선택</option>
								<option value="worker">회사원</option>
								<option value="slef">자영업자</option>
								<option value="freelancer">프리랜서</option>
								<option value="housewife">전업주부</option>
								<option value="student">학생</option>
								<option value="etc">기타</option>						
							</select>
						</dd>
					</dl>
					<dl id="join_marital_status_dl">
						<dt>
							<label for="">결혼여부</label>
						</dt>
						<dd>
							<input type="radio" name="marital_status" id="marital_status_y" value="yes" />
							<label for="marital_status_y">예</label>
							<input type="radio" name="marital_status" id="marital_status_n" value="no" />
							<label for="marital_status_n">아니오</label>
						</dd>
					</dl>
					<dl id="join_interests_dl">
						<dt>
							<label for="">관심사</label>
						</dt>
						<dd>
							<ul>
								<li>
									<input type="checkbox" name="hobby" id="computer" value="computer" />
									<label for="computer">컴퓨터/인터넷</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="movie" value="movie" />
									<label for="movie">영화/비디오</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="music" value="music" />
									<label for="music">음악</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="shopping" value="shopping" />
									<label for="shopping">쇼핑</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="game" value="game" />
									<label for="game">게임</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="culture" value="culture" />
									<label for="culture">문화/예술</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="parenting" value="parenting" />
									<label for="parenting">육아/아동</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="cooking" value="cooking" />
									<label for="cooking">요리</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="interier" value="interier" />
									<label for="interier">인테리어</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="leisure" value="leisure" />
									<label for="leisure">레저/여가</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="health" value="health" />
									<label for="health">건강/다이어트</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="fashion" value="fashion" />
									<label for="fashion">패션/미용</label>
								</li>
							</ul>
						</dd>
					</dl>
				</fieldset>
				<div id="info_input_button">
					<input type="reset" value="취소하기" />
					<input type="button" id="submitBtn" value="가입하기" />
				</div>
				
			</form>
		</section>
		<!-- footer 시작 -->
		<%@ include file="footer_join.jsp" %>
		<!-- footer 끝 -->
	</body>
</html>