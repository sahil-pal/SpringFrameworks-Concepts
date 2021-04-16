<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/welcome-page.css"rel="stylesheet">
<title>MVC | ThankyouPage</title>
</head>
<body>
	<h1> DETAILS ENTERED ARE : </h1>
	<table>
		<tr>
			<td>Name  </td>
			<td>: ${name }</td>
		</tr>
		<tr>
			<td>E-mail  </td> 
			<td>: ${email }</td>
		</tr>
		<tr>
			<td>Phone number  </td>
			<td>: ${phone}</td>
		</tr>
		<tr>
			<td>Interest </td>
			<td>: ${i1} and<td>
			<td>${i2}<td>
		</tr>
		<tr>
			<td>Gender  </td>
			<td>: ${gender}<td>
		</tr>
		<tr>
			<td>City  </td>
			<td>: ${city}<td>
		</tr>
		<tr>
			<td>State  </td>
			<td>: ${state}<td>
		</tr>
		<tr>
			<td>Your Valuable feedback  </td>
			<td>: ${feedback}<td>
		</tr>
	</table>

</body>
</html>