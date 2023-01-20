package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class FreeboardDao {

	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	int bno;
	String id,btitle,bcontent,query;
	Timestamp bdate;
	int bstep,bhit,bgroup,bindent;
	String bfile,name;
	int result=0;
	
	//1개 게시글 저장 메소드
	public int fboardInsert(FreeboardDto boarddto) {
		try {
			conn = getConnection();
			query="";
			pstmt = conn.prepareStatement(query);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//
		return result;
	}//
	
	
	
	//1개 게시글 가져오기 메소드
	public FreeboardDto fboardSelectOne(int bno2) {
		FreeboardDto fdto=null;
		try {
			conn = getConnection();
			query="select * from freeboard a, member b where a.id=b.id and bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bstep = rs.getInt("bstep");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				name = rs.getString("name");
				
				fdto = new FreeboardDto(bno,id,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent,bfile,name);
				
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
		}//
		
		return fdto;
	}//fboardSelectOne
	
	//검색게시글 가져오기 메소드
	public ArrayList<FreeboardDto> fboardSelectSearch(String search, String searchWord) {
		ArrayList<FreeboardDto> list = new ArrayList<>();
		try {
			conn = getConnection();
			query="select * from (select row_number() over(order by bno desc) rnum,a.*,b.name from freeboard a, member b where a.id=b.id and (btitle like '%'||?||'%' or bcontent like '%'||?||'%')) where  rnum between 1 and 5";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, searchWord);
			pstmt.setString(2, searchWord);
			rs = pstmt.executeQuery();
			System.out.println("query : "+query);
			while(rs.next()) {
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bstep = rs.getInt("bstep");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				name = rs.getString("name");
				
				list.add(new FreeboardDto(bno,id,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent,bfile,name));
				
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
		}//
		
		return list;
	}
	
	//전체게시글 가져오기 메소드
	public ArrayList<FreeboardDto> fboardSelectAll(){
		ArrayList<FreeboardDto> list = new ArrayList<>();
		try {
			conn = getConnection();
			query="select c.* from "
					+ "(select a.*, row_number() over (order by bno desc) rnum ,name "
					+ "from freeboard a,member b where a.id=b.id) c "
					+ "where rnum between 1 and 20";
			//query="select b.* from (select rownum rnum,a.* from freeboard a) b where rnum between 21 and 30";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bstep = rs.getInt("bstep");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				name = rs.getString("name");
				
				list.add(new FreeboardDto(bno,id,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent,bfile,name));
				
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
		}//
		
		return list;
	}
	
	
	//Connection연결 메소드
	public Connection getConnection() {
		Connection connection=null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle18c");
			connection = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}//getConnection

	


	
}//class
