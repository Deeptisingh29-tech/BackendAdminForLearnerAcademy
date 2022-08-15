<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h2 style="color: blue">Welcome to Home Page ${sessionScope.obj} </h2>
<hr>
<%--
String name = (String)session.getAttribute("obj");
out.println(name);
--%>
<a href="storeTrainer.jsp">Add Trainer Details</a> ! <br>

<a href="storeStudent.jsp">Add Student Details</a> ! <br>

<a href="storeClasses.jsp">Add Class Details</a> ! <br>

<a href="storeSubject.jsp">Add Subject Details</a> ! <br>

<a href="TrainerController">Get list of Trainers</a> ! <br>
<a href="StudentController">Get list of Students</a> ! <br>
<a href="ClassesController">Get list of Classes</a> ! <br>
<a href="SubjectController">Get list of Subject</a> ! <br>
<a href="viewClassesStudent.html">Get list of Subjects alloted to Classes</a> ! <br>
<a href="viewTeacherClassSubject.html">Get list of assigned Teachers to Class and Students</a> ! <br><br>

<a href="index.jsp" style="color: red">Logout</a>
</body>
</html>