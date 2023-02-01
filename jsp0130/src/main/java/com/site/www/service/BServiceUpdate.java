package com.site.www.service;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.www.bean.BoardBean;
import com.site.www.dao.BoardDao;

public class BServiceUpdate implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		int bno,bhit,bstep,bgroup,bindent;
		String id,btitle,bcontent,bOldFile,bfile="",fileName="";
		int result=0;
		int page=1;
		String searchTitle=null, searchWord=null;
		
		String uploadPath = "C:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size,"utf-8",new DefaultFileRenamePolicy());
			bno = Integer.parseInt(multi.getParameter("bno"));
			btitle = multi.getParameter("btitle");
			bcontent = multi.getParameter("bcontent");
			bOldFile = multi.getParameter("bOldFile");
			page = Integer.parseInt(multi.getParameter("page"));
			searchTitle = multi.getParameter("searchTitle");
			searchWord = multi.getParameter("searchWord");
			
			//파일
			Enumeration<String> files = multi.getFileNames();
			if(files.hasMoreElements()) {
				System.out.println("확인");
			   	fileName = files.nextElement();
			   	bfile = multi.getFilesystemName(fileName);
			}
			System.out.println("service bfile : "+bfile);
			if(bfile==null) bfile=bOldFile; //파일첨부가 없으면, 기존파일을 사용함.
			
			result = bdao.boardUpdate(new BoardBean(bno, btitle, bcontent, bfile));
			if(result==1) request.setAttribute("result", "s-u");
			else request.setAttribute("result", "f-u");
			
			request.setAttribute("page", page);
			request.setAttribute("searchTitle", searchTitle);
			request.setAttribute("searchWord", searchWord);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
