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
		int bno;
		String id,btitle,bcontent,bOldFile,bfile="",fileName="";
		int result=0;
		
		String uploadPath = "C:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size,"utf-8",new DefaultFileRenamePolicy());
			bno = Integer.parseInt(multi.getParameter("bno"));
			id = multi.getParameter("id");
			btitle = multi.getParameter("btitle");
			bcontent = multi.getParameter("bcontent");
			bOldFile = multi.getParameter("bOldFile");
			//파일
			Enumeration<String> files = multi.getFileNames();
			
			if(files.hasMoreElements()) {
			   	fileName = files.nextElement();
			   	bfile = multi.getFilesystemName(fileName);
			}
			if(bfile.equals("")) bfile=bOldFile;  //파일첨부가 없으면, 기존파일을 사용함.
			
			BoardBean bBean = new BoardBean(bno, id, btitle, bcontent, bfile);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
