package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.MemberDao;

public class MMemberDelete implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		int result = mdao.memberDelete(request.getParameter("id"));
		request.setAttribute("delete", "delete");
		request.setAttribute("result", result);
		
		
		System.out.println("service : "+request.getParameter("id"));
		System.out.println("service delete result : "+result);

	}

}
