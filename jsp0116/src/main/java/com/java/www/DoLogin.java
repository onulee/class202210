package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		MemberDao mdao = new MemberDao();
		String id="",pw="";
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		MemberDto mdto = mdao.memberSelectOne(id,pw);
		if(mdto!=null) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('로그인이 되었습니다.');");
			writer.println("location.href='index.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
			
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('아이디 또는 패스워드가 일치하지 않습니다.');");
			writer.println("location.href='login.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
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
