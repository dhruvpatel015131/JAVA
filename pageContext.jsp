<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("Student", "ABCD",pageContext.PAGE_SCOPE);
		String name = (String) pageContext.getAttribute("Student");
		out.println("Page: Student name is "+name);
		out.println("<br>");
		
		pageContext.setAttribute("stud","ABCDXYZ",pageContext.APPLICATION_SCOPE);
		
		String pageName = page.toString();
		out.println("Name of page is "+pageName);
		out.println("<br>");
		
		String nm = (String) pageContext.getAttribute("stud",pageContext.APPLICATION_SCOPE);
		out.println("Name of Student is "+nm);
	%>
	
</body>
</html>