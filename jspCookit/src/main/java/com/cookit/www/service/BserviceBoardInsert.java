package com.cookit.www.service;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookit.www.dao.BoardDao;
import com.cookit.www.vo.BoardVo;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BserviceBoardInsert implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		BoardVo bvo = null;
		HttpSession session = request.getSession();
		String id,btitle,bcontent,bfile="",fileName="";
		int topchk=0;
		int result=0;
		String uploadPath="C:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size,"utf-8",new DefaultFileRenamePolicy());
			id = (String) session.getAttribute("sessionId");
			btitle = multi.getParameter("btitle");
			bcontent = multi.getParameter("bcontent");
			topchk = Integer.parseInt(multi.getParameter("topchk"));
			
			//파일이름
			Enumeration<String> files = multi.getFileNames();
			if(files.hasMoreElements()) {
				fileName = files.nextElement();
			}
			bfile = multi.getFilesystemName(fileName);
			bvo = new BoardVo(id, btitle, bcontent, bfile, topchk);
			result = bdao.boardInsert(bvo);
			if(result==1) request.setAttribute("result","s-boardInsert");
			else request.setAttribute("result","f-boardInsert");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}//

}
