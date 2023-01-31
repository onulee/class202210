package com.site.www.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.www.bean.BoardBean;
import com.site.www.dao.BoardDao;

public class BServiceSelectAll implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDao bdao = new BoardDao();
		ArrayList<BoardBean> list = null;
		int page=1;
		if(request.getParameter("page")!=null) page=Integer.parseInt(request.getParameter("page")); 
		
		
		//한페이지내 가져올 글번호(rownum)
		int pageSize=10; //1페이지당 게시글 개수
		int startrow = (page-1)*10+1; //1,11
		int endrow = startrow+pageSize-1; //10,20
		System.out.println("page : "+page);
		System.out.println("startrow : "+startrow+",endrow : "+endrow);
		
		
		//하단넘버링
		int countAll=bdao.boardCountAll();
		int bottomPageCount=10; //하단넘버링 개수
		int maxpage = (int) Math.ceil((double)countAll/pageSize);  //round:반올림,floor:버림,ceil:올림
		int startpage = (((int) ((double)page / bottomPageCount + 0.9)) - 1) * bottomPageCount + 1; //1-5,6-10,21-30
		int endpage = maxpage; //1-10 11
		if(endpage>startpage+bottomPageCount-1) endpage = startpage+bottomPageCount-1;
		
		
		System.out.println("startpage : "+startpage+",endpage : "+endpage);
		System.out.println("maxpage : "+maxpage);

		
		// 전체게시글 또는 검색으로 가져오기
		if(request.getParameter("searchWord")==null) {
			// 전체게시글 가져오기
			//dao접근해서 freeboard 모든파일 가져오기
			list = bdao.boardSelectAll(startrow,endrow);
			if(list!=null) {
				request.setAttribute("list", list);
				request.setAttribute("result", "success");
			}else request.setAttribute("result", "fail");
		}else {
			// 검색 가져오기
			//dao접근해서 freeboard 모든파일 가져오기
			list = bdao.boardSearch(request.getParameter("searchTitle"),request.getParameter("searchWord"));
			if(list!=null) {
				request.setAttribute("list", list);
				request.setAttribute("result", "success");
			}else request.setAttribute("result", "fail");
		}
		
		//하단넘버링 관련정보
		request.setAttribute("page", page);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("countAll", countAll);
		
	}//execute

}//class
