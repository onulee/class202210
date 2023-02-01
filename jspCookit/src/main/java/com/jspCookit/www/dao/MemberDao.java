package com.jspCookit.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jspCookit.www.vo.MemberVo;

public class MemberDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	MemberVo mvo=new MemberVo();
	int result=0;
	String id,pw,name,phone,gender,hobby;
	String query="";
	
	
	
	
	//connection 연결
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
