package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookit.www.dao.MemberDao;
import com.cookit.www.vo.MemberVo;

public class MServiceMemberSelectOne implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberDao mdao = new MemberDao();
		String id = (String) session.getAttribute("sessionId");
		MemberVo mvo = mdao.selectOne(id);
		request.setAttribute("mvo", mvo);

	}

}
