package com.cookit.www.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookit.www.dao.CommentDao;
import com.cookit.www.vo.CommentVo;

public class CserviceCommentSelectAll implements CService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CommentDao cdao = new CommentDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		List<CommentVo> list = cdao.commentSelectAll(bno);
		request.setAttribute("list", list);

	}

}
