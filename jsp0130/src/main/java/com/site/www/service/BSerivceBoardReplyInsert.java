package com.site.www.service;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.www.bean.BoardBean;
import com.site.www.dao.BoardDao;

public class BSerivceBoardReplyInsert implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		String id,btitle,bcontent,bfile="",fileName="";
		int bgroup,bstep,bindent;
		int result=0;
		int page=1;
		String searchTitle,searchWord;
		
		String uploadPath="C:/upload";
		int size=10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size,"utf-8",new DefaultFileRenamePolicy());
			id = multi.getParameter("id");
			btitle = multi.getParameter("btitle");
			bcontent = multi.getParameter("bcontent");
			bgroup = Integer.parseInt(multi.getParameter("bgroup"));
			bstep = Integer.parseInt(multi.getParameter("bstep"));
			bindent = Integer.parseInt(multi.getParameter("bindent"));
			page = Integer.parseInt(multi.getParameter("page"));
			searchTitle = multi.getParameter("searchTitle");
			searchWord = multi.getParameter("searchWord");
			//파일이름가져오기
			Enumeration<String> files = multi.getFileNames();
			if(files.hasMoreElements()) {
				fileName = files.nextElement();
				bfile = multi.getFilesystemName(fileName);
			}
			
			result = bdao.boardReplyInsert(new BoardBean(id,btitle,bcontent,bstep,bgroup,bindent,bfile));
			if(result==1) request.setAttribute("result", "s-r");
			else request.setAttribute("result", "f-r");
			
			request.setAttribute("page", page);
			request.setAttribute("searchTitle", searchTitle);
			request.setAttribute("searchWord", searchWord);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
