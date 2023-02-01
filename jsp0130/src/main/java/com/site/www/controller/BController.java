package com.site.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.www.service.BSerivceBoardDelete;
import com.site.www.service.BSerivceBoardInsert;
import com.site.www.service.BSerivceBoardReplyInsert;
import com.site.www.service.BService;
import com.site.www.service.BServiceSelectAll;
import com.site.www.service.BServiceSelectOne;
import com.site.www.service.BServiceUpdate;


@WebServlet("*.do")
public class BController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8"); //post한글처리
		BService bservice=null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath(); //프로젝트명
		String fName = uri.substring(conPath.length()+1); //파일명
		System.out.println("파일이름 : "+fName);
		String url = "";
		
		switch (fName) {
		case "index.do":  //메인페이지
			url="index.jsp";
			break;
		case "fboardList.do":  //list페이지
			bservice = new BServiceSelectAll();
			bservice.execute(request, response);
			url="fboardList.jsp";
			break;
		case "fboardView.do":  //view페이지
			bservice = new BServiceSelectOne();
			bservice.execute(request, response);
			url="fboardView.jsp";
			break;
		case "fboardWrite.do":  //글쓰기페이지
			url="fboardWrite.jsp?page="+request.getParameter("page");
			break;
		case "doFboardWrite.do": //글쓰기저장 실행
			bservice = new BSerivceBoardInsert();
			bservice.execute(request, response);
			url="doFboard.jsp";
			break;
		case "fboardUpdate.do":  //업데이트페이지
			bservice = new BServiceSelectOne();
			bservice.execute(request, response);
			url="fboardUpdate.jsp";
			break;
		case "doFboardUpdate.do":  //업데이트 실행
			bservice = new BServiceUpdate();
			bservice.execute(request, response);
			url="doFboard.jsp";
			break;
		case "doFboardDelete.do": //삭제 실행
			bservice = new BSerivceBoardDelete();
			bservice.execute(request, response);
			url="doFboard.jsp";
			break;
		case "fboardReply.do":  //reply 페이지
			bservice = new BServiceSelectOne();
			bservice.execute(request, response);
			url="fboardReply.jsp";
			break;	
		case "doFboardReply.do":  //reply 실행
			bservice = new BSerivceBoardReplyInsert();
			bservice.execute(request, response);
			url="doFboard.jsp";
			break;	
		case "doBoardSearch.do":  //검색 실행
			bservice = new BServiceSelectAll();
			bservice.execute(request, response);
			url="fboardList.jsp";
			break;	
			

		}//switch
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
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
