package com.dhanu.employeedto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class EmployeeRegistrationDTO {
	
	private String employeeCode;
	@NotBlank(message = "* FirstName cannot be blank")
	private String employeeFirstName;
	private String employeeMiddleName;
	private String employeeLastName;
	@Min(18) @Max(60)
	private Integer employeeDOB;
	@NotBlank(message = "*Gender cannot be blank")
	private String gender;
	private String address;
	private int pincode;
	
	private EmployeeFamilymembersDTO employeeFamilymembersDTO;
	
	public EmployeeRegistrationDTO()
	{
		System.out.println("employee registration constr method has been called");
		
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeMiddleName() {
		return employeeMiddleName;
	}

	public void setEmployeeMiddleName(String employeeMiddleName) {
		this.employeeMiddleName = employeeMiddleName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public Integer getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(Integer employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public EmployeeFamilymembersDTO getEmployeeFamilymembersDTO() {
		return employeeFamilymembersDTO;
	}

	public void setEmployeeFamilymembersDTO(EmployeeFamilymembersDTO employeeFamilymembersDTO) {
		this.employeeFamilymembersDTO = employeeFamilymembersDTO;
	}

	@Override
	public String toString() {
		return "EmployeeRegistrationDTO [employeeCode=" + employeeCode + ", employeeFirstName=" + employeeFirstName
				+ ", employeeMiddleName=" + employeeMiddleName + ", employeeLastName=" + employeeLastName
				+ ", employeeDOB=" + employeeDOB + ", gender=" + gender + ", address=" + address + ", pincode="
				+ pincode + "]";
	}

	
	
}