package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String id,pw,name,phone,gender,hobby;
	int result=0;
	String query="";
	
	//selectOne - Login체크,
	public MemberDto memberSelectOne(String id2, String pw2) {
		MemberDto mdto = null;
		try {
			conn = getConnection();
			query="select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			pstmt.setString(2, pw2);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				mdto = new MemberDto(id,pw,name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return mdto;
	}//memberSelectOne
	
	
	
	// Context connection가져오기
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
	}//connection

}//class
