<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	h1{
			text-align:center;
			background-color:BlanchedAlmond;
			font-size:30px;
		}
</style>
<title>Success Page | MVC</title>
</head>
<body>

<h1>Email sent to : <c:out value="${email.getMailTo() }"></c:out> </h1><br><br>
<h2>Want To Send another mail ?</h2>

<br>
<br>

<a href="EmailForm">Send Another!</a>

</body>
</html>