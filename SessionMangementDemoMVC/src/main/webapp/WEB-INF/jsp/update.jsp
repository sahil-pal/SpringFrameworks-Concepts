<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Info | MVC</title>
</head>

<body>

<div class="header">
		<h1 style="text-align:center;'">PROFILE UPDATE</h1>
		<br>
	</div>

<div class="form">
<form:form action="welcome" method="post" modelAttribute="userModel">
	
	<form:input class="form-control" type="hidden" path="email" value="sahil@gmail.com"/>
	<form:input class="form-control" type="hidden" path="password" value="sahil"/>
	
	<p>Choose city : <br>
		<form:select  path="city">
   		<form:option  value="NONE"> -- Select from here --</form:option>
    	<form:options items="${city}"></form:options>
  		</form:select>
	</p>
	<p>Choose state : <br>
		<form:select  path="state">
   		<form:option  value="NONE"> -- Select from here --</form:option>
    	<form:options items="${state}"></form:options>
  		</form:select>
	</p>
	<p>Choose interest : <br>
		<form:select  path="interest">
   		<form:option  value="NONE"> -- Select from here --</form:option>
    	<form:options items="${interest}"></form:options>
  		</form:select>
	</p>
	
	<input class="form-submit" type="submit" value="UPDATE" />

</form:form>
</div>

</body>
</html>