package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.bean.BoardBean;
import com.site.www.dao.BoardDao;

public class BServiceSelectOne implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardBean bBean = bdao.boardSelectOne(bno);
		request.setAttribute("bBean", bBean);
		
		int page = Integer.parseInt(request.getParameter("page"));
		String searchTitle = request.getParameter("searchTitle");
		String searchWord = request.getParameter("searchWord");
		
		request.setAttribute("page", page);
		request.setAttribute("searchTitle", searchTitle);
		request.setAttribute("searchWord", searchWord);

	}

}//
