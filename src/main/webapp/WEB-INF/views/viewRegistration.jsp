<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all registrations</title>
</head>
<body>
<%@include file="Home.jsp" %>

All registrations
<table>
	<tr>
		<td>Firstname</td>
		<td>Lastname</td>
		<td>Email</td>
		<td>Mobile</td>

	</tr>

	 <c:forEach items="${allregistrations}" var="registration">
	 <tr>
		<td><c:out value="${registration.getFirstname()}"></c:out></td>
		<td><c:out value="${registration.getLastname()}"></c:out></td>
		<td><c:out value="${registration.getEmail()}"></c:out></td>
		<td><c:out value="${registration.getMobile()}"></c:out></td>
		<td><a href="deleteregistration?id=${registration.getId()}">Delete</a></td>
		<td><a href="updatebyid?id=${registration.getId()}">Update</a></td>
		</tr>
	</c:forEach>

	
</table>
</body>
</html>