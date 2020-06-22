package com.dhanu.employeedao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanu.employeedto.EmployeeRegistrationDTO;

@Repository("employeeDAO")
public class EmployeeDaoImpl implements EmployeeDAO {
	
	@Autowired
	SessionFactory sf;

	protected Session currentSession() {
		return sf.getCurrentSession();
	}

	@Override
	public void create(EmployeeRegistrationDTO employeeRegistrationDTO) {
		currentSession().save(employeeRegistrationDTO);
	}

	@Override
	public void update(EmployeeRegistrationDTO employeeRegistrationDTO) {
		currentSession().update(employeeRegistrationDTO);
		
	}

	@Override
	public EmployeeRegistrationDTO edit(String employeeCode) {
		return find(employeeCode);
	}

	@Override
	public void delete(String employeeCode) {
		currentSession().delete(employeeCode);
		
	}

	@Override
	public EmployeeRegistrationDTO find(String employeeCode) {
		return currentSession().get(EmployeeRegistrationDTO.class, employeeCode);
	}

	@Override
	public List<EmployeeRegistrationDTO> getAll() {
		return currentSession().createCriteria(EmployeeRegistrationDTO.class).list();
	}

}
