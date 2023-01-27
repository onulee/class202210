package com.site.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.MemberDao;

public class MMemberUpdate implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		String id,pw,name,phone,gender,hobby="";
		String[] hobbys=null;
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone = request.getParameter("phone");
		gender = request.getParameter("gender");
		hobbys = request.getParameterValues("hobby");
		for(int i=0;i<hobbys.length;i++) {
			if(i==0) hobby += hobbys[i];
			else hobby+= ","+hobbys[i];
		}
		int result = mdao.memberUpdate(id,pw,name,phone,gender,hobby);
		request.setAttribute("update", "update");
		request.setAttribute("result", result);

	}

}
