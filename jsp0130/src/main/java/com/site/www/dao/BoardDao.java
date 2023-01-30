package com.site.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.www.bean.BoardBean;

public class BoardDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	ArrayList<BoardBean> list=null;
	BoardBean bBean = null;
	int bno,bstep,bhit,bgroup,bindent;
	String id,btitle,bcontent,bfile;
	Timestamp bdate;
	int result=0;
	String query="";
	
	
	//모든 게시글 가져오기
	public ArrayList<BoardBean> boardSelectAll(){
		list = new ArrayList<>();
		try {
			conn = getConn();
			query="select * from freeboard order by bgroup desc";
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
				list.add(new BoardBean(bno, id, btitle, bcontent, bdate, bstep, bhit, bgroup, bindent, bfile));
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
	}//boardSelectAll
	
	//1개 게시글 가져오기
	public BoardBean boardSelectOne(int bno2) {
		try {
			conn = getConn();
			query="select * from freeboard where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
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
				bBean = new BoardBean(bno, id, btitle, bcontent, bdate, bstep, bhit, bgroup, bindent, bfile);
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
		return bBean;
	}//boardSelectOne
	
	//게시글 저장
	public int boardInsert(BoardBean boardBean) {
		try {
			conn = getConn();
			query = "insert into freeboard values(freeboard_seq.nextval,?,?,?,sysdate,1,1,freeboard_seq.currval,0,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, boardBean.getId());
			pstmt.setString(2, boardBean.getBtitle());
			pstmt.setString(3, boardBean.getBcontent());
			pstmt.setString(4, boardBean.getBfile());
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
	}//boardInsert
	
	//게시글 삭제
	public int boardDelete(int bno2) {
		try {
			conn = getConn();
			query = "delete freeboard where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
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
	}//boardDelete
	
	//context에서 connection객체 연결
	public Connection getConn() {
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
