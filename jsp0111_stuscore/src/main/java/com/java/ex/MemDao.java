package com.java.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	int stuno,kor,eng,math,total,rank,result=0;
	String name;
	double avg;
	
	//전체학생성적 select
	public ArrayList<MemDto> stuSelect() {
		ArrayList<MemDto> list = new ArrayList<>();
		//전체학생성적 정보
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/Oracle18c");
			conn = ds.getConnection();
			String query = "select * from stuscore";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				stuno = rs.getInt("stuno");
				name = rs.getString("name");
				kor = rs.getInt("kor");
				eng = rs.getInt("eng");
				math = rs.getInt("math");
				total = rs.getInt("total");
				avg = rs.getDouble("avg");
				rank = rs.getInt("rank");
				
				list.add(new MemDto(stuno,name,kor,eng,math,total,avg,rank));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//try
		
		return list;
	}//stuSelect
	

	
	
	

}
