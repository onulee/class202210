package com.cookit.www.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookit.www.dao.BoardDao;
import com.cookit.www.vo.BoardVo;

public class BserviceBoardSelectAll implements BService {

	BoardDao bdao = new BoardDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int page=1;
		if(request.getParameter("page")!=null) page=Integer.parseInt(request.getParameter("page"));

		//페이지정보 메소드 호출 - listCount,maxpage,startpage,endpage,startrow,endrow
		// 1.객체선언후 2.참조변수명.메소드명
		HashMap<String, Object> map = pageMethod(page); 
		int startrow = (int) map.get("startrow");
		int endrow = (int) map.get("endrow");
		
		List<BoardVo> list = null;
		list = bdao.selectAll(startrow,endrow);
		
		request.setAttribute("page", page);
		request.setAttribute("listCount", map.get("listCount"));
		request.setAttribute("maxpage", map.get("maxpage"));
		request.setAttribute("startpage", map.get("startpage"));
		request.setAttribute("endpage", map.get("endpage"));
		request.setAttribute("list", list);

	}//execute
	
	//method - pageMethod 
	public HashMap<String, Object> pageMethod(int page) {
		HashMap<String, Object> map = new HashMap<>();
		//page:현재페이지,listCount:총개수,maxpage:최대페이지,startpage,endpage,startrow,endrow
		int listCount = bdao.listCount();
		int rowPerPage = 10;    //1페이지당 게시글개수
		int pageList = 5;       //하단넘버링 개수
		int maxpage = (int)(Math.ceil((double)listCount/rowPerPage));
		int startpage = ((page-1)/pageList)*pageList+1;
		int endpage = maxpage;
		if(endpage>startpage+pageList-1) endpage = startpage+pageList-1;
		int startrow = (page-1)*rowPerPage+1;
		int endrow = startrow+rowPerPage-1;
		
		//page:현재페이지,listCount:총개수,maxpage:최대페이지,startpage,endpage,startrow,endrow
		int[] pageArr= {listCount,maxpage,startpage,endpage,startrow,endrow};
		map.put("listCount", listCount);
		map.put("maxpage", maxpage);
		map.put("startpage", startpage);
		map.put("endpage", endpage);
		map.put("startrow", startrow);
		map.put("endrow", endrow);
		return map;  //
	}
	

}//class
