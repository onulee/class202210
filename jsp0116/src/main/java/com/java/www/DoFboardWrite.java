package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/DoFboardWrite")
public class DoFboardWrite extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		BoardDao bdao = new BoardDao();
		String bname,btitle,bcontent,bfile;
		int result=0;
		
		//파일첨부
		//String uploadPath = request.getRealPath("upload");
		String uploadPath = request.getSession().getServletContext().getRealPath("upload");
		int size = 10*1024*1024; //10Mb = 10 * 1024Mb * 1024Kb
		
		//enctype 있는 form
		MultipartRequest multi = new MultipartRequest(request,uploadPath, size,"utf-8",new DefaultFileRenamePolicy());
		btitle = multi.getParameter("btitle");
		System.out.println("제목 : "+btitle);
		bname = multi.getParameter("bname");
		bcontent = multi.getParameter("bcontent");
		//첨부파일 이름 가져오기
		Enumeration files = multi.getFileNames(); //모든파일명을 가져옴.
		String fileName=""; //초기화
		if(files.hasMoreElements()) {
			fileName = (String)files.nextElement(); //a.txt
		}
		bfile = multi.getFilesystemName(fileName); //실제파일이름 가져오기 
		System.out.println("파일첨부 명 : "+bfile);
		//enctype 없는 form
//		btitle = request.getParameter("btitle");
//		bname = request.getParameter("bname");
//		bcontent = request.getParameter("bcontent");
		result = bdao.boardInsert(bname,btitle,bcontent,bfile);
		if(result==1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('글쓰기 저장이 되었습니다.');");
			writer.println("location.href='freeboard.jsp';");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('프로그램 오류로 저장이 되지 않았습니다. 다시 입력하세요.');");
			writer.println("history.back()");
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
