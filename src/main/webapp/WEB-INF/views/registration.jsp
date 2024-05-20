<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<%@include file="Home.jsp" %>
	<h1>Register here</h1>
	<form action="newregistration" method="post">
		FirstName:<input type="text" name="firstname"><br/>
		LastName:<input type="text" name="lastname"><br/>
		Email:<input type="email" name="email"><br/>
		Mobile:<input type="text" name="mobile"><br/>
		<input type="submit" value="Register">
	</form>
</body>
</html>