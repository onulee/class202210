package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//객체선언
		MemberDao mdao = new MemberDao();
		//로그인 메소드호출
		MemberDto mdto = mdao.selectLogin(id,pw);
		if(mdto.getId()==null) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인해주세요.');");
			writer.println("location.href='login.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", id);
			session.setAttribute("sessionName", mdto.getName());
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('로그인 성공!!');");
			writer.println("location.href='index.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
		}
		
		
		
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
