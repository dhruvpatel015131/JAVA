<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-weight: bold">
	<%
		application.setAttribute("user_name", "ABC");
		response.sendRedirect("ApplicationDemo2.jsp");
	%>
</body>
</html>