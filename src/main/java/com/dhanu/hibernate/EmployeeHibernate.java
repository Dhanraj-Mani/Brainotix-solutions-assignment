package com.dhanu.hibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Employee")
public class EmployeeHibernate {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_code")
	private int employeeCode;
	@Column(name = "Emp_FirstName")
	private String employeeFirstName;
	@Column(name = "Emo_MiddleName")
	private String employeeMiddleName;
	@Column(name = "Emp_LastName")
	private String employeeLastName;
	@Column(name = "Emp_DOB")
	@Temporal(TemporalType.DATE)
	private Date employeeDOB;
	@Column(name = "Emp_Gender")
	private String gender;
	@Column(name = "Emp_Address")
	private String address;
	@Column(name = "Emp_Pincode")
	private String pincode;
	
	@OneToMany(mappedBy = "employeeHibernate")
	private Collection<EmployeeFamilyMembers> employeeFamilyMembers = new ArrayList<EmployeeFamilyMembers>();;
	
	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
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

	public Date getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(Date employeeDOB) {
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Collection<EmployeeFamilyMembers> getEmployeeFamilyMembers() {
		return employeeFamilyMembers;
	}

	public void setEmployeeFamilyMembers(Collection<EmployeeFamilyMembers> employeeFamilyMembers) {
		this.employeeFamilyMembers = employeeFamilyMembers;
	}

	

	
}
