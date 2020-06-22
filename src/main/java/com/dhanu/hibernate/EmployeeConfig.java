package com.dhanu.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dhanu.employeedto.EmployeeRegistrationDTO;

public class EmployeeConfig {

	public static void main(String[] args) {
		
		EmployeeHibernate employeeHibernate = new EmployeeHibernate();
		employeeHibernate.setEmployeeCode(1);
		employeeHibernate.setEmployeeFirstName("Dinesh");
		employeeHibernate.setEmployeeMiddleName("Raja");
		employeeHibernate.setEmployeeLastName("Selvam");
		employeeHibernate.setEmployeeDOB(new Date());
		employeeHibernate.setGender("Male");
		employeeHibernate.setAddress("chennai");
		employeeHibernate.setPincode("600123");
		
		EmployeeFamilyMembers empfamily = new EmployeeFamilyMembers();
		empfamily.setDateOfbirth(25/10/1990);
		empfamily.setFamilymembersName("Suresh");
		empfamily.setRelationship("brother");

		EmployeeFamilyMembers empfamily2 = new EmployeeFamilyMembers();
		empfamily2.setDateOfbirth(25/10/1994);
		empfamily2.setFamilymembersName("Ramesh");
		empfamily2.setRelationship("uncle");
		
		employeeHibernate.getEmployeeFamilyMembers().add(empfamily);
		employeeHibernate.getEmployeeFamilyMembers().add(empfamily2);
		
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(EmployeeHibernate.class).addAnnotatedClass(EmployeeFamilyMembers.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(employeeHibernate);
		session.save(empfamily);
		session.save(empfamily2);
		session.getTransaction().commit();
	}
}
