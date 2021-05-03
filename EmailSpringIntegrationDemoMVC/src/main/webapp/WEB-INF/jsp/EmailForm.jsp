<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style type="text/css">
		
		h1{
			text-align:center;
			background-color:BlanchedAlmond;
			font-size:40px;
		}
		
		table{
			font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
			padding:2px;
		}
		
		#block{
  		display: block;
  		width: 100%;
  		border: solid black;
  		background-color: green;
  		padding: 8px 20px;
  		font-size: 15px;
  		cursor: pointer;
  		text-align: center;
		}
		
		*{
			background-color:#D3D3D3;
		}
		
		#text{	
			 background: url(file:///Users/sahilpal/eclipse-workspace/EmailSpringIntegrationDemoMVC/src/main/webapp/resouces/images/benice.jpg) no-repeat;
			 opacity:0.9;
 			 height: 250px;
 			 background-size: cover;
 			 width:75%;
 			 overflow: auto;
 			 color:blue;
 			 font-size: 15px;
 			 font-family:Helvetica Neue;
 			 
		}
		
		hr{
			color:black;
		}
		
	</style>
	
<title>Email Form | MVC</title>
</head>
<body>

	<h1> Welcome To Email Sender </h1>
	<hr>

<form:form action = "send" method = "post" modelAttribute= "email">
	<table  border="0" width="100%">
 
 		<tr>
		<td>Email To : <form:input path="mailTo" size="65" placeholder = "Receiver's Address"/>
		<form:errors path = "mailTo" cssClass="error"></form:errors></td>
		</tr>

		<tr>
		<td>Subject : <form:input path = "subject" size="65" placeholder = "Add subject here"/>
		<form:errors path = "subject" cssClass="error"></form:errors></td>
		</tr>

		<tr>
		<td>Body : <br><br><form:textarea id="text" path="message" rows="10" placeholder = ""/></td>
		</tr>

		<tr>
		<td>Attach File : <form:input path="fileName" size="60" type = "file"/><br><br></td>
		</tr>
		
		<tr>
		<td><form:button id="block" type = "submit">Send</form:button></td>
		</tr>

	</table>
</form:form>

</body>
</html>