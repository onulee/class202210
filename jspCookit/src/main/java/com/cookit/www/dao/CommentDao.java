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
			query="select * from c_comment where bno=?";
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
	}
	
	

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
