package com.dhanu.employeedto;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;
public class EmployeeFamilymembersDTO {
	
	@NotBlank(message = "* Atleast one family name need to be entered")
	private String familymemberName;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Integer dob;
	private String employeeRelationship;
	
	public EmployeeFamilymembersDTO() {
		
		System.out.println("familymembers constr method has been called");
	}

	public String getFamilymemberName() {
		return familymemberName;
	}

	public void setFamilymemberName(String familymemberName) {
		this.familymemberName = familymemberName;
	}

	public Integer getDob() {
		return dob;
	}

	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public String getEmployeeRelationship() {
		return employeeRelationship;
	}

	public void setEmployeeRelationship(String employeeRelationship) {
		this.employeeRelationship = employeeRelationship;
	}

	@Override
	public String toString() {
		return "EmployeeFamilymembersDTO [familymemberName=" + familymemberName + ", birthdate=" + dob
				+ ", employeeRelationship=" + employeeRelationship + "]";
	}
	
	

}
