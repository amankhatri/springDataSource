<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String s = request.getParameter(arg0) %>
<jsp:useBean id="u1" class="beans.Person" scope="application"></jsp:useBean>
<jsp:setProperty property="id" name="u1" value="100"/>
<a href="second.jsp">Second</a>
</body>
</html>