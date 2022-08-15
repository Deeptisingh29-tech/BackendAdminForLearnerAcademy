<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login page</title>
</head>
<body>
<h3>Please Enter your credentials to login</h3>
<form action="LoginController" method="post">
<label>EmailId</label>
<input type="email" name="email"><br/>
<label>Password</label>
<input type="password" name="password"><br/>
<input type="submit" value="login">
<input type="reset" value="reset">
</form>
</body>
</html>