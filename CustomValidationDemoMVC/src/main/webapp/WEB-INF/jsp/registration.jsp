<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Registration Form</title>

<style type="text/css">

	.error {
		color:red;
		text-align:right;
	}
	
	.header{
		text-align:center;
		background-color:BlanchedAlmond;
	}
	
	body{
		background-color:Gainsboro;
	}
	.form{
		font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
	}
	
</style>

</head>
<body>

	<div class ="header">
	<h1> STUDENT REGISTRATION FORM </h1>
	<i>Fill out the form. Asterisk (*) means required.</i>
	<br>
	<br>
	<hr>
	</div>
	

<div class="form">
	<form:form action="welcome" modelAttribute="Student">
	
		<p>First name: <form:input path="firstName" /></p>
		
		<p>Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" /></p>
		
		<p>Year (*) : <form:select path="year">
		<form:option value="NONE">--Select from here--</form:option>			
		<form:options items="${years}"/><form:options/>
		</form:select> 
		<form:errors path="year" cssClass="error" /></p>
		
		<p>Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" /></p>

		<input style="width:150px; height:200px;"type="submit" value="Submit" />
	</form:form>
</div>


</body>
</html>


