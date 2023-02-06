package com.cookit.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.cookit.www.vo.BoardVo;
import com.cookit.www.vo.MemberVo;

public class BoardDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	List<BoardVo> list=null;
	BoardVo bvo = null;
	int rnum;
	int bno;
	String id,btitle,bcontent;
	Timestamp bdate;
	int bstep,bhit,bgroup,bindent;
	String bfile;
	int topchk;
	int result=0,listCount=0;
	String query="";
	
	// 모든 게시글 가져오기
	public List<BoardVo> selectAll(int startrow, int endrow) {
		list = new ArrayList<BoardVo>(); 
		try {
			conn = getConnection();
			query = "select * from"
					+ "( select rownum rnum,a.* from ( select * from board order by topchk desc,bgroup desc,bstep asc) a )"
					+ "where rnum between ? and ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bhit = rs.getInt("bhit");
				bstep = rs.getInt("bstep");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				topchk = rs.getInt("topchk");
				list.add(new BoardVo(bno, id, btitle, bcontent, bdate, bstep, bhit, bgroup, bindent, bfile, topchk));
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
	}//selectAll
	
	// 조회수 1증가 하기
	public void selectOneCount(int bno2) {
		try {
			conn = getConnection();
			query = "update board set bhit=bhit+1 where bno=?";
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
	}//selectOneCount
	
	//1개 게시글 가져오기
	public Map<String, Object> boardSelectOne(int bno2, int chk) {
		Map<String, Object> map = new HashMap<>();
		try {
			conn = getConnection();
			if(chk==0) query = "select rownum rnum,a.* from board a where bno=?";
			else if(chk==1) query = "select * from (select rownum rnum,a.* from "
					+ "(select * from board order by topchk desc,bgroup desc,bstep asc)a)"
					+ "where rnum = (select rnum from (select rownum rnum, a.* from"
					+ "(select * from board order by topchk desc,bgroup desc,bstep asc) a)"
					+ "where bno=?)+1";
			else query = "select * from (select rownum rnum,a.* from "
					+ "(select * from board order by topchk desc,bgroup desc,bstep asc)a)"
					+ "where rnum = (select rnum from (select rownum rnum, a.* from"
					+ "(select * from board order by topchk desc,bgroup desc,bstep asc) a)"
					+ "where bno=?)-1";	
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rnum = rs.getInt("rnum");
				System.out.println("rnum dao : "+rnum);
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bhit = rs.getInt("bhit");
				bstep = rs.getInt("bstep");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bfile = rs.getString("bfile");
				topchk = rs.getInt("topchk");
				bvo = new BoardVo(bno, id, btitle, bcontent, bdate, bstep, bhit, bgroup, bindent, bfile, topchk);
				map.put("rnum", rnum);
				map.put("bvo", bvo);
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
		return map;
	}//boardSelectOne
	
	// 게시글 총개수
	public int listCount() {
		try {
			conn = getConnection();
			query = "select count(*) listCount from board";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				listCount = rs.getInt("listCount");
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
		return listCount;
	}//listCount
	
	
	//게시글 등록 insert
	public int boardInsert(BoardVo bvo2) {
		try {
			conn = getConnection();
			query = "insert into board values(board_seq.nextval,?,?,?,sysdate,1,1,board_seq.currval,0,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bvo2.getId());
			pstmt.setString(2, bvo2.getBtitle());
			pstmt.setString(3, bvo2.getBcontent());
			pstmt.setString(4, bvo2.getBfile());
			pstmt.setInt(5, bvo2.getTopchk());
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
	
	//1개 게시글 수정하기
	public int boardUpdate(BoardVo bvo2) {
		try {
			conn = getConnection();
			query = "update board set btitle=?,bcontent=?,bfile=?,topchk=? where bno=? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bvo2.getBtitle());
			pstmt.setString(2, bvo2.getBcontent());
			pstmt.setString(3, bvo2.getBfile());
			pstmt.setInt(4, bvo2.getTopchk());
			pstmt.setInt(5, bvo2.getBno());
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
	}
	
	public int boardDelete(int bno2) {
		try {
			conn = getConnection();
			query = "delete board where bno=?";
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
	
	
	//connection연결
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

	

	

	

	

	


	




	

}
