package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	//전체회원보기 메소드
	public ArrayList<MemberDto> MemberAllselect(){
		ArrayList<MemberDto> list = new ArrayList<>();
		try {
			conn = getConnection();
			query = "select * from member3";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				list.add(new MemberDto(id, pw, name, phone, gender, hobby));
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
	}//MemberAllselect
	
	
	// 회원가입저장
	public int insertMember(MemberDto mdto) {
		
		try {
			conn = getConnection();
			query = "insert into member values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,mdto.getId());
			pstmt.setString(2,mdto.getPw());
			pstmt.setString(3,mdto.getName());
			pstmt.setString(4,mdto.getPhone());
			pstmt.setString(5,mdto.getGender());
			pstmt.setString(6,mdto.getHobby());
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
		}
		return result;
	}//insertMember
	
	
	//중복확인 메소드 - CheckId
	public MemberDto memberSelectOne(String id2) {
		MemberDto mdto =null;
		
		try {
			conn = getConnection();
			query="select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				mdto = new MemberDto(id, pw, name, phone, gender, hobby);
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
	}
	
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
