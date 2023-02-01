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
	int result=0,countAll=0;
	String query="";
	
	//전체게시글 수
	public int boardCountAll() {
		try {
			conn = getConn();
			query="select count(*) count from freeboard";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				countAll = rs.getInt("count");
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
		return countAll;
	}//boardCountAll
	
	//검색게시글 수
	public int boardSearchCount(String searchTitle, String searchWord) {
		try {
			conn = getConn();
			if(searchTitle.equals("all")) {
				query="select count(*) count from freeboard where btitle like ? or bcontent like ?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "%"+searchWord+"%");
				pstmt.setString(2, "%"+searchWord+"%");
			}else {
				query="select count(*) count from freeboard where "+searchTitle+" like ?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "%"+searchWord+"%");
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				countAll = rs.getInt("count");
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
		return countAll;
	}//boardSearchCount
	
	//전체게시글 가져오기
	public ArrayList<BoardBean> boardSelectAll(int startrow, int endrow){
		list = new ArrayList<>();
		try {
			conn = getConn();
			query="select * from"
					+ "(select rownum rnum,a.* from"
					+ "(select * from freeboard order by bgroup desc,bstep asc) a)"
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
	
	//게시글 검색
	public ArrayList<BoardBean> boardSearch(String searchTitle, String searchWord, int startrow, int endrow) {
		list = new ArrayList<>();
		System.out.println("searchTitle : "+searchTitle);
		System.out.println("searchWord : "+searchWord);
		try {
			conn = getConn();
			if(searchTitle.equals("all")) {
				query="select * from"
						+ "(select rownum rnum,a.* from"
						+ "( select * from freeboard where btitle like ? or bcontent like ? order by bgroup desc, bstep asc  ) a"
						+ ") where rnum between ? and ?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "%"+searchWord+"%");
				pstmt.setString(2, "%"+searchWord+"%");
				pstmt.setInt(3, startrow);
				pstmt.setInt(4, endrow);
			}else {
				query="select * from"
						+ "(select rownum rnum,a.* from"
						+ "( select * from freeboard where "+searchTitle+" like ? order by bgroup desc, bstep asc ) a"
						+ ") where rnum between ? and ?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "%"+searchWord+"%");
				pstmt.setInt(2, startrow);
				pstmt.setInt(3, endrow);
			}
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
	}//boardSearch
	
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
	
	//게시글 업데이트
	public int boardUpdate(BoardBean boardBean) {
		try {
			conn = getConn();
			query = "update freeboard set btitle=?,bcontent=?,bfile=? where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, boardBean.getBtitle());
			pstmt.setString(2, boardBean.getBcontent());
			pstmt.setString(3, boardBean.getBfile());
			pstmt.setInt(4, boardBean.getBno());
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
	}//boardUpdate
	
	//step 1증가
	public void boardStepUp(int bstep2,int bgroup2) {
		try {
			conn=getConn();
			query="update freeboard set bstep=bstep+1 where bgroup=? and bstep>?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bgroup2);
			pstmt.setInt(2, bstep2);
			pstmt.executeUpdate();
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
	}//boardStepUp
	
	// 답글 저장
	public int boardReplyInsert(BoardBean boardBean) {
		try {
			//step 1증가 메소드호출
			boardStepUp(boardBean.getBstep(),boardBean.getBgroup());
			
			conn = getConn();
			query = "insert into freeboard values(freeboard_seq.nextval,?,?,?,sysdate,?,1,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, boardBean.getId());
			pstmt.setString(2, boardBean.getBtitle());
			pstmt.setString(3, boardBean.getBcontent());
			pstmt.setInt(4, boardBean.getBstep()+1);
			pstmt.setInt(5, boardBean.getBgroup());
			pstmt.setInt(6, boardBean.getBindent()+1);
			pstmt.setString(7, boardBean.getBfile());
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
	}//boardReplyInsert
	
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
