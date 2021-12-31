<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style1.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-13.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<meta charset="ISO-8859-1">
<title>Employee Management</title>

</head>
<body>
	<h1 align="center">Employee Management System</h1>
	<hr style="height:20px; width:100%; border-width:0; color:red; background-color:red">
	<br>
	<div class="d-flex justify-content-center">
		<a href="employee/showForm">
			<button type=button class="btn btn-outline-primary">Register
				Employee</button>
				
		</a> <a href="employee/list">
			<button type=button class="btn btn-outline-primary">Show
				Employee</button>
		</a>
	</div>
</body>
</html>