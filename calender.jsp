<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorHandler.jsp" import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm1" method="get">
		Enter Name: <input type="text" name="nm" placeholder="Enter Name">
		<input type="submit" name="submit" value="ok" style="margin-left: 4px;padding:2px">
	</form>
	<%
		Calendar cal = Calendar.getInstance();
		int h = cal.get(Calendar.HOUR_OF_DAY);
		String user = (String)request.getParameter("nm");
		if(h>0 && h<12)
			out.print("<b>Good Morning "+user+"!!<b>");
		else if(h>=12 &&h<15)
			out.print("<b>Good Afternoon "+user+"!!<b>");
		else if(h>=15 && h<19)
			out.print("<b>Good Evening "+user+"!!<b>");
		else
			out.print("<b>Good Night "+user+"!!<b>");
	
	%>
</body>
</html>