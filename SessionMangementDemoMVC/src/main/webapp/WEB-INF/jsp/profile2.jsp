<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/profile.css" rel="stylesheet"> 
<title>User Profile | MVC</title>
</head>
<body>
	
	<div class="header">
	<h1 style="text-align:center;"> USER PROFILE PAGE 2 </h1>
	<hr>
	</div>
	
	<div class="details">
	 Name : ${user.name } <br>
	 Age : ${user.age }	<br>
	 Interest : ${user.interest } <br>
	</div>
	
</body>
</html>