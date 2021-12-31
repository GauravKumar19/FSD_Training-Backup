<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM- Customer List</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style1.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-13.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body background="<c:url value="/resources/images/background.jpg"/>" />

<div class="container">
	<div class="col-md-offset-1 col-md-10">
		<h1 style="color:Tomato; text-align: center;">WELCOME TO COFORGE</h1>
		<hr color="pink" size="10" width="100%"/>
		<div class="panel panel-info">
			<div class="panel-heading">
				<p class="bg-info text-white">EMPLOYEE DETAILS</p>
			</div>
			<div class="table-responsive">
				<table class="table table-striped table-bordered table-dark">
					<tr>
						<th>EmpId</th>
						<th>Designation</th>
						<th>Location</th>
						<th>Name</th>
						<th>Salary</th>
						<th>Action</th>

					</tr>

					<!-- loop over and print our customers -->
					<c:forEach var="tempemployee" items="${employee}">

						<!-- construct an "update" link with customer id -->
						<c:url var="updateLink" value="/employee/updateForm">
							<c:param name="empId" value="${tempemployee.empid}" />
						</c:url>

						<!-- construct an "delete" link with customer id -->
						<c:url var="deleteLink" value="/employee/delete">
							<c:param name="empId" value="${tempemployee.empid}" />
						</c:url>
						<tr bgcolor="pink">
							<td>${tempemployee.empid}</td>
							<td>${tempemployee.name}</td>
							<td>${tempemployee.designation}</td>
							<td>${tempemployee.location}</td>
							<td>${tempemployee.salary}</td>

							<td>
								<!-- display the update link --> <a href="${updateLink}">Update</a>
								| <a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure you want to delete this Employee?'))) return false">Delete</a>
							</td>



						</tr>



					</c:forEach>



				</table>
				 <input
			type="button" value="Add Employee"
			onclick="window.location.href='showForm'; return false;"
			class="btn btn-primary" /> <br /> <br />



			</div>
		</div>
	</div>



</div>
</body>
</html>