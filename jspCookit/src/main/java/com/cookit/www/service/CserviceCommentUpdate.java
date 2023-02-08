package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cookit.www.dao.CommentDao;
import com.cookit.www.vo.CommentVo;

public class CserviceCommentUpdate implements CService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CommentDao cdao = new CommentDao();
		int cno = Integer.parseInt(request.getParameter("cno"));
		String ccontent = request.getParameter("ccontent");
		
		//update후 댓글 가져오기
		CommentVo cvo = cdao.commentUpdate(new CommentVo(cno, ccontent));
		
		//json부분
		JSONObject json= new JSONObject(); //{   }
			json.put("cno",cvo.getCno()); //{"cno":value,
			json.put("bno",cvo.getBno()); //{"cno":value,"bno":value..}
			json.put("id",cvo.getId()); 
			json.put("cpw",cvo.getCpw()); 
			json.put("ccontent",cvo.getCcontent()); 
			String cdate = cvo.getCdate()+"";  //날짜데이터는 String으로 해서 보내야 함
			json.put("cdate",cdate); 
		System.out.println(json);
		request.setAttribute("jsonStr", json);

	}

}
