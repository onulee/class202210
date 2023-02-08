package com.cookit.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cookit.www.dao.CommentDao;
import com.cookit.www.vo.CommentVo;

public class CserviceCommentInsert implements CService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CommentDao cdao = new CommentDao();
		int cno=0;
		int bno = Integer.parseInt(request.getParameter("bno"));
		String id = request.getParameter("id");
		String cpw = request.getParameter("cpw");
		String ccontent = request.getParameter("ccontent");
		CommentVo cvo = new CommentVo(bno, id, cpw, ccontent);
		//insert후 댓글 가져오기
		CommentVo cvo2 = cdao.commentInsert(cvo);
		
		//json부분
		JSONObject json= new JSONObject(); //{   }
			json.put("cno",cvo2.getCno()); //{"cno":value,
			json.put("bno",cvo2.getBno()); //{"cno":value,"bno":value..}
			json.put("id",cvo2.getId()); 
			json.put("cpw",cvo2.getCpw()); 
			json.put("ccontent",cvo2.getCcontent()); 
			String cdate = cvo2.getCdate()+"";  //날짜데이터는 String으로 해서 보내야 함
			json.put("cdate",cdate); 
		System.out.println(json);
		request.setAttribute("jsonStr", json);
		
		

	}

}
