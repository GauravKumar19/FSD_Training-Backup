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
<title>Employee Application</title>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h1 style="color:blue; text-align: center;">Employee Registration</h1>
		<hr color="black" size="10" width="100%"/>
			<centre><div class="panel panel-info">
				<div class="panel-body">
				
					<form:form action="saveEmp" cssClass="form-horizontal"
						method="post" modelAttribute="employee">
						
						<!-- need to associate this data with employee id -->
						<form:hidden path="empid" />
						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Full
								Name</label>
							<div class="col-md-4">
								<form:input path="name" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="Designation" class="col-md-3 control-label">Designation</label>
							<div class="col-md-4">
								<form:input path="Designation" cssClass="form-control" />
							</div>
						</div><br>

						<div class="form-group">
						<div class="col-md-12">
							<label for="Location" class="col-md-2 control-label">Location</label>
							
							<form:select path="Location">
								<form:option value="Bangalore" label="Bangalore" />
								<form:option value="Delhi" label="Delhi" />
								<form:option value="Chennai" label="Chennai" />
								<form:option value="Mumbai" label="Mumbai" />
							</form:select>
							</div>
						</div><br>

						<div class="form-group">
							<label for="Salary" class="col-md-3 control-label">Salary</label>
							<div class="col-md-4">
								<form:input path="Salary" Class="form-control" />
							</div>
						</div><br>


						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button Class="btn btn-success">Submit</form:button>
							</div>

						</div>
					</form:form>
				</div>
				</div>
				</centre>
			</div>
		</div>
	</div>
</body>
</html>