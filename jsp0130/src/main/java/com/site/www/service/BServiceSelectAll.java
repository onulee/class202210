package com.site.www.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.bean.BoardBean;
import com.site.www.dao.BoardDao;

public class BServiceSelectAll implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//dao접근해서 freeboard 모든파일 가져오기
		BoardDao bdao = new BoardDao();
		ArrayList<BoardBean> list = bdao.boardSelectAll();
		if(list!=null) {
			request.setAttribute("list", list);
			request.setAttribute("result", "success");
		}else request.setAttribute("result", "fail");

	}

}
