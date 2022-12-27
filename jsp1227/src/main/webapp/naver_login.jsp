<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            position: relative;
            height: 100%;
            background: #f5f6f7;
        }
        #wrap{
            position: relative;
            min-height: 100%;
            font-size: 12px;
        }
        #header{
            position: relative;
            box-sizing: border-box;
            height: 168px;
            padding: 62px 0 0;
            width: 768px;
            margin: 0 auto;
        }

        #h_logo{
            display: block;
            overflow: hidden;
            width: 231px;
            height: 44px;
            margin: 0 auto;
            font-size: 15px;
            color: transparent;
            background: url("https://static.nid.naver.com/images/ui/login/pc_sp_login_190522.png") no-repeat -1px -1px;
        }
        #container{
            padding-bottom: 50px;
            min-height: 185px;
        }
        #content{
            width: 460px;
            margin: 0 auto;
            padding-bottom: 30px;
        }
        .id_area{
            position: relative;
        }
        .input_row{
            position: relative;
            height: 29px;
            margin: 0 0 14px;
            padding: 10px 35px 10px 15px;
            border: solid 1px #dadada;
            background: #fff;
        }
        .input_box{
            display: block;
            overflow: hidden;
        }

        .int{
            font-size: 15px;
            line-height: 16px;
            position: relative;
            z-index: 9;
            width: 100%;
            height: 16px;
            padding: 7px 0 6px;
            color: #000;
            border: none;
            background: #fff;
            appearance: none;
        }
        .btn_login{
            display: block;
            width: 100%;
            height: 61px;
            margin:30px 0 14px;
            padding-top: 1px;
            border: none;
            background: #03c75a;
            text-align: center;
            color: #fff;
            font-size: 20px;
            font-weight: 700;
            line-height: 61px;
            cursor: pointer;
        }
    </style>
    <script>
      function frmCheck(){
    	  if($("#uId").val().length<2){
    		  alert("아이디를 입력하셔야 로그인이 가능합니다.");
    	  }
    	  frm.submit();
      }
    </script>
</head>
<body>
<div id="wrap">
    <div id="header">
        <h1>
            <a href="#" id="h_logo"></a>
        </h1>
    </div>
    <div id="container">
        <div id="content">
            <div style="margin-bottom: 7px"></div>
            <form action="doNaver_login.jsp" method="post" name="frm">
                <fieldset style="border: 0">
                    <div class="id_area">
                        <div class="input_row" id="id_area">
                            <span class="input_box">
                                <input type="text" name="id" id="uId" class="int" placeholder="아이디">
                            </span>
                        </div>
                    </div>
                    <div class="pw_area">
                        <div class="input_row" id="pw_area">
                            <span class="input_box">
                                <input type="text" name="pw" id="uPw" class="int" placeholder="비밀번호">
                            </span>
                        </div>
                    </div>
                    <input class="btn_login" type="button" onclick="frmCheck()" value="로그인">
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>