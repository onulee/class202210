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
import javax.servlet.http.HttpSession;


@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
	    request.setCharacterEncoding("utf-8");
	    
	    Connection conn=null;
	    Statement stmt=null;
	    ResultSet rs=null;
	    String id,pw,name=null;
	    id = request.getParameter("id");
	    pw = request.getParameter("pw");
	    
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orauser","1111");
			stmt = conn.createStatement();
			String query = "select * from member where id='"+id+"' and pw='"+pw+"'";
			rs = stmt.executeQuery(query);
			if(rs.next()) {
				name = rs.getString("name");
				// servlet에서는 session내부객체가 아님. 선언이 필요
				HttpSession session = request.getSession();
				session.setAttribute("sessionId", id);
				session.setAttribute("sessionName", name);
				
				//html
				response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer.println("<html><head></head>");
				writer.println("<script>");
				writer.println("alert('로그인성공!');");
				writer.println("location.href='./index.jsp';");
				writer.println("</script>");
				writer.println("</html>");
				writer.close();
				
				
				
			}else {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer.println("<html><head></head>");
				writer.println("<script>");
				writer.println("alert('아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인해주세요.!');");
				writer.println("location.href='./login.jsp';");
				writer.println("</script>");
				writer.println("</html>");
				writer.close();
				
			}
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
