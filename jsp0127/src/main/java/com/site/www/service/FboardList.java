package com.site.www.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.FBoardDao;
import com.site.www.dto.FBoardDto;

public class FboardList implements FBService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		FBoardDao fbdao = new FBoardDao();
		ArrayList<FBoardDto> list = null;
		list = fbdao.fboardSelectAll();
		request.setAttribute("list", list);
	}

}//
