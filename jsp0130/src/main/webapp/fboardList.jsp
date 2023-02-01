<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자유게시판</title>
		<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		  a{text-decoration: none;}
		  table,th,td{border:1px solid black; border-collapse: collapse; }
		  h2{text-align: center;}
		  table{width:920px; margin: 0 auto; text-align: center; }
		  th,td{height:40px;}
		  tr td:nth-of-type(2){text-align: left; padding-left:40px; box-sizing: border-box;}
		  div{width: 250px; height:60px; margin:12px auto 0;   }
		  button{display: inline-block; width:120px; height:40px; }
		  .img{width:10px;}
		  .material-symbols-outlined {
			  font-variation-settings:
			  'FILL' 0,
			  'wght' 200,
			  'GRAD' 0,
			  'opsz' 22
			}
			.searchDiv{width:470px; height:40px; margin:50px auto 20px; }
			.searchDiv select{width: 80px; height:40px; font-size: 15px;}
			.searchDiv input{width: 250px; height:35px; font-size: 15px;}
			.numbering{width:460px; height:40px; margin:20px auto 40px; text-align: center;}
			.numbering span{width:40px; height:40px; display: inline-block; border:1px solid black; 
			box-sizing: border-box; text-align: center; font-size:15px; padding-top:9px;}
			#on{background: #e56e00; color:#fff; }
		</style>
		<script>
		  function searchBtn(){
			  if($("#searchWord").val().length<1){
				  alert("검색어를 입력하셔야 검색이 가능합니다.");
				  $("#searchWord").focus();
				  return;
			  }
			  searchFrm.submit();
		  }
		</script>
	</head>
	<body>
		<h2>자유게시판</h2>
		<div class="searchDiv">
		  <form action="doBoardSearch.do" method="get" name="searchFrm">
		    <select name="searchTitle" id="searchTitle">
		       <option value="all">전체</option>
		       <option value="btitle">제목</option>
		       <option value="bcontent">내용</option>
		       <option value="id">작성자</option>
		    </select>
		    <input type="text" name="searchWord" id="searchWord">
		    <button type="button" onclick="searchBtn()">검색</button>
		  </form>
		</div>
		<table>
		   <colgroup>
		     <col width="8%">
		     <col width="49%">
		     <col width="13%">
		     <col width="20%">
		     <col width="10%">
		   </colgroup>
			<tr>
			  <th>번호</th>
			  <th>제목</th>
			  <th>작성자</th>
			  <th>날짜</th>
			  <th>조회수</th>
			</tr>
			<c:if test="${result=='success' }">
				<c:forEach items="${list}" var="bBean">
					<tr>
					  <td>${bBean.bno}</td>
					  <td>
					  <c:forEach begin="1" end="${bBean.bindent}" step="1">
					    <img class="img" src="images/icon_reply.png">
					  </c:forEach>
						  <a href="fboardView.do?bno=${bBean.bno}&page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}">
						  	${bBean.btitle}</a> <c:if test="${bBean.bfile!=null }">
						  	<span class="material-symbols-outlined">folder_open</span></c:if>
						  
					  </td>
					  <td>${bBean.id}</td>
					  <td>
					    <fmt:formatDate value="${bBean.bdate}" pattern="yyyy-MM-dd"/>
					  </td>
					  <td>${bBean.bhit}</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${result=='fail' or list.size()==0}">
				<tr>
				  <td colspan="5">데이터가 없습니다.</td>
				</tr>
			</c:if>
		</table>
		<div class="numbering">
		<!-- 첫페이지 이동  -->
		<c:if test="${page==1}"><span>&#171;</span></c:if>
		<c:if test="${page!=1}">
		  <a href="fboardList.do?page=1&searchTitle=${searchTitle}&searchWord=${searchWord}"><span>&#171;</span></a>
		</c:if>
		<!-- 이전페이지 이동 -->
		<c:if test="${page>1}">
   		  <a href="fboardList.do?page=${page-1}&searchTitle=${searchTitle}&searchWord=${searchWord}"><span>&#60;</span></a>
		</c:if>
		<c:if test="${page==1}">
		  <span>&#60;</span>
		</c:if>
		<!-- 하단넘버링부분 -->
		<c:forEach begin="${startpage }" end="${endpage}" step="1" var="num">
		      <c:if test="${page==num}">
			    <span id="on">${num}</span>
			  </c:if>
			  <c:if test="${page!=num}">
			    <a href="fboardList.do?page=${num}&searchTitle=${searchTitle}&searchWord=${searchWord}">
			      <span>${num}</span>
			    </a>
			  </c:if>
		</c:forEach>
		<!-- 다음페이지 이동 -->
		<c:if test="${page==maxpage}"><span>&#62;</span></c:if>
		<c:if test="${page<maxpage}">
  		  <a href="fboardList.do?page=${page+1}&searchTitle=${searchTitle}&searchWord=${searchWord}">
  		    <span>&#62;</span>
  		  </a>
		</c:if>
		<!-- 끝페이지 이동 -->
		<c:if test="${page!=maxpage}">
		    <a href="fboardList.do?page=${maxpage}&searchTitle=${searchTitle}&searchWord=${searchWord}">
		      <span>&#187;</span>
		    </a>
		</c:if>
		<c:if test="${page==maxpage }"><span>&#187;</span></c:if>
		</div>
		
		<div>
		  <a href="fboardWrite.do?page=${page}&searchTitle=${searchTitle}&searchWord=${searchWord}"><button type="button">글쓰기</button></a>
		  <a href="index.do"><button type="button">메인페이지</button></a>
		</div>
	</body>
</html>