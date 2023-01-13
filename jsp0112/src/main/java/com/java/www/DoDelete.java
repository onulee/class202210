package com.java.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DoDelete")
public class DoDelete extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 섹션이 없으면 메인페이지 이동
		HttpSession session = request.getSession();
		if(session.getAttribute("sessionId")==null) response.sendRedirect("index.jsp");
		
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		int result=0;
		MemberDao mdao = new MemberDao();
		//삭제메소드
		result = mdao.deleteMember(id);
		
		response.sendRedirect("memberAll.jsp");
		
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
