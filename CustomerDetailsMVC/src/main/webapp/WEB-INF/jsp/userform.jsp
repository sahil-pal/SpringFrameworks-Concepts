<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="resources/css/form-page.css"rel="stylesheet">
<title>MVC | FORM</title>

</head>
<body>

<jsp:include page = "header.jsp"></jsp:include>
<div class = "form">
<form:form action="thankyou" method="post" modelAttribute="customerModel">
	<table>
		<tr>
			<td>Enter your Name : </td>
			<td><form:input path="name" placeholder="Enter here" required="missing"/></td>
		</tr>
		<tr>
			<td>Enter your E-mail id : </td> 
			<td><form:input type="email" path="email" placeholder="Enter here" /></td>
		</tr>
		<tr>
			<td>Enter your Phone number : </td>
			<td><form:input path="contactnumber" placeholder="Enter here" required="missing"/></td>
		</tr>
		<tr>
			<td>Select your Interests : </td>
			<td>
			<form:select  path="interest1">
   		    <form:option  value="NONE"> -- Select from here --</form:option>
    		<form:options items="${interest1}"></form:options>
  			</form:select>
			<td>
			<td>
			<form:select  path="interest2">
   		    <form:option  value="NONE"> -- Select from here --</form:option>
    		<form:options items="${interest2}"></form:options>
  			</form:select>
			<td>
		</tr>
		<tr>
			<td>Select your gender : 
			<td>Male: 
			<form:radiobutton path="gender" value="Male"/></td>
			<td>Female: 
			<form:radiobutton path="gender" value="Female"/></td>
		</tr>
		<tr>
			<td>Select your city : </td>
			<td>
			<form:select  path="city">
   		    <form:option  value="NONE"> -- Select from here --</form:option>
    		<form:options items="${city}"></form:options>
  			</form:select>
			<td>
		</tr>
		<tr>
			<td>Select your state : </td>
			<td>
			<form:select  path="state">
   		    <form:option  value="NONE"> -- Select from here --</form:option>
    		<form:options items="${state}"></form:options>
  			</form:select>
			<td>
		</tr>
		<tr>
			<td>Please Enter the feedback : </td>
			<td><form:textarea path="feedback" placeholder="Write your views in upto 200 words." required="missing"/></td>
		</tr>
		<tr>
			<td><form:checkbox path="newsletter" value="yes"/></td>
			<td>Subscribe to our newsletter! </td>
		</tr>
		<tr>
		<td></td>
		<td><form:button type="submit"> SUBMIT </form:button></td>
		</tr>
	</table>
</form:form>
</div>

</body>
</html>