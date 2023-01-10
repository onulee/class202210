<%@page import="java.sql.DriverManager"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>oracle</title>
	</head>
	<body>
	  <%!
	    Connection conn;
	    Statement stmt;
	    ResultSet rs;
	    String id,pw,name,phone;
	    int employee_id;
	    String emp_name;
	    double salary,realsalary;
	  %>
	  <%
	     try{
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "orauser", "1111");
	    	 stmt = conn.createStatement();
	    	 //employees-사원번호,사원명,월급,월급+커미션
	    	 String query = "select employee_id,emp_name,salary,salary+(salary*nvl(commission_pct,0)) realsalary from employees";
	    	 rs = stmt.executeQuery(query);
	    	 
	    	 while(rs.next()){
	    		 employee_id = rs.getInt("employee_id");
	    		 emp_name = rs.getString("emp_name");
	    		 salary = rs.getDouble("salary");
	    		 realsalary = rs.getDouble("realsalary");
	    		 
	    		 
	    		 out.println("사원번호 : "+employee_id+",이름 : "+emp_name+",월급 : "+salary+",실제월급 : "+realsalary+"<br>");
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }catch(Exception e){ e.printStackTrace();
	     }finally{
	    	 try{
	    		 if(rs!=null) rs.close();
	    		 if(stmt!=null) stmt.close();
	    		 if(conn!=null) conn.close();
	    	 }catch(Exception e2){e2.printStackTrace();}
	     }
	  
	  %>
	  
	
	</body>
</html>