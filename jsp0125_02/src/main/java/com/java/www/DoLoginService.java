package com.java.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoLoginService {
	public MemberDto execute(HttpServletRequest request,HttpServletResponse response) {
		MemberDto mdto=null;
		MemberDao mdao = new MemberDao();
		
		mdto = mdao.memberSelectOne(request.getParameter("id"),request.getParameter("pw"));
		
		return mdto;
	}

}
