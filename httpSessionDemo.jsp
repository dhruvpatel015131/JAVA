<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--Document: httpSessionDemo --%>
	<%@ page import="java.io.*,java.util.*" %>
	<%
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		String tittle = "Welcome Back to Website";
		int visitCount = 1;
		String visitCountkey = new String("visitCount");
		String userIDKey = new String("userID");
		String userID = new String("ABC");
		if(session.isNew()){
			tittle = "Welcome to Website";
			session.setAttribute(userIDKey,userID);
			session.setAttribute(visitCountkey, visitCount);
		
		}
		else
		{
			visitCount=(Integer)session.getAttribute(visitCountkey);
			visitCount+=1;
			session.setAttribute(visitCountkey,visitCount);
		}
		userID = (String)session.getAttribute(userIDKey);
		
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Session Tracking using httpDemo</h2>
	<%=tittle%>
	<table border="1">
	<tr bgcolor="#949494">
		<th>Session Info</th>
	</tr> 
	<tr>
		<td> id </td>
		<td><%out.print(session.getId()); %></td>
	</tr>
	<tr>
		<td>Creation Time</td>
		<td><%out.print(createTime); %></td>
	</tr>
	<tr>
		<td>Time of Last Access</td>
		<td><%out.print(lastAccessTime); %></td>
	</tr>
	<tr>
		<td>User ID</td>
		<td><%out.print(userID); %></td>
	</tr>
	<tr>
		<td>Number of Visits</td>
		<td><%out.print(visitCount);%></td>
	</tr>
	
	</table>
	
</body>
</html>