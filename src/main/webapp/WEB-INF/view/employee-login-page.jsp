<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function validateEmployeeName() {

		var empName = document.getElementById("employeeName").value
		alert("* EmployeeName should between 5 to 15 characters")

		if (empName.length < 5) {
			return false;
		} else {
			return true;
		}
	}
</script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error {
	color: red;
	font-family: arial;
	text-align: left;
	position: fixed;
}
</style>

</head>
<body>

	<h1 align="center">Welcome to employee login page</h1>
	<hr>

	<form:form action="register" modelAttribute="empLogin" method="get" onsubmit="return validateEmployeeName()">
		<div align="center">
			<p>
				<label>Employee Name :</label> 
				<form:input path="employeeName"/>
				<form:errors path="employeeName" cssClass="error"/>
			</p>

			<p>
				<label>Employee password :</label> 
				<form:password path="password"/>
				<form:errors path="password" cssClass="error"/>
			</p>

			<a href="register"><input type="submit" value="Login"></a>
			<input type="button" value="Cancel">
		</div>
	</form:form>
</body>
</html>