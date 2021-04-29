<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
		padding:2px;
		margin-left:5%;
	}
	
	.instructions{
		color:grey;
		font-size:10px;
	}
	
	.message{
		color:green;
		font-size:18px;
		font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
	}
	
</style>

</head>
<body>

	<div class ="header">
		<br>
		<h1> STUDENT REGISTRATION FORM </h1>
		<i>Fill out the form. Asterisk (*) means required.</i>
		<div class="message">
			<h4><spring:message code="welcome.message" /></h4>
		</div>
		<a id="en" href="register?lang=en">English</a> | <a id="fr" href="register?lang=fr">French</a>
		<div>&nbsp;</div>
		<hr>
	</div>
	

<div class="form">
	<form:form action="welcome" modelAttribute="Student">
	
		<p>First name : <form:input path="firstName" /></p>
		
		<p>Last name (*) : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors></p>
		
		<div class="instructions">
			<i> password validations : </i>
			<p> --> First letter capital <br>
				--> One special character <br>
				--> Minimum 8 character </p>
		</div>
		
		<p>Enter Password : <form:input path="password" />
		<form:errors path="password" cssClass="error"></form:errors></p>
		
		<p>Year (*) : <form:select path="year">
		<form:option value="NONE">--Select from here--</form:option>			
		<form:options items="${years}"/><form:options/>
		</form:select> 
		<form:errors path="year" cssClass="error"></form:errors></p>
		
		<p>Course Code : <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" /></p>

		<input style="width:150px; height:200px;"type="submit" value="Submit" />
	</form:form>
</div>


</body>
</html>


