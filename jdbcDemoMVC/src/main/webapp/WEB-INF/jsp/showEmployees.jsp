<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/showEmployees.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>Show Employees</title>
</head>
<body>

	<div class="heading">
		<br>
		<h1>EMPLOYEE LIST</h1>
		<hr>
	</div>
	
	<c:if test="${key > 0}">
		<a class="back" href="HomepageAdmin">GO BACK</a>
	</c:if>
	<c:if test="${key < 1}">
		<a class="back" href="HomepageGuest">GO BACK</a>
	</c:if>
	
	<br>
	<br>

	<c:if test="${key < 1}">
		<div class="form">
			<h1>Edit Form</h1>
			<form action="search" method="post">
				<i style="font-size:12px">*search Employees by the Department number</i><br>
				<p>
					Enter Department Number : <br> <input type="text" name="departmentNum" placeholder="Enter here" />
				</p>
				<br>
				<br>
				<input type="submit" value="SEARCH" />
			</form>
		</div>
	</c:if>

	<br>
	<br>
	<br>


	<table class="table table-bordered" style="width:95%">
		<tr>
			<th>Username</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>Ssn</th>
			<th>bdate</th>
			<th>Sex</th>
			<th>Address</th>
			<th>Salary</th>
			<th>SuperSsn</th>
			<th>Department Number</th>
			<c:if test="${key > 0}">
				<th>Actions</th>
			</c:if>

		</tr>
		<c:forEach items="${employeeList}" var="employee">
			<tr>

				<td width="60" align="center">${employee.username}</td>
				<td width="60" align="center">${employee.getFname()}</td>
				<td width="60" align="center">${employee.getLname()}</td>
				<td width="60" align="center">${employee.getSsn()}</td>
				<td width="60" align="center">${employee.getBdate()}</td>
				<td width="60" align="center">${employee.getSex()}</td>
				<td width="60" align="center">${employee.getAddress()}</td>
				<td width="60" align="center">${employee.getSalary()}</td>
				<td width="60" align="center">${employee.getSuperSsn()}</td>
				<td width="60" align="center">${employee.getDno()}</td>

				<c:if test="${key > 0}">

					<td width="60" align="center"><a
						href="editEmp/${employee.username}">Edit</a>/<a
						href="deleteEmp/${employee.username}">Delete</a></td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</body>
</html>