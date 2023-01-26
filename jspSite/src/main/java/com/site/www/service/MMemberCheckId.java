package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.MemberDao;
import com.site.www.dto.MemberDto;

public class MMemberCheckId implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.memberCheckId(request.getParameter("id"));
		int result=0; //사용할 수 없음
		if(mdto==null) result=1; //사용할 수 있음
		
		request.setAttribute("result", result);

	}

}
