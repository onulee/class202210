package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.www.dao.MemberDao;
import com.site.www.dto.MemberDto;

public class MDoLoginService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.memberLogin(request.getParameter("id"),request.getParameter("pw"));
		HttpSession session = request.getSession();
		int result=0;
		if(mdto!=null) {
			session.setAttribute("sessionId", mdto.getId());
			session.setAttribute("sessionName", mdto.getName());
			result=1;
		}
		
		request.setAttribute("result", result);
		
	}

}
