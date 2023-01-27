package com.site.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.service.FBService;
import com.site.www.service.FboardList;
import com.site.www.service.FboardView;


@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		FBService fbservice=null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String fName = uri.substring(conPath.length()+1);
		System.out.println("호출URL : "+fName);
		String url="";
		
		switch (fName) {
		case "index.do":  //메인페이지
			url="index.jsp";
			break;
		case "fboardList.do": //리스트페이지
			fbservice = new FboardList();
			fbservice.execute(request, response);
			url="fboardList.jsp";
			break;
		case "fboardView.do": //뷰페이지
			fbservice = new FboardView();
			fbservice.execute(request, response);
			url="fboardView.jsp";
			break;
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		
		
	}
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
