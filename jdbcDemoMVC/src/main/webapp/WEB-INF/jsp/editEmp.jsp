<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h1 {
	text-align: center;
	font-size: 35px;
}

.form {
	margin: auto;
	width: 50%;
	border: 2px solid black;
	padding: 30px;
	background-color: BlanchedAlmond;
	text-align: center;
	font-size: 22px;
	font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto,
		Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
}
.form-control{
	
	width:75%;
	padding: 10px 18px;
	font-size:15px;
	margin: 7px 0;
}
.form-submit{
	
	background: #0066A2;
	color: white;
	border-style: outset;
	border-color: #0066A2;
	height: 50px;
	width: 100px;
	font: bold 18px arial, sans-serif;
}
</style>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>

	<h1>Edit Employee Details</h1>
	<br>
	<hr>

	<div class="form">
	<form action="processEdit" method="post">

		<input type="hidden" name="username" value="${username }" />

		<p>
			Enter Updated Address : <br> <input type="text" name="address" class="form-control" placeholder="Enter here" />
		</p>
		<p>
			Enter Updated Salary : <br> <input type="number" name="salary" class="form-control" placeholder="Enter here" />
		</p>
		<p>
			Enter Updated SuperSSN : <br> <input type="number" class="form-control" name="superSsn" placeholder="Enter here" />
		</p>
		<p>
			Enter Updated Department number : <br> <input type="text" class="form-control" name="departmentNum" placeholder="Enter here" />
		</p>

		<input class="form-submit" type="submit" value="EDIT" />

	</form>
	</div>


</body>
</html>