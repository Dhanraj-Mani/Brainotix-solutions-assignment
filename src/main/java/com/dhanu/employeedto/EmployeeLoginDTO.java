package com.dhanu.employeedto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EmployeeLoginDTO {
	@NotBlank(message = "* EmployeeName connot be blank")
	@Size(min = 5, max = 15, message = "* EmployeeName should between 5 to 15 characters")
	private String employeeName;
	@NotBlank(message = "* Password connot be blank")
	@Size(min = 5, max =10, message = "* Password should be atleast 1 special charecters")
	private String password;

	public EmployeeLoginDTO(String employeeName, String password) {
		this.employeeName = employeeName;
		this.password = password;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
