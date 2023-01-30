package com.site.www.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//
//import com.java.www.MemberDao;
//import com.java.www.MemberDto;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;


@WebServlet("/DoCheckId")
public class DoCheckId extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		System.out.println("doAction");
//		request.setCharacterEncoding("utf-8");
//		MemberDao mdao = new MemberDao();
//		String chkFlag = "false"; //사용 불가능
//		String id = request.getParameter("id");
//		MemberDto mdto = mdao.memberSelectOne(id);
//		JSONArray jArray = new JSONArray(); //json배열
//		JSONObject jsonObj = new JSONObject(); //json객체
//		if(mdto!=null) {
//			//chkFlag = "true"+","+id; //중복Id가 없음, 사용가능
//			jsonObj.put("id",mdto.getId());
//			jsonObj.put("pw",mdto.getPw());
//			jsonObj.put("name",mdto.getName());
//			jsonObj.put("phone",mdto.getPhone());
//			jsonObj.put("gender",mdto.getGender());
//			jsonObj.put("hobby",mdto.getHobby());
//			jArray.add(jsonObj);//json배열 넣기
//			
//		}else {
//			// 없을때
//		}
//	    System.out.println("id : "+id);
//		System.out.println("사용여부 : "+chkFlag);
//		
//		
//		//response.setContentType("text/html; charset=utf-8");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter writer = response.getWriter();
//		//writer.println(chkFlag);
//		writer.println(jArray.toJSONString()); //데이터출력해서 보냄.
//		System.out.println(jArray.toJSONString());
//		writer.close();
		 
		
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
