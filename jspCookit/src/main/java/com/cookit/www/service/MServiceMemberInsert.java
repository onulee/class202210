package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookit.www.dao.MemberDao;
import com.cookit.www.vo.MemberVo;

public class MServiceMemberInsert implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		String hobby="";
		for(int i=0;i<hobbys.length;i++) {
			if(i==0) hobby += hobbys[i];
			else hobby += ","+hobbys[i];
		}
		
		int result = mdao.MemberInsert(new MemberVo(id, pw, name, phone, gender, hobby));
		if(result==1) request.setAttribute("result", "s-memberInsert");
		else request.setAttribute("result", "f-memberInsert");

	}//

}
