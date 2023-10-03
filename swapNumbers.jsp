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
		int  a = Integer.parseInt(request.getParameter("num1"));
		int  b = Integer.parseInt(request.getParameter("num2"));
		int c;
		
			c=a;
			a=b;
			b=c;
		
	%>
	<p>After Swapping <%out.print(a+"<br>"+b); %></p>
</body>
</html>