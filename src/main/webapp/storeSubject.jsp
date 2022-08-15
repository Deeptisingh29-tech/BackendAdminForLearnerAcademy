<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add subject</title>
</head>
<body>
<h2>Add Subject Details</h2>
<form action="SubjectController" method="post">
<label>Id</label>
<input type="number" name="id"><br/>
<label>Name</label>
<input type="text" name="name"><br/>
<label>Shortcut</label>
<input type="text" name="shortcut"><br/>
<input type="submit" value="Add Subject">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>