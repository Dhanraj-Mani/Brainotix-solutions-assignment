package com.dhanu.employeeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanu.employeedao.EmployeeDAO;
import com.dhanu.employeedto.EmployeeRegistrationDTO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	public void create(EmployeeRegistrationDTO employeeRegistrationDTO) {
		employeeDAO.create(employeeRegistrationDTO);
		
	}

	@Override
	public void update(EmployeeRegistrationDTO employeeRegistrationDTO) {
		employeeDAO.update(employeeRegistrationDTO);
		
	}

	@Override
	public EmployeeRegistrationDTO edit(String employeeCode) {
		return employeeDAO.edit(employeeCode);
	}

	@Override
	public void delete(String employeeCode) {
		employeeDAO.delete(employeeCode);
		
	}

	@Override
	public EmployeeRegistrationDTO find(String employeeCode) {
		return employeeDAO.find(employeeCode);
	}

	@Override
	public List<EmployeeRegistrationDTO> getAll() {
		return employeeDAO.getAll();
	}

}
