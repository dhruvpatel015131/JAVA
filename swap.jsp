<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm1" method="post" action="swapNumbers.jsp">
		<label for="num1">First Number:</label><br>
		<input type="text" name="num1" placeholder="Enter Number"><br>
		<label for="num2">Second Number:</label><br>
		<input type="text" name="num2" placeholder="Enter Number"><br>
		<input type="submit" name="submit" value="Swap" style="margin-top:8px">
	</form>
	
	<%
		int  a = Integer.parseInt(request.getParameter("num1"));
		int  b = Integer.parseInt(request.getParameter("num2"));
		int c;
		
			c=a;
			a=b;
			b=c;
	%>
	<p>After Swapping: <%out.println(a+" "+b); %></p>
</body>

