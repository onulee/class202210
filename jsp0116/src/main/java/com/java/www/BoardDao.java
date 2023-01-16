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
	
	private String bname,btitle,bcontent;
	private int bno,bstep,bhit,bgroup,bindent;
	private Timestamp bdate;
	private String query="";
	private int result=0;
	
	public ArrayList<BoardDto> boardSelectAll(){
		ArrayList<BoardDto> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			query = "select * from freeboard";
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
				list.add(new BoardDto(bno,bname,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent));
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
