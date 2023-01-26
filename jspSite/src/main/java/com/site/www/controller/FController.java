package com.site.www.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.service.MDoLoginService;
import com.site.www.service.MMemberAll;
import com.site.www.service.MMemberCheckId;
import com.site.www.service.MMemberInsert;
import com.site.www.service.MService;


@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String fName = uri.substring(conPath.length()+1);
		System.out.println(fName);
		String url="";
		MService mservice=null;
		
		switch (fName) {
		case "login.do": //로그인페이지
			url="login.jsp";
			break;
		case "doLogin.do": //로그인체크
			mservice = new MDoLoginService();
			mservice.execute(request, response);
			System.out.println("결과 : "+request.getAttribute("result"));
			url="doLogin.jsp";
			break;
		case "logout.do": //로그아웃페이지
			url="logout.jsp";
			break;
		case "join.do": //회원가입페이지
			url="join.jsp";
			break;
		case "doJoin.do": //회원가입페이지
			mservice = new MMemberInsert();
			mservice.execute(request, response);
			if((int)request.getAttribute("result")==0)
				url="join.jsp";
			else
				url="success.jsp";
			break;
		case "memberAll.do": //전체회원보기
			mservice = new MMemberAll();
			mservice.execute(request, response);
			url="memberAll.jsp";
			break;
		case "checkId.do": //아이디체크
			mservice = new MMemberCheckId();
			mservice.execute(request, response);
			System.out.println("request : "+request.getAttribute("result"));
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println(request.getAttribute("result"));
			writer.close();
			url=null;
			break;
			

		}//switch
		
		if(url!=null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		
	}//
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}