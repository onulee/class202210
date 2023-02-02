package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookit.www.dao.MemberDao;
import com.cookit.www.vo.MemberVo;

public class MServiceSelectOne implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		String id = request.getParameter("id");
		System.out.println("id : "+id);
		//id로 확인
		MemberVo mvo = mdao.selectOne(id);
		if(mvo!=null) request.setAttribute("result", "f-selectOne");
		else request.setAttribute("result", "s-selectOne");

	}

}
