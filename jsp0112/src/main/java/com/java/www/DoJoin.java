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
		String id,pw,name,phone,gender,hobby="";
		String[] hobbys=null;
		int result=0,tempPage=0;
		tempPage = Integer.parseInt(request.getParameter("tempPage"));
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
		
		MemberDao mDao = new MemberDao();
		result = mDao.insertMember(id,pw,name,phone,gender,hobby);
		if(result==1) {
			response.sendRedirect("joinResult.jsp?tempPage="+tempPage);
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('입력한 데이터가 문제가 있습니다. 다시 입력하세요.');");
			writer.println("history.back();");
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
