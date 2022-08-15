<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trainer</title>
</head>
<body>
<h2>Add Trainer Details</h2>
<form action="TrainerController" method="post">
<label>Id</label>
<input type="number" name="id"><br/>
<label>FName</label>
<input type="text" name="fname"><br/>
<label>LName</label>
<input type="text" name="lname"><br/>
<label>age</label>
<input type="number" name="age"><br/>
<input type="submit" value="Add Trainer">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp" style="color: purple">Home</a>
</body>
</html>