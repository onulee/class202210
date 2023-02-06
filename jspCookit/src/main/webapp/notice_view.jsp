<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>notice-view</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
  <script>
    function delBtn(){
    	if(confirm("게시글을 삭제하시겠습니까?")){
    		location.href="notice_del.do?bno=${bvo.bno}&page=${page}";
    	}
    }
    function updateBtn(){
    	if(confirm("게시글을 수정하시겠습니까?")){
    		location.href="notice_update.do?bno=${bvo.bno}&page=${page}";
    	}
    }
  </script>
</head>

<body>
  <!-- top부분 시작 -->
  <%@ include file="top.jsp" %>
  <!-- top부분 끝 -->

  <section>
    <h1>NOTICE</h1>

    <table>
      <tr>
        <th colspan="2"><strong>제 목</strong> <span class="separator">|</span>${bvo.btitle}</th>
      </tr>
      <tr>
        <td><strong>날 짜</strong> <span class="separator">|</span><fmt:formatDate value="${bvo.bdate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
        <td><strong>작성자</strong> <span class="separator">|</span>${bvo.id }</td>
      </tr>
      <tr>
        <td><strong>파일명</strong> <span class="separator">|</span>${bvo.bfile}</td>
        <td><strong>조회수</strong> <span class="separator">|</span>${bvo.bhit }</td>
      </tr>
      <tr>
        <td colspan="2" class="article">
          ${bvo.bcontent }
          <br>
          <c:if test="${bvo.bfile!=null}">
            <img src="upload/${bvo.bfile}" width="80%">
          </c:if>
        </td>
      </tr>
      <tr>
        <td colspan="2"><strong>다음글</strong> <span class="separator">|</span> 
        <c:if test="${nextRnum==null}">
          다음글이 없습니다.
        </c:if>
        <c:if test="${nextRnum!=null}">
          <a href="notice_view.do?bno=${nextbvo.bno}&page=${page}">${nextbvo.btitle }</a>
        </c:if>
        </td>
      </tr>
      <tr>
        <td colspan="2"><strong>이전글</strong> <span class="separator">|</span>
        <c:if test="${preRnum==null}">
          이전글이 없습니다.
        </c:if>
        <c:if test="${preRnum!=null}">         
          <a href="notice_view.do?bno=${prebvo.bno}&page=${page}">${prebvo.btitle }</a>
        </c:if>
        </td>
      </tr>
    </table>

    <div class="list"><a href="notice_list.do?page=${page}">목록</a></div>
    <div class="list" onclick="delBtn()">삭제</div>
    <div class="list" onclick="updateBtn()">수정</div>
  </section>

  <footer>
    <div class="wrapper">
      <div class="footer-left">
        <div class="footer-logo"></div>
        <div class="copyright">© COOKIT ALL RIGHTS RESERVED</div>
      </div>
  
      <div class="footer-center">
        <ul class="footer-nav">
          <li class="first-list">이용약관</li>
          <li class="green">개인정보처리 방침</li>
          <li>법적고지</li>
          <li>사업자정보 확인</li>
        </ul>
  
        <ul class="footer-info">
          <li class="first-list">씨제이제일제당(주)</li>
          <li>대표이사 : 손경식,강신호,신현재</li>
          <li>사업자등록번호 : 104-86-09535</li>
          <li class="first-list">주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</li>
          <li>통신판매업신고 중구 제 07767호</li>
          <li class="first-list">개인정보보호책임자 : 조영민</li>
          <li>이메일 : cjon@cj.net</li>
          <li>호스팅제공자 : CJ올리브네트웍스㈜</li>
        </ul>
  
        <div id="check">고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <span class="check">가입 사실 확인</span></div>
      </div>
  
      <div class="footer-right">
        <div id="shortcut">
          <span>CJ그룹계열사 바로가기</span>
          <div class="shortcut"></div>
        </div>
  
        <div class="call">고객행복센터 1668-1920</div>
        <div class="inquery">1:1 문의</div>
      </div>
  
    </div>
  </footer>
</body>
</html>