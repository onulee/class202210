package com.java.www;

import java.io.IOException;
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
		FreeboardDao fdao = new FreeboardDao();
		String id,btitle,bcontent,bfile="";
		int result=0;
		//파일관련
		String uploadPath = "C:/upload";
		int size = 10*1024*1024; // 10Mb = 10 * 1MB * 1KB
		MultipartRequest multi = new MultipartRequest(request, uploadPath,size,"utf-8",new DefaultFileRenamePolicy());
		btitle = multi.getParameter("btitle");
		bcontent = multi.getParameter("bcontent");
		id = multi.getParameter("id");
		Enumeration files = multi.getFileNames();
		String fileName="";
		while(files.hasMoreElements()) {
			fileName = (String)files.nextElement();
			bfile = multi.getFilesystemName(fileName);
		}
		
		result = fdao.fboardInsert(new FreeboardDto(id,btitle,bcontent,bfile));
		
		
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
