package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookit.www.dao.MemberDao;
import com.cookit.www.vo.MemberVo;

public class MServiceSelectLogin implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberVo mvo = mdao.selectLogin(id,pw);
		if(mvo!=null) {
			session.setAttribute("sessionId", mvo.getId());
			session.setAttribute("sessionName", mvo.getName());
			request.setAttribute("result", "s-login");
		}else {
			request.setAttribute("result", "f-login");
		}

	}//

}
