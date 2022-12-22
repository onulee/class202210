package com.java.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns={"/s01"},initParams= {@WebInitParam(name="mapId",value="ddd"),
//		@WebInitParam(name="mapPw",value="1234")})
public class s1222_01 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		System.out.println("doAction");
		//web.xml
		//String id = getInitParameter("userId");
		//String pw = getInitParameter("userPw");
		
		String conId = getServletContext().getInitParameter("conId");
		String conPw = getServletContext().getInitParameter("conPw");
		
		System.out.println(conId);
		System.out.println(conPw);
		
		String id = getInitParameter("mapId");
		String pw = getInitParameter("mapPw");
		
		System.out.println(id);
		System.out.println(pw);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("<h2>id : ");
		writer.println(id);
		writer.println("</h2>");
		writer.println("<h2>pw : ");
		writer.println(pw);
		writer.println("</h2>");
		writer.println("</body></html>");
		
		
		
		
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
