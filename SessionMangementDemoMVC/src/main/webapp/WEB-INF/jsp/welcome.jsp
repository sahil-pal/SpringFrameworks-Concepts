<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>

<style>
	
	h1{
		text-align:center;
		text-size:25px;
	}
		
</style>

<meta charset="UTF-8">
<link href="resources/css/homepage.css" rel="stylesheet">
<title>Homepage | MVC</title>
</head>
<body>
	
	<div class="header">
	<h1> Homepage </h1>
	<br>
	</div>

	<h3><i>Welcome, ${user.name }</i></h3>
	
	<div class="links">
	<a href="update">Update Profile</a><br>
	<br>
	<a href="profile">View Profile Details 1</a><br>
	<br>
	<a href="profile2">View Profile Details 2 </a>
	<br>
	</div>
		
</body>
</html>