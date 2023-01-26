package com.site.www.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.dao.MemberDao;
import com.site.www.dto.MemberDto;

public class MMemberAll implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		ArrayList<MemberDto> list = mdao.memberSelectAll(); 
		request.setAttribute("list", list);

	}//

}
