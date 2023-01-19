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
	String id,pw,name,phone,gender,hobby,query;
	int result=0;
	
	//selectOne-로그인
	public MemberDto memberSelectOne(MemberDto memdto) {
		MemberDto mdto=null;
		try {
			//로그인-id,pw
			if(memdto.getPw()!=null) {
				conn = getConnection();
				query="select id,pw,name from member where id=? and pw=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, memdto.getId());
				pstmt.setString(2, memdto.getPw());
				rs = pstmt.executeQuery();
				while(rs.next()) {
					id = rs.getString("id");
					pw = rs.getString("pw");
					name = rs.getString("name");
					mdto = new MemberDto(id,pw,name);
				}
			}else {
			//회원정보수정-id
				
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
		return mdto;
	}//memberSelectOne
	
	
	
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
