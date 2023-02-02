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
		String searchTitle=null,searchWord=null;
		int page=1;        //현재페이지
		if(request.getParameter("page")!=null) page=Integer.parseInt(request.getParameter("page")); 
		int PageList=5;    //하단넘버링 개수
		int rowPerPage=4; //1페이지당 게시글 개수
		int countAll=0;    //전체게시글 개수
		
		
		//한페이지내 가져올 글번호(rownum)
		int startrow = (page-1)*rowPerPage+1; //1,11 1-1
		int endrow = startrow+rowPerPage-1; //10,20 1+4-1=5
		System.out.println("page : "+page);
		System.out.println("startrow : "+startrow+",endrow : "+endrow);
		
		// 전체게시글 가져오기
		if(request.getParameter("searchWord")==null || request.getParameter("searchWord").equals("")) {
			// 전체게시글 가져오기
			//dao접근해서 freeboard 모든파일 가져오기
			list = bdao.boardSelectAll(startrow,endrow);
			countAll=bdao.boardCountAll();
			if(list!=null) {
				request.setAttribute("list", list);
				request.setAttribute("result", "success");
			}else request.setAttribute("result", "fail");
		}else {
			// 검색 가져오기
			//dao접근해서 freeboard 모든파일 가져오기
			searchTitle = request.getParameter("searchTitle");
			searchWord = request.getParameter("searchWord");
			list = bdao.boardSearch(searchTitle,searchWord,startrow,endrow);
			countAll=bdao.boardSearchCount(searchTitle,searchWord);
			if(list!=null) {
				request.setAttribute("list", list);
				request.setAttribute("result", "success");
			}else request.setAttribute("result", "fail");
		}
		
		//하단넘버링
		int maxpage = (int) Math.ceil((double)countAll/rowPerPage);  //round:반올림,floor:버림,ceil:올림
		int startpage = ((page-1)/PageList)*PageList + 1; 
		int endpage = maxpage; 
		if(endpage>startpage+PageList-1) endpage = startpage+PageList-1;
		
		System.out.println("startpage : "+startpage+",endpage : "+endpage);
		System.out.println("maxpage : "+maxpage);
		
		//하단넘버링 관련정보
		request.setAttribute("page", page);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("countAll", countAll);
		request.setAttribute("searchTitle", searchTitle);
		request.setAttribute("searchWord", searchWord);
		
	}//execute

}//class
