package com.stu.www;

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
	
	//학생성적등록 메소드
	public int insertStuscore(String name2, int kor2, int eng2, int math2) {
		try {
			result=0;
			conn = getConnection();
			query="insert into stuscore values("
					+ "stu_seq.nextval,?,?,?,?,?,?,0,''"
					+ ")";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name2);
			pstmt.setInt(2, kor2);
			pstmt.setInt(3, eng2);
			pstmt.setInt(4, math2);
			pstmt.setInt(5, kor2+eng2+math2);
			pstmt.setDouble(6, (kor2+eng2+math2)/3);
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
	}//insertStuscore

	
	
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
	
	//전체성적 메소드
	public ArrayList<StuscoreDto> stuSelectAll(){
		
		ArrayList<StuscoreDto> list = new ArrayList<>();
		try {
			conn = getConnection();
			query = "select * from stuscore";
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
				grade = rs.getString("grade");
				list.add(new StuscoreDto(stuno,name,kor,eng,math,total,avg,rank,grade));
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
		}
		return list;
	}//stuSelectAll

	
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
