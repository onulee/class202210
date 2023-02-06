<%@page import="com.cookit.www.vo.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>Pages - 글쓰기</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/write.css">
  <script>
    function cancelBtn(){
    	if(confirm("수정을 취소하시겠습니까?")) location.href="notice_list.do?page="+${page};
    }
    
    function writeBtn(){
    	if($("#btitle").val()==""){
    		alert("제목을 입력하셔야 수정이 가능합니다.");
    		$("#btitle").focus();
    		return;
    	}
    	
    	if(confirm("게시글을 수정하시겠습니까?")){
    		update.submit();
    	} 
    }
  </script>
</head>

<body>
  <!-- top부분 시작 -->
  <%@ include file="top.jsp" %>
  <!-- top부분 끝 -->

  <section>
    <h1>관리자 수정</h1>
    <hr>
    <form action="doNotice_update.do" name="update" method="post" enctype="multipart/form-data">
      <input type="hidden" name="page" value="${page}">
      <input type="hidden" name="bno" value="${bvo.bno}">
      <input type="hidden" name="oldfile" value="${bvo.bfile}">
      
      <table>
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>상단노출</th>
          <td>
            <div class="category-wrapper">
              <select name="topchk" id="topchk">
                <option value="0" <c:if test="${bvo.topchk==0}">selected</c:if>>비공지</option>
                <option value="1" <c:if test="${bvo.topchk==1}">selected</c:if>>공지</option>
              </select>  
            </div>
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="btitle" id="btitle" value="${bvo.btitle}">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea name="bcontent" id="bcontent" cols="50" rows="10">${bvo.bcontent}</textarea>
          </td>
        </tr>
        <tr>
          <th>파일명</th>
          <td>${bvo.bfile}</td>
        </tr>
        <tr>
          <th>이미지 표시</th>
          <td>
            <input type="file" name="bfile" id="bfile">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
        <button type="button" onclick="writeBtn()" class="write">수정</button>
        <button type="button" onclick="cancelBtn()" class="cancel">취소</button>
      </div>
    </form>

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