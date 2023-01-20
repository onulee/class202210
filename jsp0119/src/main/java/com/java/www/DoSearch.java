package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/DoSearch")
public class DoSearch extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		FreeboardDao fdao = new FreeboardDao();
		String search = request.getParameter("search");// 검색부분
		String searchWord = request.getParameter("searchWord");// 검색어
		ArrayList<FreeboardDto> list = fdao.fboardSelectSearch(search, searchWord);
		
		// json형태 변경
		JSONArray jArray = new JSONArray(); // [ ]
		if(list.size()>0){ 
			 for(int i=0;i<list.size();i++) { 
				 JSONObject jobj = new JSONObject(); //[{ }] jobj.put("bno",list.get(i).getBno());
				 jobj.put("bno",list.get(i).getBno());
				 jobj.put("id",list.get(i).getId());
				 jobj.put("btitle",list.get(i).getBtitle());
				 jobj.put("bcontent",list.get(i).getBcontent());
				 String bdate = ""+list.get(i).getBdate();
				 jobj.put("bdate",bdate);
				 jobj.put("bstep",list.get(i).getBstep());
				 jobj.put("bhit",list.get(i).getBhit());
				 jobj.put("bgroup",list.get(i).getBgroup());
				 jobj.put("bindent",list.get(i).getBindent());
				 jobj.put("bfile",list.get(i).getBfile());
				 jobj.put("name",list.get(i).getName()); 
				 jArray.add(jobj); 
			}//for 
		}//if
		 
     	response.setContentType("application/json; charset=utf-8");
     	//response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		writer.println(jArray.toJSONString()); // 파일출력
		System.out.println(jArray.toJSONString()); // console출력
		writer.close();
	}//

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
