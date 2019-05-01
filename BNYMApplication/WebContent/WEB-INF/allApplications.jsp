<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Applications</title>
</head>
<body>
	<div align="center">
		<h2>All Applications</h2>

		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Course</th>
				<th>Date of Birth</th>
			</tr>
			<c:forEach items="${listApplicant}" var="applicant">
				<tr>
					<td>${applicant.id}</td>
					<td>${applicant.sName}</td>
					<td>${applicant.sCourse}</td>
					<td><fmt:formatDate value="${applicant.sDOB}" pattern="MM/dd/yyyy"  /> </td>
					<td><a href="/CustomerManager/applysuccess?id=${applcant.id}">More Info</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>