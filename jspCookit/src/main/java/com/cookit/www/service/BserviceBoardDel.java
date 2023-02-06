package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookit.www.dao.BoardDao;

public class BserviceBoardDel implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		int page = Integer.parseInt(request.getParameter("page"));
		
		int result = bdao.boardDelete(bno);
		
		if(result==1) request.setAttribute("result", "s-boardDelete");
		else request.setAttribute("result", "f-boardDelete");
		request.setAttribute("page", page);

	}

}
