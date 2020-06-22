package com.dhanu.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_familydetails")
public class EmployeeFamilyMembers {
	
	@Column(name = "Emp_familymemberName")
	private String familymembersName;
	@Id
	@Column(name = "Emp_familymemberDOB")
	private int dateOfbirth;
	@Column(name = "Emp_realtionship")
	private String relationship;
	@ManyToOne
	@JoinColumn(name = "Emp_code")
	private EmployeeHibernate employeeHibernate;
	
	public String getFamilymembersName() {
		return familymembersName;
	}
	public void setFamilymembersName(String familymembersName) {
		this.familymembersName = familymembersName;
	}
	public int getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(int dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public EmployeeHibernate getEmployeeHibernate() {
		return employeeHibernate;
	}
	public void setEmployeeHibernate(EmployeeHibernate employeeHibernate) {
		this.employeeHibernate = employeeHibernate;
	}
	
	

}
