<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of subjects</title>
</head>
<body>
<h2>View All Subject Details</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Shortcut</th>
	</tr>
	<core:forEach items="${sessionScope.listOfSubject}" var="subject">
		<tr>
			<td> <core:out value="${subject.id}"></core:out> </td>
			<td> <core:out value="${subject.name}"></core:out> </td>
			<td> <core:out value="${subject.shortcut}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="Home.jsp">Home</a>
</body>
</html>