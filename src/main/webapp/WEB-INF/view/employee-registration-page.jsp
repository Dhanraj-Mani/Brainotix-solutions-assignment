<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error{
color: red;
text-align: left;
position: fixed;
margin-left: 30px;
}
</style>

<style type="text/css">
	.form {
		margin: 0 auto;
		width: 210px;
	}

	.form label{
		display: inline-block;
		text-align: right;
		float: left;
	}

	.form input{
		display: inline-block;
		text-align: left;
		float: right;
	}
</style>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
	
	<h1 align="center">Welcome to employee page!!</h1>
	<hr>
	
	<form:form action="registrationsuccess" modelAttribute="empReg" method="post">
	<div align="center">
	<table border="1">
	<tr>
	<label for="emp_code">Employee Code :</label>
	<form:select path="employeeCode" placeholder="EmpCode" id="emp_code" cssClass="form">
	<form:option value="Select Employee_code"></form:option>
	<form:option value="001" name="Emp001"/>
	<form:option value="002" name="Emp002"/>
	<form:option value="003" name="Emp003"/>
	<form:option value="004" name="Emp004"/>
	<form:option value="005" name="Emp005"/>
	<form:option value="006" name="Emp006"/>
	</form:select>
	</tr>
	
	
	<tr>
	<td><label>Employee First Name :</label></td>
	<td><form:input path="employeeFirstName" cssClass="form"/></td>
	<td><label>Middle Name :</label></td>
	<td><form:input path="employeeMiddleName"/></td> 
	<td><label>Last Name :</label></td>
	<td><form:input path="employeeLastName"/></td>
	<td><form:errors path="employeeFirstName" cssClass="error"/></td>
	</tr>
	
	<tr>
	<td><label>Date of Birth :</label></td>
	<td><form:input path="employeeDOB"/></td>
	<form:errors path="employeeDOB" cssClass="error"/>
	</tr>
	
	<tr>
	<td><label>Gender :</label></td>
	<td>Male :<form:radiobutton path="gender" value="male" /></td>
	<td>Female :<form:radiobutton path="gender" value="female" /></td>
	<td><form:errors path="gender" cssClass="error"/></td>
	</tr>
	
	<tr>
	<td><label>Address :</label></td>
	<td><form:input path="address"/></td>
	</tr>
	
	<tr>
	<td><label>Pin code :</label></td>
	<td><form:input path="pincode" /></td>
	</tr>
	
	</table>
	
	
	<h2>Family Details:</h2>
	<hr>
	
	<table border="1">
	<tr>
	<td><label>Family MemberName : </label></td>
	<td><form:input path="employeeFamilymembersDTO.familymemberName"/></td>
	</tr>
	
	<tr>
	<td><label>Family MemberDOB :</label></td>
	<td><form:input path="employeeFamilymembersDTO.dob"/></td>
	</tr>
	
	<tr>
	<td><label>Relationship with employee :</label></td>
	<td><form:input path="employeeFamilymembersDTO.employeeRelationship"/></td>
	</tr>
	
	</table>
	
	<input type=submit value="Submit">
	
	</div>
	</form:form>
</body>
</html>