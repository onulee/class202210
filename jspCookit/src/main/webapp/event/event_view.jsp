<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html>
<head>
<title> JARDIN SHOP </title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="JARDIN SHOP" />
<meta name="keywords" content="JARDIN SHOP" />
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scaleable=no" />
<link rel="stylesheet" type="text/css" href="css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="css/content.css?v=Y" />
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/top_navi.js"></script>
<script type="text/javascript" src="js/left_navi.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/idangerous.swiper-2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.anchor.js"></script>
</head>
<body>
<div id="allwrap">
<div id="wrap">

	<div id="header">
		
		<div id="snbBox">
			<a href="index.do"><h1><img src="images/txt/logo.gif" alt="JARDIN SHOP" /></h1></a>
			<div id="quickmenu">
				<div id="mnaviOpen"><img src="images/btn/btn_mnavi.gif" width="33" height="31" alt="메뉴열기" /></div>
				<div id="mnaviClose"><img src="images/btn/btn_mnavi_close.gif" width="44" height="43" alt="메뉴닫기" /></div>
				<ul>
					<li><a href="#">EVENT</a></li>
					<li><a href="#">CUSTOMER</a></li>
					<li><a href="#">COMMUNITY</a></li>
				</ul>
			</div>
			<div id="snb">
				<ul>
					<li><a href="#">LOGIN</a></li>
					<li><a href="#">JOIN</a></li>
					<li><a href="#">MY PAGE</a></li>
					<li><a href="#">CART</a></li>
				</ul>

				<div id="search">
					<input type="text" class="searchType" />
					<input type="image" src="images/btn/btn_main_search.gif" width="23" height="20" alt="검색하기" />
				</div>
			</div>
		</div>
	</div>


	<!-- GNB -->
	<div id="gnb">
		
		<div id="top">
			<ul>
				<li class="brand t1"><a href="#" id="topNavi1">JARDIN’s BRAND</a>
					<ul id="topSubm1">
						<li><a href="#">클래스</a></li>
						<li><a href="#">홈스타일 카페모리</a></li>
						<li><a href="#">드립커피백</a></li>
						<li><a href="#">카페리얼 커피</a></li>
						<li><a href="#">오리지널커피백</a></li>
						<li><a href="#">카페리얼 음료</a></li>
						<li><a href="#">마일드커피백</a></li>
						<li><a href="#">워터커피</a></li>
						<li><a href="#">카페포드</a></li>
						<li><a href="#">모히또파티</a></li>
						<li><a href="#">테이크아웃 카페모리</a></li>
						<li><a href="#">포타제</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi2">원두</a>
					<ul id="topSubm2">
						<li><a href="#">클래스</a></li>
						<li><a href="#">로스터리샵</a></li>
						<li><a href="#">커피휘엘</a></li>
						<li><a href="#">산지별 생두</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi3">원두커피백</a>
					<ul id="topSubm3">
						<li><a href="#">드립커피 로스트</a></li>
						<li><a href="#">오리지널커피백</a></li>
						<li><a href="#">마일드커피백</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi4">인스턴트</a>
					<ul id="topSubm4">
						<li><a href="#">까페모리</a></li>
						<li><a href="#">홈스타일카페모리</a></li>
						<li><a href="#">포타제</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi5">음료</a>
					<ul id="topSubm5">
						<li><a href="#">까페리얼</a></li>
						<li><a href="#">워터커피</a></li>
						<li><a href="#">모히또</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi6">커피용품</a>
					<ul id="topSubm6">
						<li><a href="#">종이컵</a></li>
						<li><a href="#">커피필터</a></li>
						<li><a href="#">머신 등</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi7">선물세트</a></li>
				<li class="t2"><a href="#" id="topNavi8">대량구매</a></li>
			</ul>
		</div>

		<script type="text/javascript">initTopMenu();</script>
	</div>
	<!-- //GNB -->

	<!-- container -->
	<div id="container">

		<div id="location">
			<ol>
				<li><a href="#">HOME</a></li>
				<li><a href="#">EVENT</a></li>
				<li class="last">진행중 이벤트</li>
			</ol>
		</div>
		
		<div id="outbox">		
			<div id="left">
				<div id="title2">EVENT<span>이벤트</span></div>
				<ul>	
					<li><a href="event.do?page=${page}" id="leftNavi1">진행중 이벤트</a></li>
					<li><a href="#" id="leftNavi2">종료된 이벤트</a></li>
					<li class="last"><a href="#" id="leftNavi3">당첨자 발표</span></a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(1,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="mypage">
					<h2><strong>진행중 이벤트</strong><span>쟈뎅샵의 특별한 혜택이 가득한 이벤트에 참여해 보세요.</span></h2>
					
					<div class="viewDivMt">
						<div class="viewHead">
							<div class="subject">
								<ul>
									<li>${bvo.btitle }</li>
								</ul>
							</div>
							<div class="day">
								<p class="txt">이벤트 기간<span>2014-04-01 ~ <fmt:formatDate value="${bvo.bdate}" pattern="yyyy-MM-dd"/>
								</span></p>
							</div>
						</div>

						<div class="viewContents">
							<img src="images/img/sample_event_view.jpg" alt="" />
						</div>
					</div>


					<!-- 이전다음글 -->
					<div class="pnDiv web">
						<table summary="이전다음글을 선택하여 보실 수 있습니다." class="preNext" border="1" cellspacing="0">
							<caption>이전다음글</caption>
							<colgroup>
							<col width="100px" />
							<col width="*" />
							<col width="100px" />
							</colgroup>
							<tbody>
								<tr>
									<th class="pre">PREV</th>
									<td><a href="#">상품 재입고는 언제 되나요?</a></td>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<th class="next">NEXT</th>
									<td>다음 글이 없습니다.</td>
									<td>&nbsp;</td>
								</tr>
							</tbody>
						</table>
					</div>
					<!-- //이전다음글 -->
					<script>
					  var readNum=0; //마지막으로 읽어온 댓글번호
					  $(function(){
						  commentSelectAll();
						  
					  });//jquery
					  
					  //2초에 한번씩 함수호출
					  //setInterval(commentSelectAll, 3000);
					  
					  //댓글 모두가져오기
					  function commentSelectAll(){
						  $.ajax({
							  type:"post",
							  url:"event_commentSelectAll.do",
							  data:{"bno":"${bvo.bno}","readNum":readNum},
							  dataType:"json",
							  success:function(data){
								  //alert("성공");
								  console.log(data);
								  
								  if(data.length==1){
									  return;
								  }
								  
								  var htmlData="";
								  for(var i=0;i<data.length-1;i++){
								  //for(var i of data){ //cno,bno,id,cpw,ccontent,cdate
									  htmlData += "<ul id="+data[i].cno+">";
									  htmlData += '<li class="name">'+data[i].id+'&nbsp;<span>['+data[i].cdate+']</span></li>';
									  //비밀번호가 없으면,내것인데 비밀번호 있으면
									  if(data[i].cpw == null || '${sessionId}'==data[i].id)
									    htmlData += '<li class="txt">'+ data[i].ccontent +'</li>';
									  else
										htmlData += '<li class="txt"><a class="passwordBtn"><span class="orange">※ 비밀글입니다.</span></a></li>';  
									  htmlData += '<li class="btn">';
									  if('${sessionId}'==data[i].id){
										  htmlData += '<a class="rebtn" onclick="updateBtn('+data[i].cno+',\''+data[i].id +'\',\''+data[i].ccontent+'\',\''+data[i].cdate+'\')">수정</a>&nbsp;';
										  htmlData += '<a class="rebtn" onclick="deleteBtn('+data[i].cno+')">삭제</a>';
									  }
									  htmlData += '</li>';
									  htmlData += '</ul>';
								  }//for
								  
								  //data 마지막데이터 - lastNum  arr10 arr[9]
								  readNum = data[data.length-1].lastNum;
								  $(".replyBox").html(htmlData);
								  $(".replyAll_num").text(data.length);
							  },
							  error:function(){
								  alert("실패");
							  }
						  });//ajax
					  }
					  
					  //댓글삭제버튼클릭
					  function deleteBtn(cno){
						  if(confirm("댓글을 삭제하시겠습니까?")){
							  $.ajax({
								  type:"post",
								  url:"event_commentDelete.do",
								  data:{"cno":cno},
								  dataType:"json",
								  success:function(data){
									  //alert("성공");
									  console.log(data);
									  var htmlData="";
									  
									  $("#"+cno).remove();
									  $(".replyAll_num").text(Number($(".replyAll_num").text())-1);
									  alert("삭제처리가 되었습니다.");
								  },
								  error:function(){
									  alert("실패");
								  } 
							  });//ajax 
						  }//if
						  
					  }//deleteBtn
					  
					  //댓글수정버튼클릭
					  function updateBtn(cno,id,ccontent,cdate){
						  alert("해당 댓글을 수정합니다.");
						   
						  var htmlData='';
						  htmlData +='<li class="name">'+id+'&nbsp<span>'+cdate+'</span></li>';
						  htmlData +='<li class="txt"><textarea class="replyType">'+ccontent+'</textarea></li>';
						  htmlData +='<li class="btn">';
						  htmlData +='<a class="rebtn" onclick="saveBtn('+cno+',\''+id +'\',\''+ccontent+'\',\''+cdate+'\')">완료</a>&nbsp';
						  htmlData +='<a class="rebtn" onclick="cancelBtn('+cno+',\''+id +'\',\''+ccontent+'\',\''+cdate+'\')">취소</a>';
						  htmlData +='</li>';
						  
						  $("#"+cno).html(htmlData); 
					  }//updateBtn
					  
					  //완료버튼클릭
					  function saveBtn(cno,id,ccontent,cdate){
						  //alert($("#"+cno+" .replyType").val());
						  ccontent = $("#"+cno+" .replyType").val();
						  $.ajax({
							 type:"post",
							 url:"event_commentUpdate.do",
							 data:{"cno":cno,"ccontent":ccontent},
							 dataType:"json",
							 success:function(data){
								 alert("댓글 수정이 되었습니다.");
								 var htmlData="";
								 htmlData += '<li class="name">'+data.id+'&nbsp;<span>['+data.cdate+']</span></li>';
								 htmlData += '<li class="txt">'+ data.ccontent +'</li>';
								 htmlData += '<li class="btn">';
								 htmlData += '<a class="rebtn" onclick="updateBtn('+data.cno+',\''+data.id +'\',\''+data.ccontent+'\',\''+data.cdate+'\')">수정</a>&nbsp;';
								 htmlData += '<a class="rebtn" onclick="deleteBtn('+data.cno+')">삭제</a>';
								 htmlData += '</li>';
								  
								 $("#"+cno).html(htmlData);
							 },
							 error:function(){
								 alert("실패");
							 }
						  });
					  }//saveBtn
					  
					  
					  //취소버튼클릭
					  function cancelBtn(cno,id,ccontent,cdate){
						  alert("댓글수정을 취소합니다.");
						  var htmlData="";
						  htmlData += '<li class="name">'+id+'&nbsp;<span>['+cdate+']</span></li>';
						  htmlData += '<li class="txt">'+ ccontent +'</li>';
						  htmlData += '<li class="btn">';
						  htmlData += '<a class="rebtn" onclick="updateBtn('+cno+',\''+id +'\',\''+ccontent+'\',\''+cdate+'\')">수정</a>&nbsp;';
						  htmlData += '<a class="rebtn" onclick="deleteBtn('+cno+')">삭제</a>';
						  htmlData += '</li>';
						  
						  $("#"+cno).html(htmlData);
					  }//cancelBtn
					  
					  
					  //댓글추가-자바스크립트
					  function replyBtn(){
						  if("${sessionId}"==""){
							    alert("로그인을 하셔야 댓글입력이 가능합니다.");
							    //입력창 지우기
								$(".replynum").val("");
								$(".replyType").val("");
								location.href="login.do";
							    return;
						  }
						  //추가
						  $.ajax({
							  type:"post",
							  url:"event_commentInsert.do",
							  data:{"bno":"${bvo.bno}","id":"${sessionId}","cpw":$(".replynum").val(),"ccontent":$(".replyType").val() },
							  dataType:"json",
							  success:function(data){
								  //alert("성공");
								  console.log(data);
								  alert("댓글이 등록되었습니다.");
								  var htmlData="";
								  htmlData += "<ul id="+data.cno+">";
								  htmlData += '<li class="name">'+data.id+'&nbsp;<span>['+data.cdate+']</span></li>';
								  htmlData += '<li class="txt">'+ data.ccontent +'</li>';
								  htmlData += '<li class="btn">';
								  htmlData += '<a class="rebtn" onclick="updateBtn('+data.cno+',\''+data.id +'\',\''+data.ccontent+'\',\''+data.cdate+'\')">수정</a>&nbsp;';
								  htmlData += '<a class="rebtn" onclick="deleteBtn('+data.cno+')">삭제</a>';
								  htmlData += '</li>';
								  htmlData += '</ul>';
								  
								  //입력창 지우기
								  $(".replynum").val("");
								  $(".replyType").val("");
								  
								  $(".replyBox").prepend(htmlData);
								  $(".replyAll_num").text(Number($(".replyAll_num").text())+1);
									  
							  },
							  error:function(){
								  alert("실패");
							  }
						  });//ajax
					  }//replyBtn
					  
					</script>


					<!-- 댓글입력부분 -->
					<div class="replyWrite">
						<ul>
							<li class="in">
								<p class="txt">총 <span class="replyAll_num orange">3</span> 개의 댓글이 달려있습니다.</p>
								<p class="password">비밀번호&nbsp;&nbsp;<input type="password" name="cpw" class="replynum" /></p>
								<textarea name="ccontent" class="replyType"></textarea>
							</li>
							<li class="btn"><a class="replyBtn" onclick="replyBtn()">등록</a></li>
						</ul>
						<p class="ntic">※ 비밀번호를 입력하시면 댓글이 비밀글로 등록 됩니다.</p>
					</div>

                    <!-- 댓글부분 -->
					<div class="replyBox">
					   					
						

						<!-- 비밀글폼 
						<ul>
							<li class="name">jjabcde <span>[2014-03-04&nbsp;&nbsp;15:01:59]</span></li>
							<li class="txt">
								<a href="password.html" class="passwordBtn"><span class="orange">※ 비밀글입니다.</span></a>
							</li>
						</ul>
						 -->
					</div>
					<!-- //댓글 -->


					<!-- Btn Area -->
					<div class="btnArea">
						<div class="bRight">
							<ul>
								<li><a href="#" class="sbtnMini mw">목록</a></li>
							</ul>
						</div>
					</div>
					<!-- //Btn Area -->
					
				</div>
			</div>
			<!-- //contents -->


<script type="text/javascript" src="js/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="css/jquery.fancybox-1.3.4.css" />
<script type="text/javascript">
$(function(){
	
	var winWidth = $(window).width();
	if(winWidth > 767){
		var layerCheck = 540;
	}else{
		var layerCheck = 320;
	}

	$(".passwordBtn").fancybox({
		'autoDimensions'    : false,
		'showCloseButton'	: false,
		'width' : layerCheck,
		'padding' : 0,
		'type'			: 'iframe',
		'onComplete' : function() {
			$('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height
			$('#fancybox-content').height($(this).contents().find('body').height());
			});
		}
	});


});
</script>

		</div>
	</div>
	<!-- //container -->




	<div id="footerWrap">
		<div id="footer">
			<div id="fnb">
				<ul>
					<li class="left"><a href="#">개인정보취급방침</a></li>
					<li><a href="#">이용약관</a></li>
					<li class="left"><a href="#">이메일무단수집거부</a></li>
					<li><a href="#">고객센터</a></li>
					<li class="left brand"><a href="#">쟈뎅 브랜드 사이트</a></li>
				</ul>
			</div>
			
			<div id="finfo">
				<div id="flogo"><img src="images/txt/flogo.gif" alt="JARDIN THE COFFEE CREATOR, SINCE 1984" /></div>
				<address>
					<ul>
						<li>㈜쟈뎅</li>
						<li>대표자 윤영노</li>
						<li class="tnone">주소 서울시 강남구 논현동 4-21번지 영 빌딩</li>
						<li class="webnone">소비자상담실 02)546-3881</li>
						<li>사업자등록번호 211-81-24727</li>
						<li class="tnone">통신판매신고 제 강남 – 1160호</li>
						<li class="copy">COPYRIGHT © 2014 JARDIN <span>ALL RIGHTS RESERVED.</span></li>
					</ul>
				</address>

				<div id="inicis"><img src="images/ico/ico_inicis.png" alt="이니시스 결제시스템" /></div>
			</div>
		</div>
	</div>



</div>
</div>
</body>
</html>