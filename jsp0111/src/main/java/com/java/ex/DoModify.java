package com.java.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DoModify")
public class DoModify extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		
		
		request.setCharacterEncoding("utf-8");
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		int result=0;
		String id,pw,name,phone,gender,hobby="";
		String[] hobbys=null;
		
		id=request.getParameter("id");
		pw=request.getParameter("pw");
		name=request.getParameter("name");
		phone=request.getParameter("phone");
		gender=request.getParameter("gender");
		hobbys=request.getParameterValues("hobby");
		System.out.println("1");
		for(int i=0;i<hobbys.length;i++) {
			if(i==0) hobby += hobbys[i];
			else hobby += ","+hobbys[i];
		}
		
		System.out.println("2");
		try {
			System.out.println("3");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orauser","1111");
			stmt = conn.createStatement();
			String query = "update member set phone='"+phone+"',gender='"+gender+"',hobby='"+hobby+"' where id='"+id+"' ";
			result = stmt.executeUpdate(query);
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('회원정보가 수정되었습니다.!');");
			writer.println("location.href='index.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
			
			writer.close();
			System.out.println("4");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//try
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
