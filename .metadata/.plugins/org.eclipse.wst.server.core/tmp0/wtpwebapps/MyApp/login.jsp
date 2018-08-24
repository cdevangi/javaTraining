<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String message = (String) request.getAttribute("message");
%>

<%=message %>

<form action="check"> <!-- tells which servlet to refer to -->
USERNAME:<input type="text" name="username"> <br>
PASSWORD:<input type="text" name="password"> <br>
<input type="submit" value="LOGIN">
</form>

</body>
</html>