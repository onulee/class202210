package com.java.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String fName = uri.substring(conPath.length());
		System.out.println("파일이름 : "+fName);
		
		switch (fName) {
		case "/login.do":
			System.out.println("login.do페이지 호출");
			response.sendRedirect("login.jsp");
			break;
		case "/doLogin.do":
			System.out.println("doLogin.do페이지 호출");
			DoLoginService service = new DoLoginService();
			MemberDto mdto = service.execute(request, response);
			if(mdto!=null) {
				session.setAttribute("sessionId", mdto.getId());
				session.setAttribute("sessionName", mdto.getName());
				response.sendRedirect("index.jsp");
			}else {
				session.setAttribute("sessionError", "error");
				response.sendRedirect("login.jsp");
			}
			break;
		case "/logout.do":
			System.out.println("logout.do페이지 호출");
			response.sendRedirect("logout.jsp");
			break;
		case "/join.do":
			System.out.println("join.do페이지 호출");
			response.sendRedirect("join.jsp");
			break;
		case "/doJoin.do":
			System.out.println("doJoin.do페이지 호출");
			DoJoinService service2 = new DoJoinService();
			int result = service2.execute(request, response);
			if(result==1) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("join.jsp");
			}
			break;
		default:
			break;
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
