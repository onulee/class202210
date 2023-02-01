package com.site.www.service;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.www.bean.BoardBean;
import com.site.www.dao.BoardDao;

public class BSerivceBoardInsert implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		String id,btitle,bcontent,bfile="",fileName="";
		int result=0;
		int page=1;
		String searchTitle="",searchWord="";
		
		//String uploadPath = request.getRealPath("upload");
		String uploadPath="C:/upload";
		int size = 10*1024*1024; //10mb
	    try {
			MultipartRequest multi = new MultipartRequest(request,uploadPath,size,"utf-8",new DefaultFileRenamePolicy());
			id = multi.getParameter("id");
			btitle = multi.getParameter("btitle");
			bcontent = multi.getParameter("bcontent");
			page = Integer.parseInt(multi.getParameter("page"));
			System.out.println("service write : "+page);
			searchTitle = multi.getParameter("searchTitle");
			searchWord = multi.getParameter("searchWord");
			System.out.println("page title word : "+page+","+searchTitle+","+searchWord);
			//파일이름가져오기
			Enumeration files = multi.getFileNames(); //모든파일의 이름을 가져옴.	le01.jpg,le02.jpg
			int i=0;
			
			//파일 1개일때
			if(files.hasMoreElements()) {
				fileName = (String) files.nextElement();
				System.out.println("while파일이름 : "+fileName);
				//실제파일이름 가져오기
			}
			bfile = multi.getFilesystemName(fileName);
			System.out.println("파일이름 : "+bfile);
			
			result = bdao.boardInsert(new BoardBean(id,btitle,bcontent,bfile));
			if(result==1) request.setAttribute("result", "s-w");
			else request.setAttribute("result", "f-w");
			
			request.setAttribute("page", page);
			request.setAttribute("searchTitle", searchTitle);
			request.setAttribute("searchWord", searchWord);
			
			//파일 2개이상일때
//			while(files.hasMoreElements()) {
//				fileNames[i] = (String) files.nextElement();
//				bfiles[i] = multi.getFilesystemName(fileNames[i]);
//				System.out.println("while이름 : "+bfiles[i]);
//				i++;
//			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}// 

	}//execute

}//class
