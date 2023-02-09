<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- <script src="http://code.jquery.com/jquery-latest.min.js"></script> -->
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/admin_account.css">
  <style>
    #div_chart{border:1px solid black; width:800px; height:600px; margin:50px auto;}
    #stitle{font-size: 30px; text-align: center; margin-top:50px;}
    .changeYear{text-align: center; margin:30px auto; width:200px; height:40px; display: block; }
  </style>
</head>

<body>
  <header>
    <div id="header-left">
      LMS <span>ENTERPRISE</span> Type
    </div>
    <div id="header-right">
      <span>관리자 (GMT+9:00) Seoul</span>
      <img src="http://lmsenterprise2019.itmap.co.kr/_admin/image/logout.png" alt="">

      <table>
        <tr>
          <td class="select">
            <img src="http://lmsenterprise2019.itmap.co.kr/_admin/image/KOR.png" alt="">
            <span>한국어</span>
          </td>
          <td class="arrow">
            <div class="separator"></div>
            <span>▼</span>
          </td>
        </tr>
      </table>

      <table>
        <tr>
          <td class="select">
            <span>LMS 매뉴얼</span>
          </td>
          <td class="arrow">
            <div class="separator"></div>
            <span>▼</span>
          </td>
        </tr>
      </table>
    </div>
  </header>

  <nav>
    <ul>
      <li onclick="chartBtn()"><span class="nav1">&emsp;</span> 회원관리</li>
      <li><span class="nav2">&emsp;</span> 상품관리</li>
      <li><span class="nav3">&emsp;</span> 공지사항</li>
      <li><span class="nav4">&emsp;</span> 이벤트</li>
    </ul>
  </nav>
  <script>
    function chartBtn(){
	    var monthData=[];
	    var saleData=[];
	    var labelData;
	    var changeYear = $(".changeYear").val();
    	//---------------------------------------------------
    	//  데이터 가져오기
    	$.ajax({
    		type:"post",
    		url:"total_sale_chart.do",
    		data:{"changeYear":changeYear},
    		dataType:"json",
    		success:function(data){
    			alert("성공");
    			console.log(data);
    			labelData = '[ '+data.syear+' 년 월매출 현황 ]';
    			
    			monthData = data.monthData;
    			saleData = data.saleData;
    			
    			//let chart = new Chart();
    			//---------------------------------------------------
    	    	//alert("차트그리기 시작");
    	    	let ctx = document.getElementById('myChart');

    	    	    new Chart(ctx, {
    	    	    type: 'line',
    	    	    data: {
    	    	      labels: monthData,
    	    	      datasets: [{
    	    	        label: labelData,
    	    	        data: saleData,
    	    	        backgroundColor: [
    	    	            'rgba(255, 99, 132, 0.2)',
    	    	            'rgba(255, 159, 64, 0.2)',
    	    	            'rgba(255, 205, 86, 0.2)',
    	    	            'rgba(75, 192, 192, 0.2)',
    	    	            'rgba(54, 162, 235, 0.2)',
    	    	            'rgba(153, 102, 255, 0.2)'
    	    	        ],
    	    	        borderColor: [
    	   	              'rgb(255, 99, 132)',
    	   	              'rgb(255, 159, 64)',
    	   	              'rgb(255, 205, 86)',
    	   	              'rgb(75, 192, 192)',
    	   	              'rgb(54, 162, 235)',
    	   	              'rgb(153, 102, 255)'
    	   	            ],  
    	    	        borderWidth: 1
    	    	      }]
    	    	    },
    	    	    options: {
    	    	      scales: {
    	    	        y: {
    	    	          beginAtZero: true
    	    	        }
    	    	      }
    	    	    }
    	    	  });
    	    	  //-------------------------------------
    			
    			
    			
    			
    			
    		},
    		error:function(){
    			alert("실패");
    		}
    		
    		
    		
    	});
    	
    	
    	
    }//chartBtn
  </script>
  <h2 id="stitle">년도별 매출현황 그래프</h2>
  <select class="changeYear" onchange="chartBtn()">
    <option >년도를 선택하세요. :::</option>
    <option value="2021">2021년도 매출현황</option>
    <option value="2022">2022년도 매출현황</option>
    <option value="2023">2023년도 매출현황</option>
  </select>
  <div id="div_chart">
	  <canvas id="myChart"></canvas>
  </div>

</body>
</html>