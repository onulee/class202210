<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
</head>
<body>
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
    <script>
      $(function(){
    	 $.ajax({
    		url:"js/board.json",
 			type:"post",
 			data:{"no":"1"},
 			dataType:"json",
 			success:function(data){
 				//alert("데이터가져오기 성공");
 				console.log(data);
 				var htmlData="";
 				for(var board of data){
 					htmlData += "<tr>";
 					htmlData += "<td><span class='table-notice'>"+board.no+"</span></td>";
 					htmlData += "<td class='table-title'>";
 					htmlData += "<a href='board_content_view.jsp?no="+board.no+"'>"+board.title+"</a>";
 					htmlData += "</td>";
 					htmlData += "<td>"+board.userId+"</td>";
 					htmlData += "<td>"+board.date+"</td>";
 					htmlData += "<td>"+board.hit+"</td>";
 					htmlData += "</tr>";
 				}//for
 				$("#tbody").html(htmlData);
 			},
 			error:function(){
 				alert("데이터가져오기 실패");
 			}
    	 });//ajax 
      });//function
    </script>
    <table>
      <colgroup>
        <col width="15%">
        <col width="45%">
        <col width="14%">
        <col width="14%">
        <col width="12%">
      </colgroup>
      <!-- 제목부분 -->
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <!-- 내용부분 -->
      <tbody id="tbody">
	      
      </tbody>
      
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num"><div>1</div></li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <a href="write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>