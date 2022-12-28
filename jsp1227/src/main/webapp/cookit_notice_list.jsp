<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>notice list</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
</head>
<body>
  <!-- header include -->
  <%@include file="cookit_header.jsp" %>
  <section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="/search" name="search" method="post">
        <select name="category" id="category">
          <option value="0">전체</option>
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>

        <div class="title">
          <input type="text" size="16">
        </div>
  
        <button type="submit"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="18%">
        <col width="60%">
        <col width="18%">
      </colgroup>
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성일</th>
      </tr>
      <tr>
        <td><span class="table-notice">NOTICE</span></td>
        <td class="table-title">신종코로나바이러스 예방관련 운영 안내</td>
        <td>2020-02-28</td>
      </tr>
      <tr>
        <td><span class="table-notice">NOTICE</span></td>
        <td class="table-title">[2020년3월] 시설 정비 공사 안내</td>
        <td>2020-02-28</td>
      </tr>
      <tr>
        <td><span class="table-notice">NOTICE</span></td>
        <td class="table-title">[키즈잼] 2020년 이용 시간 & 이용 요금 변경 안내</td>
        <td>2019-12-11</td>
      </tr>
      <tr>
        <td><span class="table-notice">NOTICE</span></td>
        <td class="table-title">[키즈잼] 2020년 1분기 정기 휴관일 안내</td>
        <td>2019-12-11</td>
      </tr>
      <tr>
        <td><span class="table-notice">NOTICE</span></td>
        <td class="table-title">홈페이지 개인정보 보안 강화</td>
        <td>2018-11-14</td>
      </tr>
      <tr>
        <td>5</td>
        <td class="table-title">[키즈잼] 3월 프로그램 안내</td>
        <td>2020-02-18</td>
      </tr>
      <tr>
        <td>4</td>
        <td class="table-title">[키즈잼] 2월 프로그램 안내</td>
        <td>2020-01-17</td>
      </tr>
      <tr>
        <td>3</td>
        <td class="table-title">마이다스 멤버쉽 안내</td>
        <td>2019-05-08</td>
      </tr>
      <tr>
        <td>2</td>
        <td class="table-title">[마이다스 호텔&리조트] 제23회 경기건축문화 금상 수상</td>
        <td>2018-10-10</td>
      </tr>
      <tr>
        <td>1</td>
        <td class="table-title">카카오플러스 친구 오픈</td>
        <td>2018-07-11</td>
      </tr>
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num">
        <div>1</div>
      </li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <% if(session.getAttribute("sessionId") != null){ %>
      <% if(session.getAttribute("sessionId").equals("admin")){ %>
      <a href="cookit_write.jsp"><div class="write">쓰기</div></a>
      <% } %>
    <% } %>
  </section>
  <!-- footer include -->
  <%@include file="cookit_footer.jsp" %>

</body>
</html>