<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add class</title>
</head>
<body>
<h2>Add Class Details</h2>
<form action="ClassesController" method="post">
<label>Id</label>
<input type="number" name="id"><br/>
<label>Section</label>
<input type="number" name="section"><br/>
<label>Trainer</label>
<input type="number" name="trainer"><br/>
<label>Subject</label>
<input type="number" name="subject"><br/>
<input type="submit" value="Add Class">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>