package com.site.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.www.dto.MemberDto;

public class MemberDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemberDto mdto = null;
	ArrayList<MemberDto> list = null;
	String id,pw,name,phone,gender,hobby;
	int result=0;
	String query="";
	
	// 전체회원보기
	public ArrayList<MemberDto> memberSelectAll() {
		list = new ArrayList<>();
		try {
			conn = getConnection();
			query = "select * from member order by id";
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
		}//
		
		return list;
	}//memberSelectAll
	
	//회원1명 정보 가져오기
	public MemberDto memberSelectOne(String id2) {
		try {
			conn = getConnection();
			query="select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				mdto = new MemberDto(id2, pw, name, phone, gender, hobby);
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
	
	//회원가입
	public int memberInsert(MemberDto memberDto) {
		try {
			conn = getConnection();
			query="insert into member values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberDto.getId());
			pstmt.setString(2, memberDto.getPw());
			pstmt.setString(3, memberDto.getName());
			pstmt.setString(4, memberDto.getPhone());
			pstmt.setString(5, memberDto.getGender());
			pstmt.setString(6, memberDto.getHobby());
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
	}//memberInsert
	
	//회원정보수정
	public int memberUpdate(String id2, String pw2, String name2, String phone2, String gender2, String hobby2) {
		try {
			conn=getConnection();
			query = "update member set name=?,phone=?,gender=?,hobby=? where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name2);
			pstmt.setString(2, phone2);
			pstmt.setString(3, gender2);
			pstmt.setString(4, hobby2);
			pstmt.setString(5, id2);
			pstmt.setString(6, pw2);
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
	}//memberUpdate
	
	
	//회원정보삭제
	public int memberDelete(String id) {
		try {
			conn=getConnection();
			query = "delete member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
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
	}//memberDelete
	
	//로그인 체크
	public MemberDto memberLogin(String id2, String pw2) {
		try {
			conn = getConnection();
			query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			pstmt.setString(2, pw2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				name = rs.getString("name");
				mdto = new MemberDto(id2,pw2,name);
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
	}//memberLogin
	
	// ID 중복체크
	public MemberDto memberCheckId(String id2) {
		try {
			conn = getConnection();
			query = "select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				mdto = new MemberDto(id2);
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
	}//memberCheckId
	
	
	//Connection 연결
	public Connection getConnection() {
		Connection connection=null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle18c");
			connection = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}//
		return connection;
	}//getConnection

	

	

	

	

	


	




	

}//class
