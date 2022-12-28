<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
  <script>
    $(function(){
    	var no = <%= request.getParameter("no") %>;
    	$.ajax({
    		url:"js/board.json",
 			type:"post",
 			data:{"no":"1"},
 			dataType:"json",
 			success:function(data){
 				//alert("데이터가져오기 성공");
 				console.log(data);
 				var boardCheck=0;
 				for(var board of data){
 					if(board.no==no){
 						$("#title").text(board.title);
 						$("#userId").text(board.userId);
 						$("#hit").text(board.hit);
 						$("#content").text(board.content);
 						boardCheck=1;
 					}
 				}//for
 				
 				if(boardCheck==0){
 					alert("찾고자 하는 데이터가 없습니다.");
 					history.back();
 				}
 			},
 			error:function(){
 				alert("데이터가져오기 실패");
 			}
    	});
    	
    });//function
  </script>
</head>
<body>
<section>
    <h1>NOTICE</h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th colspan="3">제목</th>
      </tr>
      <tr>
        <td colspan="3"><strong id="title">게시판 글제목이 들어갑니다.</strong></td>
      </tr>
      <tr>
        <td id="userId">작성자가 들어갑니다.</td>
        <td>조회수</td>
        <td id="hit">111</td>
      </tr>
      <tr>
        <td colspan="3" class="article" id="content">글 내용이 들어갑니다.</td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>

    <a href="board_list.jsp"><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
    <a href=""><div class="list">수정</div></a>
    <a href=""><div class="list">답변달기</div></a>
  </section>
</body>
</html>