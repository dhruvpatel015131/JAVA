<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int count=1;
	%>
	<%
	
		String param = request.getParameter("count");
		if(param != null)
		{
			count = Integer.parseInt(param);
		}
		out.println("You have visited this page"+count+" times");
	%>
	<a href = "URLSessionDemo.js ? count = <%=count+1 %>" style="font-weight: bold">Hit Page Again</a>
</body>
</html>