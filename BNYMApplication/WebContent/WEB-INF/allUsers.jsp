<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>All Users</title>
	</head>
	
	<body>
		<div align="center">
		<h2>All Users</h2>

		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Email</th>
				<th>Password</th>
			</tr>
			<c:forEach items="${allUsers}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.email}</td>
					<td>${user.password}</td>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	</body>
</html>