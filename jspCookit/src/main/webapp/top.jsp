<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>    
<header>
    <ul>
      <c:if test="${sessionId==null}">
	      <li><a href="join01_terms.do">회원가입</a></li> <span>|</span>
	      <li><a href="login.do">로그인</a></li> <span>|</span>
      </c:if>
      <c:if test="${sessionId!=null}">
	      <li><a href="member_info_update.do">${sessionName}님</a></li> <span>|</span>
	      <li><a href="logout.do">로그아웃</a></li> <span>|</span>
      </c:if>
      <li><a href="notice_list.do">고객행복센터</a></li> <span>|</span>
      <li>배송지역검색</li> <span>|</span>
      <li>기프트카드 등록</li>
    </ul>
  </header>

  <nav>
    <a href="index.do"><div class="logo"></div></a>

    <div id="search">
      <div class="search"></div><br>
      <span>메뉴찾기</span>
    </div>

    <div id="cart">
      <div class="cart"></div><br>
      <span>장바구니</span>
    </div>

    <div class="nav-menu">
      <ul>
        <li>COOKIT소개</li>
        <li>COOKIT 메뉴</li>
        <li>리뷰</li>
        <li>이벤트</li>
        <li>MY쿡킷</li>
      </ul>  
    </div>
  </nav>