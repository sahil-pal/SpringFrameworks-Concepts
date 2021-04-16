<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="resources/css/index-page.css"rel="stylesheet">
<title>MVC | FORM</title>

</head>
<body>

<jsp:include page = "/WEB-INF/jsp/header.jsp"></jsp:include>

<div class="description">
	<p> This is a demo Spring MVC project </p>
	<p> created by sahil pal : 19csu265 </p>
	<p> You need to fill the form to get started ! </p>
</div>

<button type="button" class="block"><a href="/jsp/userform.jsp">GET STARTED!</a></button>

</body>
</html>