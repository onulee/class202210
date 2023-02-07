package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookit.www.dao.MemberDao;
import com.cookit.www.vo.MemberVo;

public class MServiceMemberUpdate implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		HttpSession session = request.getSession();
		
		String id,pw,name,phone,gender,hobby="";
		id = (String) session.getAttribute("sessionId");
		pw = request.getParameter("pw");
		
		phone = request.getParameter("phone");
		gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		for(int i=0;i<hobbys.length;i++) {
			if(i==0) hobby += hobbys[i];
			else hobby += ","+hobbys[i];
		}
		
		int result = mdao.MemberUpdate(new MemberVo(id, pw, phone, gender, hobby));
		if(result==1) request.setAttribute("result", "s-memberUpdate");
		else request.setAttribute("result", "f-memberUpdate");
		
	}

}
