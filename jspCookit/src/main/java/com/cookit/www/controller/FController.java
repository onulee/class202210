package com.cookit.www.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cookit.www.service.BService;
import com.cookit.www.service.BserviceBoardDel;
import com.cookit.www.service.BserviceBoardInsert;
import com.cookit.www.service.BserviceBoardSelectAll;
import com.cookit.www.service.BserviceBoardUpdate;
import com.cookit.www.service.BserviceBoardView;
import com.cookit.www.service.CService;
import com.cookit.www.service.CserviceCommentSelectAll;
import com.cookit.www.service.MService;
import com.cookit.www.service.MServiceMemberInsert;
import com.cookit.www.service.MServiceMemberSelectOne;
import com.cookit.www.service.MServiceMemberUpdate;
import com.cookit.www.service.MServiceSelectLogin;
import com.cookit.www.service.MServiceSelectOne;
import com.cookit.www.vo.CommentVo;


@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String fName = uri.substring(conPath.length()+1);
		System.out.println("파일 이름 : "+fName);
		MService mservice=null;
		BService bservice=null;
		CService cservice=null;
		String url = "";
		int flag=0;
		
		if(fName.equals("index.do")) {           //index 페이지   
			url = "index.jsp";
		}else if(fName.equals("login.do")) {     //login 페이지
			url = "login.jsp";
		}else if(fName.equals("doLogin.do")) {   //login 실행
			//id,pw확인
			mservice = new MServiceSelectLogin();
			mservice.execute(request, response);
			url = "doPage.jsp";
		}else if(fName.equals("logout.do")) {   //logout 페이지
			url = "logout.jsp";
		}else if(fName.equals("join01_terms.do")) {   //회원가입1 페이지
		    url = "join01_terms.jsp";
	    }else if(fName.equals("join02_info_input.do")) { //회원가입2 페이지
			url = "join02_info_input.jsp";
		}else if(fName.equals("memberIdCheck.do")) { //id중복체크 실행
			mservice = new MServiceSelectOne();
			mservice.execute(request, response);
			JSONArray jarray = new JSONArray(); //[  ]
			JSONObject json = new JSONObject(); // {}
			json.put("result", request.getAttribute("result")); //{"result":"s-selectOne"}
			jarray.add(json);                                   //[{"result":"s-selectOne"}]
			response.setContentType("application/json; charset=utf-8;");
			//response.setCharacterEncoding("utf-8");
			//response.setContentType("text/html; charset='utf-8';");
			PrintWriter writer = response.getWriter();
			writer.println(jarray.toJSONString());
			System.out.println("json : "+jarray.toJSONString());
			writer.close();
			return;
		}else if(fName.equals("join03_success.do")) { //회원가입완료 실행
			//데이터 저장
			mservice = new MServiceMemberInsert();
			mservice.execute(request, response);
			url="doPage.jsp";
		}else if(fName.equals("member_info_update.do")) { //회원정보수정 페이지
			mservice = new MServiceMemberSelectOne();
			mservice.execute(request, response);
			url="member_info_update.jsp";
		}else if(fName.equals("doMember_info_update.do")) { //회원정보수정 실행
			mservice = new MServiceMemberUpdate();
			mservice.execute(request, response);
			url="doPage.jsp";
		}
		else if(fName.equals("notice_list.do")) {    //공지게시판 페이지
			bservice = new BserviceBoardSelectAll();
			bservice.execute(request, response);
			url="notice_list.jsp";
		}else if(fName.equals("notice_write.do")) {   //글쓰기 페이지    
			url="notice_write.jsp?page="+request.getParameter("page");
		}else if(fName.equals("doNotice_write.do")) {   //글쓰기저장 실행
			bservice = new BserviceBoardInsert();
			bservice.execute(request, response);
			url="doPage.jsp";
		}else if(fName.equals("notice_view.do")) {   //뷰페이지 
			bservice = new BserviceBoardView();
			bservice.execute(request, response);
			url="notice_view.jsp";
		}else if(fName.equals("notice_del.do")) {   //삭제 실행 
			bservice = new BserviceBoardDel();
			bservice.execute(request, response);
			url="doPage.jsp";
		}else if(fName.equals("notice_update.do")) {   //수정 페이지 
			bservice = new BserviceBoardView();
			bservice.execute(request, response); 
			url="notice_update.jsp";
		}else if(fName.equals("doNotice_update.do")) {   //수정 실행 
			bservice = new BserviceBoardUpdate();
			bservice.execute(request, response); 
			url="doPage.jsp";
		}else if(fName.equals("event.do")) {   //수정 실행 
			bservice = new BserviceBoardSelectAll();
			bservice.execute(request, response); 
			url="event/event.jsp";
		}else if(fName.equals("event_view.do")) {   //수정 실행 
			bservice = new BserviceBoardView();
			bservice.execute(request, response); 
			url="event/event_view.jsp";
		}else if(fName.equals("event_commentSelectAll.do")) {   //수정 실행 
			cservice = new CserviceCommentSelectAll();
			cservice.execute(request, response); 
			//json
			List<CommentVo> list = (List<CommentVo>) request.getAttribute("list");
			JSONArray jarray = new JSONArray(); //[  ]
			JSONObject json=null;
			for(int i=0;i<list.size();i++) {
				json = new JSONObject(); // {0:cvo},{1:cvo}
				json.put("cno",list.get(i).getCno()); //{"cno":value,
				json.put("bno",list.get(i).getBno()); //{"cno":value,"bno":value..}
				json.put("id",list.get(i).getId()); 
				json.put("cpw",list.get(i).getCpw()); 
				json.put("ccontent",list.get(i).getCcontent()); 
				String cdate = list.get(i).getCdate()+"";  //날짜데이터는 String으로 해서 보내야 함
				json.put("cdate",cdate); 
				
				jarray.add(json);    //
				
			}
			response.setContentType("application/json; charset=utf-8;");
			PrintWriter writer = response.getWriter();
			writer.println(jarray.toJSONString());
			System.out.println("json : "+jarray.toJSONString());
			writer.close();
			return;
			
			
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}//execute
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
