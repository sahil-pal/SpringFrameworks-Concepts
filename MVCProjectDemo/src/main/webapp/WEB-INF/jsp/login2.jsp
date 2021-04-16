<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="resources/css/login-page.css"rel="stylesheet">
<title>MVC | LoginPage</title>

</head>
<body>

<h1>LOGIN PAGE</h1>

<form:form action="welcome" method="post" modelAttribute="userModel">
	<table>
	<tr>
	<td>Enter your Username : </td>
	<td><form:input path="userid" placeholder="Enter user name"/></td>
	</tr>
	<tr>
	<td>Enter your password : </td> 
	<td><form:input path="password" type="password" placeholder="Enter password"/></td></tr>
	<tr>
	</table>
<form:button type="submit">LOGIN</form:button>
	
</form:form>

</body>
</html>