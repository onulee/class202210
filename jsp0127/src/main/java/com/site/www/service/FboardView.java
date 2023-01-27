package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.FBoardDao;
import com.site.www.dto.FBoardDto;

public class FboardView implements FBService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		FBoardDao fbdao = new FBoardDao();
		FBoardDto fbdto = fbdao.fboardSelectOne(Integer.parseInt(request.getParameter("bno")));
		request.setAttribute("fbdto", fbdto);
	}

}
