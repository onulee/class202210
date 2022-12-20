package com.java.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// html에서 form -> input text박스 name 1개, button 1개
// 버튼을 클릭하면 자바스크립트로 alert('테스트') 띄워 보세요.

@WebServlet("/wC")
public class s1220_02 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		
		request.setCharacterEncoding("utf-8");  //post방식에서 한글처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head><title>jsp form</title>");
		writer.println("<script> function btn(){ alert('테스트'); } </script>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<form action='#' method='get'>");
		writer.println("<input type='text' name='name' id='name'>");
		writer.println("<button type='button' onclick='javascript:alert(\"테스트\")'>전송</button>");
		writer.println("</form>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}
}//class
