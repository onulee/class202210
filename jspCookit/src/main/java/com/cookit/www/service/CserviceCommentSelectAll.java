package com.cookit.www.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cookit.www.dao.CommentDao;
import com.cookit.www.vo.CommentVo;

public class CserviceCommentSelectAll implements CService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CommentDao cdao = new CommentDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		List<CommentVo> list = cdao.commentSelectAll(bno);
		
		//json부분
		JSONArray jarray = new JSONArray(); //[  ]
		
		JSONObject json=null;
		for(int i=0;i<list.size();i++) {
			json = new JSONObject(); //{   }
			json.put("cno",list.get(i).getCno()); //{"cno":value,
			json.put("bno",list.get(i).getBno()); //{"cno":value,"bno":value..}
			json.put("id",list.get(i).getId()); 
			json.put("cpw",list.get(i).getCpw()); 
			json.put("ccontent",list.get(i).getCcontent()); 
			String cdate = list.get(i).getCdate()+"";  //날짜데이터는 String으로 해서 보내야 함
			json.put("cdate",cdate); 
			jarray.add(json);    
		}
		System.out.println(jarray.toJSONString());
		request.setAttribute("jarrayStr", jarray.toJSONString());

	}

}
