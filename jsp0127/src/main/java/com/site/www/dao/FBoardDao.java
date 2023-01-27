package com.site.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.www.dto.FBoardDto;

public class FBoardDao {
	FBoardDto fbdto=null;
	ArrayList<FBoardDto> list=null;
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	int bno,bstep,bhit,bgroup,bindent;
	String id,btitle,bcontent,bfile;
	Timestamp bdate;
	int result=0;
	String query="";
	
	//전체게시글 가져오기
	public ArrayList<FBoardDto> fboardSelectAll() {
		list = new ArrayList<>();
		try {
			conn = getConnection();
			query = "select * from freeboard order by bgroup";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno=rs.getInt("bno");
				id=rs.getString("id");
				btitle=rs.getString("btitle");
				bcontent=rs.getString("bcontent");
				bdate=rs.getTimestamp("bdate");
				bstep=rs.getInt("bstep");
				bhit=rs.getInt("bhit");
				bgroup=rs.getInt("bgroup");
				bindent=rs.getInt("bindent");
				bfile=rs.getString("bfile");
				list.add(new FBoardDto(bno, id, btitle, bcontent, bdate, bstep, bhit, bgroup, bindent, bfile));
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
	}//fboardSelectAll
	
	//게시글1개 가져오기
	public FBoardDto fboardSelectOne(int bno2) {
		fbdto = new FBoardDto();
		try {
			conn=getConnection();
			query="select * from freeboard where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id=rs.getString("id");
				btitle=rs.getString("btitle");
				bcontent=rs.getString("bcontent");
				bdate=rs.getTimestamp("bdate");
				bstep=rs.getInt("bstep");
				bhit=rs.getInt("bhit");
				bgroup=rs.getInt("bgroup");
				bindent=rs.getInt("bindent");
				bfile=rs.getString("bfile");
				fbdto = new FBoardDto(bno2, id, btitle, bcontent, bdate, bstep, bhit, bgroup, bindent, bfile);
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
		return fbdto;
	}//fboardSelectOne
	
	
	//Connection연결
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


	



	
	
	

}
