package com.dhanu.employeedao;

import java.util.List;

import com.dhanu.employeedto.EmployeeRegistrationDTO;

public interface EmployeeDAO {
	
	public void create(EmployeeRegistrationDTO employeeRegistrationDTO);
	public void update(EmployeeRegistrationDTO employeeRegistrationDTO);
	public EmployeeRegistrationDTO edit(String employeeCode);
	public void delete(String employeeCode);
	public EmployeeRegistrationDTO find(String employeeCode);
	public List<EmployeeRegistrationDTO> getAll();

}