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
	String bfile;
	int result=0;
	
	//전체게시글 가져오기 메소드
	public ArrayList<FreeboardDto> fboardSelectAll(){
		ArrayList<FreeboardDto> list = new ArrayList<>();
		try {
			conn = getConnection();
			query="select * from freeboard order by bno";
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
				
				list.add(new FreeboardDto(bno,id,btitle,bcontent,bdate,bstep,bhit,bgroup,bindent,bfile));
				
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
