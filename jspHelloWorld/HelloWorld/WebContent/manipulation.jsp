<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% for (int i=0;i<5; i++){ %>
	<p> This is HTML inside scriptlet  and iteration <%=i %> </p>
<% }%>

<%String id=request.getParameter("id");
if (id==null){%>

<Strong>Id parameter is missing!</Strong>
<%} else {%>

Id parameter: <%=id %>
	
<%} %>
</body>
</html>