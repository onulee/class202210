package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	//로그인
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		MemberDao mdao = new MemberDao();
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//매개변수 memdto
		MemberDto memdto = new MemberDto(id,pw);
		//리턴값 mdto
		MemberDto mdto=null;
		mdto = mdao.memberSelectOne(memdto);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><body>");
		writer.println("<script>");
		if(mdto!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("sessionId",mdto.getId());
			session.setAttribute("sessionName",mdto.getName());
			writer.println("alert('로그인이 되었습니다.!');");
			writer.println("location.href='index.jsp';");
		}else {
			writer.println("alert('아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인 해주세요.');");
			writer.println("location.href='login.jsp';");
		}
		writer.println("</script>");
		writer.println("</body></html>");
		writer.close();
		
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
