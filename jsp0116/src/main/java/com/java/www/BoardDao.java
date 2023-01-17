package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	BoardDto bdto=null;
	
	private String bname,btitle,bcontent,bfile;
	private int bno,bstep,bhit,bgroup,bindent;
	private Timestamp bdate;
	private String query="";
	private int result=0;
	
	// 게시글 저장하기 메소드
	public int boardInsert(String bname2,String btitle2,String bcontent2,String bfile2) {
		
		try {
			conn = getConnection();
			query="insert into freeboard values(freeboard_seq.nextval,?,?,?,sysdate,1,1,freeboard_seq.currval,0,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bname2);
			pstmt.setString(2, btitle2);
			pstmt.setString(3, bcontent2);
			pstmt.setString(4, bfile2);
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
	}//boardInsert
	
	// 게시글 1개 가져오기 메소드
	public BoardDto boardSelectOne(int bno) {
		BoardDto bdto=null;
		try {
			conn = getConnection();
			query = "select * from freeboard where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				bname = rs.getString("bname");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bstep = rs.getInt("bstep");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				bdto = new BoardDto(bno,bname,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent,bfile);
			}//
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
		return bdto;
	}//boardSelectOne
	
	
	// 전체게시글 가져오기 메소드
	public ArrayList<BoardDto> boardSelectAll(){
		ArrayList<BoardDto> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			query = "select * from freeboard order by bno desc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				bname = rs.getString("bname");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bstep = rs.getInt("bstep");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				
				list.add(new BoardDto(bno,bname,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent,bfile));
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
	}
	
	
	//Context Connection가져오기
	public Connection getConnection() {
		Connection connection=null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle18c");
			connection = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}


	

}
