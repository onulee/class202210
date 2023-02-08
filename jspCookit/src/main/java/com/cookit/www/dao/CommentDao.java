package com.cookit.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.cookit.www.vo.CommentVo;

public class CommentDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<CommentVo> list = null;
	CommentVo cvo = null;
	int cno, bno;
	String id, cpw, ccontent;
	Timestamp cdate;
	int result = 0;
	String query = "";
	
	//하단댓글 모두가져오기
	public List<CommentVo> commentSelectAll(int bno2) {
		list = new ArrayList<>();
		try {
			conn = getConnection();
			query="select * from c_comment where bno=? order by cno desc";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				cno = rs.getInt("cno");
				bno = rs.getInt("bno");
				id = rs.getString("id");
				cpw = rs.getString("cpw");
				ccontent = rs.getString("ccontent");
				cdate = rs.getTimestamp("cdate");
				list.add(new CommentVo(cno, bno, id, cpw, ccontent, cdate));
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
	}//commentSelectAll
	
	//1개 댓글 가져오기
	public CommentVo commentSelectOne(int cno2) {
		// TODO Auto-generated method stub
		return null;
	}//commentSelectOne
	
	
	//댓글 1개 저장
	public CommentVo commentInsert(CommentVo cvo2) {
		try {
			conn = getConnection();
			int cno2=0;
			query="select c_comment_seq.nextval cno2 from dual";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cno2 = rs.getInt("cno2");
			}
			query="";
			query="insert into c_comment values(c_comment_seq.currval,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, cvo2.getBno());
			pstmt.setString(2, cvo2.getId());
			pstmt.setString(3, cvo2.getCpw());
			pstmt.setString(4, cvo2.getCcontent());
			result = pstmt.executeUpdate();
			
			query="select * from c_comment where cno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, cno2);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				cno = rs.getInt("cno");
				bno = rs.getInt("bno");
				id = rs.getString("id");
				cpw = rs.getString("cpw");
				ccontent = rs.getString("ccontent");
				cdate = rs.getTimestamp("cdate");
				cvo = new CommentVo(cno, bno, id, cpw, ccontent, cdate);
			}
			
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
		return cvo;
	}//commentInsert
	
	

	// connection연결
	public Connection getConnection() {
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle18c");
			connection = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}// getConnection




	



	





	

}
