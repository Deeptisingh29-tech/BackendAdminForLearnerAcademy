<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of classes</title>
</head>
<body>
<h2>View All Class Details</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Section</th>
		<th>Trainer</th>
		<th>Subject</th>
	</tr>
	<core:forEach items="${sessionScope.listOfClasses}" var="classes">
		<tr>
			<td> <core:out value="${classes.id}"></core:out> </td>
			<td> <core:out value="${classes.section}"></core:out> </td>
			<td> <core:out value="${classes.trainer}"></core:out> </td>
			<td> <core:out value="${classes.subject}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>