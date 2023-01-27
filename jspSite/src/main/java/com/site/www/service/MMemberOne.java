package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.MemberDao;
import com.site.www.dto.MemberDto;

public class MMemberOne implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.memberSelectOne(request.getParameter("id"));
		request.setAttribute("mdto", mdto);

	}

}
