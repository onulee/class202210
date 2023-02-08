package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cookit.www.dao.CommentDao;
import com.cookit.www.vo.CommentVo;

public class CserviceCommentDelete implements CService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CommentDao cdao = new CommentDao();
		int cno = Integer.parseInt(request.getParameter("cno"));
		System.out.println("CserviceCommentDelete cno : "+cno);
		int result = cdao.commentDelete(cno);
		if(result==1) request.setAttribute("result", "success");
		else request.setAttribute("result", "fail");
		
		System.out.println("CserviceCommentDelete result : "+result);
		

	}

}
