<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>월급 6000달러이상</title>
	</head>
	<body>
	  <!-- 월급 6000달러 이상인 사람만 출력하시오. 사원번호,사원명,월급,부서번호 -->
	  <%!
	    Connection conn;
	    Statement stmt;
	    ResultSet rs;
	    int employee_id,department_id;
	    String emp_name;
	    double salary;
	    String query ="select employee_id,emp_name,salary,department_id from employees where salary>=6000 order by employee_id";
	  %>
	  <%
	    try{
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
		    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orauser","1111");
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery(query);
		    
		    while(rs.next()){
		    	employee_id = rs.getInt("employee_id");
		    	emp_name = rs.getString("emp_name");
		    	salary = rs.getDouble("salary");
		    	department_id = rs.getInt("department_id");
		    	
		    	out.println(employee_id+" , "+emp_name+" , "+salary+" , "+department_id+"<br>");
		    	
		    }
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(stmt!=null) stmt.close();
	    		if(conn!=null) conn.close();
	    	}catch(Exception e2){
	    		e2.printStackTrace();
	    	}
	    }
	  %>
	
	</body>
</html>