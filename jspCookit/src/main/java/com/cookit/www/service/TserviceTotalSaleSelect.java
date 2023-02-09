package com.cookit.www.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cookit.www.dao.TotalSaleDao;
import com.cookit.www.vo.TotalSaleVo;

public class TserviceTotalSaleSelect implements TService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		TotalSaleDao tdao = new TotalSaleDao();
		int changeYear = Integer.parseInt(request.getParameter("changeYear"));//해당년도검색
		List<TotalSaleVo> list = tdao.totalSaleSelect(changeYear);
		
		//json부분
		JSONObject json=new JSONObject();
		JSONArray jarray = new JSONArray();  //monthData
		JSONArray jarray2 = new JSONArray(); //saleData
		
		for(int i=0;i<list.size();i++) {
			//sno, syear, smonth, ssale 
			jarray.add(list.get(i).getSmonth());  //["1월",
			jarray2.add(list.get(i).getSsale());  //["100","200"
		}
		//{"monthData":[1월,2월,3월,4월,5월,...],"saleData":[100,200,300..],"syear":"2022" }
		json.put("monthData",jarray); 
		json.put("saleData",jarray2); 
		json.put("syear",list.get(0).getSyear()); 
		System.out.println(jarray.toJSONString());
		System.out.println(jarray2.toJSONString());
		request.setAttribute("jsonStr", json);

	}

}
