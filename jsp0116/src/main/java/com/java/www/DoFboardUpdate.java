package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/DoFboardUpdate")
public class DoFboardUpdate extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		BoardDao bdao = new BoardDao();
		int bno,result;
		String bname,btitle,bcontent,boldfile,bfile;
		//String uploadPath = request.getSession().getServletContext().getRealPath("upload");
		String uploadPath = "C:/upload";
		//enctype 파일업로드
		MultipartRequest multi = new MultipartRequest(request,uploadPath,10*1024*1024,"utf-8",new DefaultFileRenamePolicy());		
		bno = Integer.parseInt(multi.getParameter("bno"));
		btitle = multi.getParameter("btitle");
		bcontent = multi.getParameter("bcontent");
		boldfile = multi.getParameter("boldfile");
		System.out.println("예전파일 : "+boldfile); //an2.jpg
		//첨부파일이름
		Enumeration files = multi.getFileNames(); //Object(bts1.jpg) -> bts11.jpg
		String fileName=null;
		if(files.hasMoreElements()) {
			fileName = (String)files.nextElement();  // 첨부파일의 이름을 가져옴
			fileName = multi.getFilesystemName(fileName);  // 첨부파일의 변경된 이름을 가져옴.
			System.out.println("신규파일이름 : "+fileName);
		}
		
		//첨부파일이 있을경우
		if(fileName==null) bfile = boldfile;
		else bfile = fileName;
		
		result = bdao.boardUpdate(bno,btitle,bcontent,bfile);
		
		if(result==1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println("<script>");
			writer.println("alert('글수정이 되었습니다.');");
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
