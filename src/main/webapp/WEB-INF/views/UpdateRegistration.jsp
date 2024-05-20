<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<c:set var="registration" value="${registration}" />
<form action="updateregistration" method="post">
		<input type="hidden" name="id" value="${registration.getId()}"><br/>
		Firstname:<input type="text" name="firstname" value="${registration.getFirstname()}"><br/>
		Lastname:<input type="text" name="lastname" value="${registration.getLastname()}"><br/>
		Email:<input type="email" name="email" value="${registration.getEmail()}"><br/>
		Mobile:<input type="text" name="mobile" value="${registration.getMobile()}"><br/>
		<input type="submit" value="Update">
	</form>

</body>
</html>