<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Registration success page.</h1>
	<hr>
	
	<form action="register" modelAttribute="fmDetails"></form>
	<div align="center">
	<p> Your registered details are : </p>
	<table border="1">
        <tr>
            <th width="40">Emp_Code</th>
            <th width="40">Emp_FirstName</th>
            <th width="40">Emp_MiddleName</th>
            <th width="40">Emp_LastName</th>
            <th width="40">Emp_DOB</th>
            <th width="40">Emp_Gender</th>
            <th width="40">Emp_Address</th>
            <th width="40">Emp_Pincode</th>
            <th width="50">Action</th>
        </tr>
        <tr>
        
	<td> ${empReg.employeeCode} </td>
	<td> ${empReg.employeeFirstName}</td>
	<td> ${empReg.employeeMiddleName}</td>
	<td> ${empReg.employeeLastName}</td>
	<td> ${empReg.employeeDOB}</td>
	<td> ${empReg.gender}</td>
	<td> ${empReg.address}</td>
	<td> ${empReg.pincode}</td>
	<td>
	<a href="/register" >Edit</a>
	&nbsp;&nbsp;
	<a href="/register">Add</a>
	</td>
	</tr></table>
	</div>
	
	<h2 align="center">Employee family details :</h2>
	<hr>
	<div align="center">
	<table border="1">
	<tr>
	<th width="40">FamilyMember Name</th>
	<th width="40">FamilyMember DOB</th>
	<th width="40">Relationship with Employee</th>
	<th width="40">Action</th>
	</tr>
	
	<tr>
	<td> ${empReg.employeeFamilymembersDTO.familymemberName}</td>
	<td> ${empReg.employeeFamilymembersDTO.dob}</td>
	<td> ${empReg.employeeFamilymembersDTO.employeeRelationship}</td>
	
	<td>
	<a href="/register">Edit</a>
	&nbsp;&nbsp;
	<a href="/register">Add</a>
	</td>
	</tr>
	</table>
	</div>
	
</body>
</html>