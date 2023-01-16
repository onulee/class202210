package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DoJoin")
public class DoJoin extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		MemberDao mdao = new MemberDao();
		String id,pw,name,phone,gender,hobby="";
		String[] hobbys=null;
		int result=0;
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone = request.getParameter("phone");
		gender = request.getParameter("gender");
		hobbys = request.getParameterValues("hobby");
		for(int i=0;i<hobbys.length;i++) {
			if(i==0) hobby += hobbys[i];
			else hobby += ","+hobbys[i];
		}
		
		MemberDto mdto = new MemberDto(id,pw,name,phone,gender,hobby);
		result = mdao.insertMember(mdto);
		
		if(result==1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('회원가입이 완료되었습니다.!!');");
			writer.println("location.href='index.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('시스템의 오류가 있어 가입이 되지 않았습니다. 다시 입력바랍니다.');");
			writer.println("location.href='index.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
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
