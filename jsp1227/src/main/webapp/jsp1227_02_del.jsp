<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session removeAttribute, invalidate</title>
	</head>
	<body>
	  <%
	    session.removeAttribute("sessionId");
	    Enumeration enumeration = session.getAttributeNames();
	    while(enumeration.hasMoreElements()){
	        String sessionName = enumeration.nextElement().toString();
	    	// nextElement 2번해서 에러
	    	out.println("sessionName : "+sessionName);
	    	out.println("sessionValue : "+session.getAttribute(sessionName));
	    }
	    out.println("<br>========================<br>");
	    
	    session.invalidate();
	    out.println("invalidate 모두삭제 됨.");
	    if(request.isRequestedSessionIdValid()){
	        out.println("session이 존재함.");
	    }else{
	    	out.println("session이 존재하지 않음");
	    }
	  
	  %>
	
	</body>
</html>