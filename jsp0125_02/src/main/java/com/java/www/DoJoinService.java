package com.java.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoJoinService {
	public int execute(HttpServletRequest request,HttpServletResponse response) {
		int result=0;
		MemberDao mdao = new MemberDao();
		String id,pw,name,phone,gender,hobby="";
		String[] hobbys = null;
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone = request.getParameter("phone");
		gender = request.getParameter("gender");
		hobbys = request.getParameterValues("hobby");
		for(int i=0;i<hobbys.length;i++) {
			if(i==0) hobby += hobbys[i];
			else hobby += ","+hobbys[i];
		}
		MemberDto mdto = new MemberDto(id, pw, name, phone, gender, hobby);
		result = mdao.memberInsert(mdto);
		
		return result;
	}

}
