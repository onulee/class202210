<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %> 
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <% if(session.getAttribute("sessionId")==null){ %>
     <script>
        alert("로그인을 하셔야 접근이 가능합니다.");
        location.href="login.jsp";
     </script>
  <% } %>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>고객행복센터</title>
  <script src="http://code.jquery.com/jquery-latest.min.js" ></script>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
  <!-- db연결 -->
  
  <script>
    $(function(){
    	
    	$.ajax({
    		url:"js/board.json",
    		type:"post",
    		dataType:"json",
    		data:{"id":"aaa"},
    		success:function(data){
    			var htmlData="";
    			for(var board of data){
    				htmlData +="<tr>";
    				htmlData +="<td>"+board.no+"</td>";
    				htmlData +='<td class="table-title"><a href="notice_read.jsp?no='+board.no+'">'+board.title+'</a></td>';
    				htmlData +="<td>"+board.userId+"</td>";
    				htmlData +="<td>"+board.date+"</td>";
    				htmlData +="</tr>";
    			}
    			
    			$("#tbody").html(htmlData);
    		},
    		error:function(){
    			alert("데이터 가져오기 실패");
    		}
    	});
    });
  </script>
</head>
<body>
<!-- header 시작 -->
<%@include file="header.jsp" %>
<!-- header 끝 -->

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
        <col width="46%">
        <col width="15%">
        <col width="15%">
      </colgroup>
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
      </tr>
      <tbody id="tbody">
	      <tr>
	        <td>1</td>
	        <td class="table-title">카카오플러스 친구 오픈</td>
	        <td>2018-07-11</td>
	        <td>2018-07-11</td>
	      </tr>
      </tbody>
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

    <div class="write">쓰기</div>
  </section>

<!-- footer 시작 -->
<%@include file="footer.jsp" %>
<!-- footer 끝 -->
</body>
</html>