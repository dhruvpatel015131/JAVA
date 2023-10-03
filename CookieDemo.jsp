<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie</title>
</head>
<body>
	<%! 
		final int ONE_MIN =60;
		int pgCount=1;
		boolean found;
	%>
	<%
		Cookie cookies[]= request.getCookies();
		if(cookies!=null){
			for(int i=1;i<cookies.length;i++)
			{
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("pageCount"))
				{
				found = true;
				pgCount = Integer.parseInt(cookie.getValue());
				pgCount++;
				cookie.setValue(String.valueOf(pgCount));
				response.addCookie(cookie);
				break;
				}
				else
					found = false;
			}
			
		}
		if(cookies !=null || found==false){
			Cookie cookie = new Cookie("pageCount",String.valueOf(pgCount));
			cookie.setMaxAge(ONE_MIN);
			response.addCookie(cookie);
			
			}
		out.println("<b>You have hit page "+pgCount+" times </b>");
	%>
	<a href="CookieDemo.jsp">Hit Page</a>
</body>
</html>