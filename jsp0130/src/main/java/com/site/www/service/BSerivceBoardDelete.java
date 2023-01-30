package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.BoardDao;

public class BSerivceBoardDelete implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bdao = new BoardDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		int result = bdao.boardDelete(bno);
		if(result==1) request.setAttribute("result", "s-d");
		else request.setAttribute("result", "f-d");

	}

}
