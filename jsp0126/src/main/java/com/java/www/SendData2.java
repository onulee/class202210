package com.java.www;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SendData2")
public class SendData2 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		ArrayList<MemberDto> list = new ArrayList<>();
		list.add(new MemberDto("aaa","1111","홍길동","010-1111-1111","남성","golf"));
		list.add(new MemberDto("bbb","1111","유관순","010-2222-3333","여성","game"));
		list.add(new MemberDto("ccc","1111","이순신","010-3333-3333","남성","book"));
		request.setAttribute("titleName", "전체회원정보");
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp0126_03.jsp");
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
