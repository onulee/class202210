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
	
	//회원가입 메소드
	public int memberInsert(MemberDto mdto) {
		try {
			conn = getConnection();
			query="insert into member values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,mdto.getId() );
			pstmt.setString(2,mdto.getPw() );
			pstmt.setString(3,mdto.getName() );
			pstmt.setString(4,mdto.getPhone() );
			pstmt.setString(5,mdto.getGender() );
			pstmt.setString(6,mdto.getHobby() );
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!=null) pstmt.close();
				if (conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}//memberInsert
	
	
	// 로그인체크 메소드
	public MemberDto memberSelectOne(String id2,String pw2) {
		MemberDto mdto = null;
		try {
			conn = getConnection();
			query="select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,id2 );
			pstmt.setString(2,pw2 );
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				mdto = new MemberDto(id,pw,name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return mdto;
	}//memberSelectOne
	
	
	//Connection연결
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
	}//getConnection


	

}//class
