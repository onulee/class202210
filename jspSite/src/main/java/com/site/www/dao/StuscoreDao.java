package com.site.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class StuscoreDao {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	private int stuno;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private String grade;
	int result=0;
	String query="";
	
	
	
	// 학점등록 메소드
	public int updateGrade() {
		try {
			result=0;
			conn = getConnection();
			query="update stuscore a set grade=( select grades from"
					+ "( select stuno, case when avg>=90 then 'A' when avg>=80 then 'B' when avg>=70 then 'C'"
					+ "else 'F' end as grades from stuscore) b where a.stuno=b.stuno )";
			pstmt = conn.prepareStatement(query);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			  if(pstmt!=null) pstmt.close();	
			  if(conn!=null) conn.close();	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}//updateGrade
	
	
	// 등수등록 메소드
	public int updateRank() {
		try {
			result=0;
			conn = getConnection();
			query="update stuscore a set rank = (select ranks from (select stuno,rank() over (order by total desc) ranks from stuscore ) b\r\n"
					+ "where a.stuno = b.stuno)";
			pstmt = conn.prepareStatement(query);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			  if(pstmt!=null) pstmt.close();	
			  if(conn!=null) conn.close();	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}//updateRank
	
	
	
	// 커넥션 연결하기
	public Connection getConnection() {
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle18c");
			connection = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}//conection


	
	
	
	
	
	
}//class
