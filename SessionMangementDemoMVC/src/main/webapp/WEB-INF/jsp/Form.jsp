<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/login.css" rel="stylesheet">
<title>Login Page | MVC</title>
</head>
<body>

	<div class="header">
		<h1 style="text-align:center;'">USER LOGIN PAGE</h1>
		<br>
	</div>

<div class="form">

<form:form action="welcome" method="post" modelAttribute="userModel">

	<p>Enter Email ID : <br>
	<form:input class="form-control" type="email" path="email" placeholder="Enter here"/>
	</p>
	
	<p>Enter Password : <br>
	<form:input class="form-control" type="password" path="password" placeholder="Enter here"/>
	</p>
	
	<br> 
	
	<input class="form-submit" type="submit" value="LOGIN" />

</form:form>

<br>
<span style="color: red;">${message}</span>

</div>



</body>
</html>