package com.cookit.www.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookit.www.dao.BoardDao;
import com.cookit.www.vo.BoardVo;

public class BserviceBoardView implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("service execute");
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> preMap = new HashMap<>();
		Map<String, Object> nextMap = new HashMap<>();
		BoardVo bvo=null;
		int rnum=1;
		BoardDao bdao = new BoardDao();
		int bno = Integer.parseInt(request.getParameter("bno"));
		int page = Integer.parseInt(request.getParameter("page"));
		bdao.selectOneCount(bno);      //조회수1증가
		//현재글 가져오기
		map = bdao.boardSelectOne(bno,0);  // rnum,bvo
		//이전글 가져오기
		preMap = bdao.boardSelectOne(bno,-1); //rnum,bvo
		//다음글 가져오기
		nextMap = bdao.boardSelectOne(bno,1); //rnum,bvo
		if(bvo!=null) request.setAttribute("result", "s-boardView");
		else request.setAttribute("result", "f-boardView");
		request.setAttribute("bvo", map.get("bvo"));
		System.out.println("service btitle : "+((BoardVo)map.get("bvo")).getBtitle());
		request.setAttribute("prebvo", preMap.get("bvo"));
		request.setAttribute("preRnum", preMap.get("rnum"));
		System.out.println("preRnum service : "+preMap.get("rnum"));
		request.setAttribute("nextbvo", nextMap.get("bvo"));
		request.setAttribute("nextRnum", nextMap.get("rnum"));
		System.out.println("nextRnum service : "+nextMap.get("rnum"));
		request.setAttribute("page", page);

	}

}
