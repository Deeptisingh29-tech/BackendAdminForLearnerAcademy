<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of trainers</title>
</head>
<body>
<h2>View All Trainers Details</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>FName</th>
		<th>LName</th>
		<th>Age</th>
		
	</tr>
	<core:forEach items="${sessionScope.listOfTrainer}" var="trainer">
		<tr>
			<td> <core:out value="${trainer.id}"></core:out> </td>
			<td> <core:out value="${trainer.fname}"></core:out> </td>
			<td> <core:out value="${trainer.lname}"></core:out> </td>
			<td> <core:out value="${trainer.age}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>