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

import com.cookit.www.vo.BoardVo;
import com.cookit.www.vo.CommentVo;
import com.cookit.www.vo.TotalSaleVo;

public class TotalSaleDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<TotalSaleVo> list = null;
	TotalSaleVo tvo = null;
	int sno,syear,smonth,ssale;
	int result = 0;
	String query = "";
	
	
	//총매출액 가져오기 - 2022
	public List<TotalSaleVo> totalSaleSelect(int changeYear) {
		list = new ArrayList<TotalSaleVo>(); 
		try {
			conn = getConnection();
			query = "select * from total_sale where syear=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, changeYear);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				sno = rs.getInt("sno");
				syear = rs.getInt("syear");
				smonth = rs.getInt("smonth");
				ssale = rs.getInt("ssale");
				list.add(new TotalSaleVo(sno, syear, smonth, ssale));
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
	}//totalSaleSelect
	
	
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
