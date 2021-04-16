<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="resources/css/login-page.css"rel="stylesheet">
<title>MVC | LoginPage</title>

</head>
<body>

<h1>LOGIN PAGE</h1>
<form action="welcome" method="post">
<table class="tb" >
<tr>
<td>Enter your user name : </td>
<td><input type="text" name="userId" placeholder="Enter text here"></td>
</tr>
<tr>
<td>Enter your password : </td>
<td><input type="password" name="pass" placeholder="Enter text here"></td>
</tr>
<tr>
<td>
<button type="reset">RESET</button>
</td>
<td>
<button type="submit">LOGIN</button>
</td>
</tr>
</table>
</form>

</body>
</html>