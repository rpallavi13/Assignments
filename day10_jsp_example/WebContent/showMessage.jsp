<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Understanding JSP</title>
</head>
<body>
<%---Scriptlet --%>
<%out.println("WELCOME TO JSP"); %>
<%--Declaration --%>
<% String city="Pune"; %>
<% out.println("WELCOME TO "+city); %>
<% double marks=90; %>
<%--Expression --%>
<%=marks %>
</body>
</html>