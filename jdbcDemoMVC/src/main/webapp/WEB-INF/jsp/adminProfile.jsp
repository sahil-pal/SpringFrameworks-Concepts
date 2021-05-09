<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/profile.css" rel="stylesheet"> 
<title>ProfilePage | MVC</title>
</head>
<body>

	<div class="header">
		<h1 style="text-align: center;">ADMIN PROFILE PAGE</h1>
		<hr>
	</div>

	<div class="details">
		<p>
			User name : ${user.username }<br> Account type : ${user.accType }<br>
			Name : ${user.getFname()} ${user.getLname() }<br> SSN :
			${user.getSsn()}<br> Date of Birth : ${user.getBdate() }<br>
			Gender : ${user.getSex() }<br> Address : ${user.getAddress() }<br>
			Salary : ${user.getSalary()}<br> Department Number :
			${user.getDno()}<br>
		</p>
	</div>
	
	<br>
	<br>

	<a class="back" href="HomepageAdmin">Go Back!</a>

</body>
</html>