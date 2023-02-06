package com.cookit.www.service;

import java.sql.Timestamp;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookit.www.dao.BoardDao;
import com.cookit.www.vo.BoardVo;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BserviceBoardUpdate implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		BoardVo bvo = null;
		HttpSession session = request.getSession();
		String id,btitle,bcontent,oldfile="",bfile="",fileName="";
		int bno,bstep,bhit,bgroup,bindent,page=1;
		int topchk=0;
		int result=0;
		String uploadPath="C:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size,"utf-8",new DefaultFileRenamePolicy());
			page = Integer.parseInt(multi.getParameter("page"));
			btitle = multi.getParameter("btitle");
			bcontent = multi.getParameter("bcontent");
			topchk = Integer.parseInt(multi.getParameter("topchk"));
			
			oldfile = multi.getParameter("oldfile");
			bno = Integer.parseInt(multi.getParameter("bno"));
			
			//파일이름
			Enumeration<String> files = multi.getFileNames();
			if(files.hasMoreElements()) {
				fileName = files.nextElement();
			}
			// 파일업로드가 없으면 예전파일이름으로 저장
			bfile = multi.getFilesystemName(fileName);
			if(bfile==null) bfile = oldfile;
			
			bvo = new BoardVo(bno,btitle,bcontent,bfile,topchk);
			result = bdao.boardUpdate(bvo);
			if(result==1) request.setAttribute("result","s-boardUpdate");
			else request.setAttribute("result","f-boardUpdate");
			request.setAttribute("page", page);
			request.setAttribute("bno", bno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
