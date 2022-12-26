<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>COOKIT</title>
		<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700,900&display=swap" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/style_main.css">
	</head>
	<body>
	 	<header>
	 		<div id="nav_up">
	 			<ul>
	 				<% if(!request.getParameter("successId").equals("adminid")){
                    %>
                    <li>회원가입</li>
	 				<li><a href="login.html">로그인</a></li>
	 				<%	
	 				}else{
	 				%>	
	 				<li>회원정보수정</li>
	 				<li><a href="#">로그아웃</a></li>	
	 				<%	
	 				}
	 				%>
	 				<li>고객행복센터</li>
	 				<li>배송정보검색</li>
	 				<li>기프트카드 등록</li>
	 			</ul>
	 		</div>
	 		<nav>
	 			<h1></h1>
	 			<ul>
	 				<li>COOKIT소개</li>
	 				<li>COOKIT메뉴</li>
	 				<li>리뷰</li>
	 				<li>이벤트</li>
	 				<li>MY쿡킷</li>
	 			</ul>
	 			<ul>
	 				<li><a href="#"><span>장바구니</span></a></li>
	 				<li><a href="#"><span>메뉴찾기</span></a></li>
	 			</ul>
	 		
	 		</nav>
	 	</header>
	 	<section>
	 		<div id="top_img">
	 			<div>
	 				<a href="#">
		 				<span>NEW</span>
		 				<span>3/16 신메뉴 출시</span>
		 				<span>따끈한 소울푸드<br>황태콩나물 해장국</span>
			 			<span><span></span>3인분</span>
			 			<span><span></span>조리 15분</span>
	 				</a>
	 				<span>16,800원 <a href="#"></a></span>
	 				<div>
	 					<a href="#"></a>
			 			<span>1/5</span>
			 			<a href="#"></a>
	 				</div>
	 			</div>
	 		</div>
	 		<div id="recomend">
	 			<div>
	 				<div>
		 				<span>얼큰한맛 <a href="#">▼</a></span>
		 				<span>메뉴<br>추천드려요</span>
		 				<span><a href="#">로그인</a>하시면 고객님의 구매내역과<br> 맛취향에 따라 딱맞는 맛있는 메뉴를 추천드려요</span>
		 			</div>
		 			<div></div>
		 			<img alt="우거지탕" src="images/recomand_tang.png">
		 			<div>
		 				<a href="#">얼큰소고기우거지탕</a>
		 				<div>
			 				<span>18,800원</span>
			 				<span>/3인분<a href="#"></a></span>
		 				</div>
	 				</div>
	 			</div>
	 		</div>
	 		<a href="#" id="event_banner"></a>
	 		<div id="best">
	 			<h2>실시간 베스트</h2>
	 			<ul>
	 				<li>
	 					<a href="#">
		 					<img alt="참스테이크" src="images/best01.jpg">
		 					<span id="best_top">BEST<br>01</span>
	 					</a>
	 					<a href="#">
		 					<span>부채살 찹스테이크</span>
		 					<span>
		 						20,800원
		 						<span>/2인분</span>
		 					</span>
	 					</a>
	 					<a href="#"></a>
	 				  </li>
	 				<li>
	 					<a href="#">
		 					<img alt="감바스 알아히오" src="images/best02.jpg">
		 					<span>02</span>
	 					</a>
	 					<a href="#">
		 					<span>감바스 알아히오</span>
		 					<span>
		 						20,800원
		 						<span>/3인분</span>
		 					</span>
	 					</a>
	 					<a href="#"></a>
	 				</li>
	 				<li>
	 					<a href="#">
		 					<img alt="소고기 두부전골" src="images/best03.jpg">
		 					<span>03</span>
	 					</a>
	 					<a href="#">
		 					<span>소고기 두부전골</span>
		 					<span>
		 						24,800원
		 						<span>/3인분</span>
		 					</span>
	 					</a>
	 					<a href="#"></a>
	 				</li>
	 				<li>
	 					<a href="#">
		 					<img alt="스키야키" src="images/best04.jpg">
		 					<span>04</span>
	 					</a>
	 					<a href="#">
		 					<span>스키야키</span>
		 					<span>
		 						24,800원
		 						<span>/3인분</span>
		 					</span>
	 					</a>
	 					<a href="#"></a>
	 				</li>
	 				<li>
	 					<a href="#">
		 					<img alt="빠네크림 파스타" src="images/best05.jpg">
		 					<span>05</span>
	 					</a>
	 					<a href="#">
		 					<span>빠네크림 파스타</span>
		 					<span>
		 						20,800원
		 						<span>/2인분</span>
		 					</span>
	 					</a>
	 					<a href="#"></a>
	 				</li>
	 				<li>
	 					<a href="#">
		 					<img alt="부추가득 오리불고기" src="images/best06.jpg">
		 					<span>06</span>
	 					</a>
	 					<a href="#">
		 					<span>부추가득 오리불고기</span>
		 					<span>
		 						24,800원
		 						<span>/3인분</span>
		 					</span>
	 					</a>
	 					<a href="#"></a>
	 				</li>
	 			</ul>
	 		</div>
	 		<div id="review">
	 			<h2>생생한 리뷰</h2>
	 			<div>
	 				<span></span>
	 				<span>속초식 코다리찜</span>
	 				<span>
						재료가 워낙 좋으니 생선이라도 비린내 걱정
						<br>없이 맛있었어요.나가서 사먹는것보다
						<br>내 집에서 믿고먹는 맛집, 쿡킷입니다!
					</span>
					<span></span>
	 				<span>by.for********</span>
	 				<div>
	 					<a href="#"></a>
			 			<span>1/5</span>
			 			<a href="#"></a>
	 				</div>
	 			</div>
	 			<img alt="코다리찜1" src="images/review01.jpg">
	 			<img alt="코다리찜2" src="images/review02.png">
	 			<span></span>
	 		</div>
			<div id="menu">
				<div>
					<img alt="메뉴상단01" src="images/menu_top01.jpg">
					<h2>쿡킷 메뉴보기<br>
					Premium Mealkit</h2>
					<span>
					장보기, 재료손질, 레시피검색 <strong>번거로움 OUT!</strong><br>
					초간편함은 물론, 완벽한 맛 쿡킷이 다~ 했네
					</span>
					<ul>
						<li>
							<a href="#">
								<span>
									<img alt="황태콩나물해장국" src="images/menu01.png">
								</span>
								<span>황태콩나물해장국</span>
								<span>16,800원<span>/3인분</span></span>
								<span class="new_menu">NEW</span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="군산식 아귀찜" src="images/menu02.png">
								</span>
								<span>군산식 아귀찜</span>
								<span>29,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="해물짬뽕전골" src="images/menu03.png">
								</span>
								<span>해물짬뽕전골</span>
								<span>22,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="스키야키" src="images/menu04.png">
								</span>
								<span>스키야키</span>
								<span>24,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="우삼겹쌀국수" src="images/menu05.png">
								</span>
								<span>우삼겹쌀국수</span>
								<span>24,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="빠네크림파스타" src="images/menu06.png">
								</span>
								<span>빠네크림파스타</span>
								<span>20,800원<span>/2인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="감바스알아히요" src="images/menu07.png">
								</span>
								<span>감바스알아히요</span>
								<span>20,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="대만식 우육탕면" src="images/menu08.png">
								</span>
								<span>대만식 우육탕면</span>
								<span>23,800원<span>/2인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="얼큰소고기우거지탕" src="images/menu09.png">
								</span>
								<span>얼큰소고기우거지탕</span>
								<span>18,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="두툼 갈치조림" src="images/menu10.png">
								</span>
								<span>두툼 갈치조림</span>
								<span>17,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="부추가득 오리불고기" src="images/menu11.png">
								</span>
								<span>부추가득 오리불고기</span>
								<span>24,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="버섯소불고기" src="images/menu12.png">
								</span>
								<span>버섯소불고기</span>
								<span>23,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="속초식 코다리찜" src="images/menu13.png">
								</span>
								<span>속초식 코다리찜</span>
								<span>24,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="사천식 깐풍새우" src="images/menu14.png">
								</span>
								<span>사천식 깐풍새우</span>
								<span>25,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="애호박돼지고기짜글이" src="images/menu15.png">
								</span>
								<span>애호박돼지고기짜글이</span>
								<span>22,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="칠리&크림 반반새우" src="images/menu16.png">
								</span>
								<span>칠리&크림 반반새우</span>
								<span>26,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="쿵팟퐁커리" src="images/menu17.png">
								</span>
								<span>쿵팟퐁커리</span>
								<span>20,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="소고기두부전골" src="images/menu18.png">
								</span>
								<span>소고기두부전골</span>
								<span>24,800원<span>/3인분</span></span>
							</a>
							<a href="#"></a>
						</li>
						<li>
							<a href="#">
								<span>
									<img alt="부채살 찹스테이크" src="images/menu19.png">
								</span>
								<span>부채살 찹스테이크</span>
								<span>20,800원<span>/2인분</span></span>
							</a>
							<a href="#"></a>
						</li>
					</ul>
				</div>
				<div>
					<img alt="핫딜" src="images/menu_hotdeal.jpg">
					<h2>놓칠 수 없는 기회 <br>
					오픈 한정 핫딜</h2>
					<span>파격적인 가격으로<br>
					쿡킷을 경험할 수 있는 기회를 잡으세요.</span>
					<a href="#">
						<img alt="쿡킷소개" src="images/menu_cj_intro.jpg">
						<h2>프리미엄 밀키트<br>
						COOKIT을 소개합니다.</h2>
						<span>COOKIT은 장보기, 재료손질, 계량 등 복잡한 과정 없이도<br>
						누구나 간편하게 특별한 집밥을 만들 수 있도록 도와드립니다.</span>
					</a>
				</div>
			</div>
			<div id="main_notice">
				<a href="#">
					<dl>
						<dt>공지사항</dt>
						<dd>미리보는 쿡킷 전체 메뉴 (3月)</dd>
					</dl>
				</a>
			</div>	 		
	 	</section>
		<footer>
			 	<div>
			 		<div>
				 		<a href="#"></a>
				 		<span>© COOKIT ALL RIGHTS RESERVED</span>
			 		</div>
			 		<div>
			 			<ul>
				 			<li>이용약관</li>
				 			<li class="foot_li">개인정보처리 방침</li>
				 			<li>법적고지</li>
				 			<li class="foot_end">사업자정보 확인</li>
			 			</ul>
			 			<div>
				 			<p>씨제이제일제당(주)대표이사 : 손경식,강신호,신현재 ㅣ 사업자등록번호 : 104-86-09535</p> 
				 			<p>주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560 ㅣ 통신판매업신고 중구 제 07767호 ㅣ 개인정보보호책임자 : 조영민</p>
							<p>이메일 : cjon@cj.net ㅣ 호스팅제공자 : CJ올리브네트웍스㈜</p> 
							<p>고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <a href="#">가입 사실 확인</a></p>
						</div>
			 		</div>
			 		<div>
			 		<span>CJ그룹계열사 바로가기 ▽</span>
			 		<span>고객행복센터 1668-1920</span>
			 		<a href="#">1:1 문의</a>
			 		</div>
			 	</div>
		</footer>
	</body>
</html>