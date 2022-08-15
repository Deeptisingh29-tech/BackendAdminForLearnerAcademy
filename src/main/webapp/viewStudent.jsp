<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of students</title>
</head>
<body>
<h2>View All Student Details</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Age</th>
		<th>Class</th>
	</tr>
	<core:forEach items="${sessionScope.listOfStudent}" var="student">
		<tr>
			<td> <core:out value="${student.id}"></core:out> </td>
			<td> <core:out value="${student.name}"></core:out> </td>
			<td> <core:out value="${student.age}"></core:out> </td>
			<td> <core:out value="${student.classes}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>