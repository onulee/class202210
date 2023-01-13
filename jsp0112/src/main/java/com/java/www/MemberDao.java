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
	Context init=null;
	DataSource ds=null;
	String id,pw,name,phone,gender,hobby;
	String[] hobbys=null;
	int result=0;
	
	//회원삭제 메소드
	public int deleteMember(String id2) {
		try {
			conn = getConnection();
			String query = "delete from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}//deleteMember
	
	
	//회원정보수정 메소드
	public int updateMember(String id2, String pw2, String name2, String phone2, String gender2, String hobby2) {
		
		try {
			conn = getConnection();
			String query="update member set name=?,phone=?,gender=?,hobby=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name2);
			pstmt.setString(2, phone2);
			pstmt.setString(3, gender2);
			pstmt.setString(4, hobby2);
			pstmt.setString(5, id2);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
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
	}//updateMember
	
	
	//회원정보 1명검색 메소드
	public MemberDto selectMemberOne(String id) {
		MemberDto mdto = null;
		
		try {
			conn = getConnection();
			String query ="select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				id = rs.getString("id");
				System.out.println("id : "+id);
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				mdto = new MemberDto(id,pw,name,phone,gender,hobby);
			}
			
		}catch (Exception e) {
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
		return mdto;
	}//selectMemberOne
	
	
	//회원가입 메소드
	public int insertMember(String id2, String pw2, String name2, String phone2, String gender2, String hobby2) {
		try {
			conn = getConnection();
			String query = "insert into member values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			pstmt.setString(2, pw2);
			pstmt.setString(3, name2);
			pstmt.setString(4, phone2);
			pstmt.setString(5, gender2);
			pstmt.setString(6, hobby2);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
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
		return result;
	}//insertMember
	
	
	//전체회원리스트 메소드
	public ArrayList<MemberDto> selectMemberAll(){
		ArrayList<MemberDto> list = new ArrayList<>();
		try {
			conn = getConnection();
			String query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				list.add(new MemberDto(id,pw,name,phone,gender,hobby));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}//selectMemberAll
	
	
	// 로그인확인 메소드
	public MemberDto selectLogin(String id,String pw) {
		MemberDto mdto = new MemberDto();
		try {
			//db연결
			conn = getConnection();
			String query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mdto.setId(rs.getString("id"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	
		return mdto;
	}//
	
	//Connection 연결 메소드
	public Connection getConnection() {
		Connection connnection = null;
		try {
			init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/Oracle18c");
			connnection = ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connnection;
	}//getConnection


	
	
	
}//MemberDao



