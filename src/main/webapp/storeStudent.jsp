<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add student</title>
</head>
<body>
<h2>Add Student Details</h2>
<form action="StudentController" method="post">
<label>Id</label>
<input type="number" name="id"><br/>
<label>Name</label>
<input type="text" name="name"><br/>
<label>Age</label>
<input type="number" name="age"><br/>
<label>Classes</label>
<input type="number" name="classes"><br/>
<input type="submit" value="Add Student">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>