<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class="com.java.ex.Member" scope="session" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="http://code.jquery.com/jquery-latest.min.js" ></script>
		<link rel="stylesheet" type="text/css" href="css/style_header.css">
		<link rel="stylesheet" type="text/css" href="css/style_modifing_member_info.css">
		<link rel="stylesheet" type="text/css" href="css/style_footer.css">
		<% if(session.getAttribute("sessionId")==null){ %>
		    <script>
			    alert("로그인을 하셔야 접근이 가능합니다.");
			    location.href="login.html";
		    </script>
		<%}else{ %>
		    <script>
			    alert("세션 : "<%= session.getAttribute("sessionId")%>);
		    </script>
		<%} %>
		<title>개인정보수정</title>
	</head>
	<body>
		<header>
			<div id="nav_up">
				<ul>
					<li><a href="#">회원가입</a></li>
					<li><a href="#">로그인</a></li>
					<li><a href="#">고객행복센터</a></li>
					<li><a href="#">배송지역검색</a></li>
					<li><a href="#">기프트카드 등록</a></li>
				</ul>
			</div>	
			<nav>
				<a href="#"></a>
				<ul>
					<li><a href="#">COOKIT소개</a></li>
					<li><a href="#">COOKIT메뉴</a></li>
					<li><a href="#">리뷰</a></li>
					<li><a href="#">이벤트</a></li>
					<li><a href="#">MY쿡킷</a></li>
				</ul>
				<ul>
					<li>
						<a href="#"><span>장바구니</span></a>
					</li>
					<li>
						<a href="#"><span>메뉴찾기</span></a>
					</li>
				</ul>
			</nav>
		</header>
		
		
		
		
		
		<section>
			<form name="agree" method="get" action="#">
				<div id="subBanner"></div>
				<div id="locationN">
					<ul>
						<li>HOME</li>
						<li>마이페이지</li>
						<li>개인정보수정</li>
					</ul>
				</div>
				
				<div id="sub_top_area">
					<h3>개인정보수정</h3>
				</div>
				
				<h4>
					필수 정보 입력 
					<span>(* 항목은 필수 항목입니다.)</span>
				</h4>
				<fieldset class="fieldset_class">
					<dl id="modify_name_dl">
						<dt>
							<div></div>
							<label for="name">이름</label>
						</dt>
						<dd>
							<%=member.getName() %>
						</dd>
					</dl>
					<dl id="modify_id_dl">
						<dt>
							<div></div>
							<label for="id">아이디</label>
						</dt>
						<dd>
							<%=member.getId() %>
						</dd>
					</dl>
					<dl id="modify_pw1_dl">
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
					<dl id="modify_pw2_dl">
						<dt>
							<div></div>
							<label for="pw2">비밀번호 확인</label>
						</dt>
						<dd>
							<input type="password" id="pw2" name="pw2" minlength="8" required />
							<span>비밀번호를 다시 한번 입력해 주세요.</span>
						</dd>
					</dl>
					<dl id="modify_mail_dl">
						<dt>
							<div></div>
							<label for="mail_id">이메일</label>
						</dt>
						<dd>
							<input type="text" id="mail_id" name="mail_id" value="<%=member.getMail_id() %>" required />
							<span>@</span>
							<input type="text" id="main_tail" name="mail_tail" required />
							<select>
								<option selected>직접입력</option>
								<option>지메일</option>
								<option>네이버</option>
								<option>네이트</option>
								<option>핫메일</option>
								<option>파란</option>
								<option>엠팔</option>
								<option>야후</option>
								<option>드림위즈</option>
								<option>한메일(다음)</option>
							</select>
						</dd>
					</dl>
					
					<dl id="modify_address_dl">
						<dt> 
							<div></div>
							<label for="">주소</label>
						</dt>
						<dd>
							<input type="text" id="f_postal" name="f_postal" required />
							<span>-</span>
							<input type="text" id="l_postal" name="l_postal" required />
							<input type="button" value="우편번호"/>
							<input type="text" id="address1" name="address1"  required />
							<input type="text" id="address2" name="address2"  required />
						</dd>
						
					</dl>
					
					<dl id="modify_tell_dl">
						<dt>
							<div></div>
							<label for="f_tell">휴대전화</label>
						</dt>
						<dd>
							<input type="text" id="f_tell" name="f_tell" maxlength="3"  required />
							<span> - </span>
							<input type="text" id="m_tell" name="m_tell" maxlength="4"  required />
							<span> - </span>
							<input type="text" id="l_tell" name="l_tell" maxlength="4"  required />
						</dd>
					</dl>
					<dl id="modify_birth_dl">
						<dt>
							<div></div>
							<label for="birth_year">생년월일</label>
						</dt>
						<dd>
							<select id="birth_year" name="birth_year" required>
								<option >선택</option>
								<option value="1988">1988</option>
								<option value="1989">1989</option>
								<option value="1990">1990</option>
								<option value="1991">1991</option>
								<option value="1992">1992</option>
								<option value="1993">1993</option>
								<option value="1994">1994</option>
								<option value="1995">1995</option>
								<option value="1996">1996</option>
								<option value="1997">1997</option>
								<option value="1998">1998</option>
								<option value="1988">1999</option>
								<option value="1920">2000</option>
							</select>
							<span>년</span>
							<select id="birth_month" name="birth_month" required>
								<option >선택</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select>
							<span>월</span>
							<select id="birth_day" name="birth_day" required>
								<option >선택</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
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
					<dl id="modify_gender_dl">
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
					<dl id="modify_newsletter_dl">
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
					<dl id="modify_sms_dl">
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
					<dl id="modify_member_number_dl">
						<dt>
							<label for="m_number">회원번호</label>
						</dt>
						<dd>
							<input type="text" name="m_number" id="m_number"  />
							<span>하이픈(-)이나 띄어쓰기 없이 입력해 주시기 바랍니다.</span>
						</dd>
					</dl>
					<dl id="modify_verification_number_dl">
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
					<dl id="modify_job_dl">
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
								<option selected value="student">학생</option>
								<option value="etc">기타</option>						
							</select>
						</dd>
					</dl>
					<dl id="modify_marital_status_dl">
						<dt>
							<label for="">결혼여부</label>
						</dt>
						<dd>
							<input type="radio" name="marital_status" id="marital_status_y" value="yes" />
							<label for="marital_status_y">예</label>
							<input type="radio" name="marital_status" id="marital_status_n" value="no" checked/>
							<label for="marital_status_n">아니오</label>
						</dd>
					</dl>
					<dl id="modify_interests_dl">
						<dt>
							<label for="">관심사</label>
							<%=member.getHobbys() %>
						</dt>
						<dd>
							<ul>
								<li>
									<input type="checkbox" name="hobby" id="computer" value="computer"
									<% if(member.getHobbys().contains("computer")) out.println("checked"); %>
									 />
									<label for="computer">컴퓨터/인터넷</label>
								</li>
								<li>
									<input type="checkbox" name="hobby" id="movie" value="movie" 
									<% if(member.getHobbys().contains("movie")) out.println("checked"); %>
									/>
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
									<input type="checkbox" name="hobby" id="fashion" value="fashion"/>
									<label for="fashion">패션/미용</label>
								</li>
							</ul>
						</dd>
					</dl>
				</fieldset>
				<div id="info_input_button">
					<input type="reset" value="취소하기" />
					<input type="submit" value="수정하기" />
				</div>
				
			</form>
		</section>
		
		
		
		
		
		
		
		<footer>
			<div id="footer_wrap">
				<div id="footer_cont">
					<div id="fl_l">
						<a href="#"></a>
						<p>© COOKIT ALL RIGHTS RESERVED</p>
					</div>
					<div id="fl_c">
						<ul>
							<li><a href="#">이용약관</a></li>
							<li><a href="#">개인정보처리 방침</a></li>
							<li><a href="#">법적고지</a></li>
							<li><a href="#">사업자정보 확인</a></li>
						</ul>
						<div id="fl_c_info">
							<p>씨제이제일제당(주)</p>
							<p>대표이사 : 손경식,강신호,신현재</p>
							<p>사업자등록번호 : 104-86-09535</p>
							<p>주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</p>
							<p>통신판매업신고 중구 제 07767호</p>
							<p>개인정보보호책임자 : 조영민</p>
							<p>이메일 : cjon@cj.net</p>
							<p>호스팅제공자 : CJ올리브네트웍스㈜</p>
							<p>고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <a href="#">가입 사실 확인</a></p>
						</div>
					</div>
					<div id="fl_r">
						<span>cj그룹계열사 바로가기 ▼</span>
						<dl>
							<dt>고객행복센터</dt>
								<dd>1688-1920</dd>
						</dl>
						<a href="#">1:1문의</a>						
					</div>
				</div>
			</div>
		
		
		
		</footer>
	</body>
</html>