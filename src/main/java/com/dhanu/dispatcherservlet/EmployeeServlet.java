package com.dhanu.dispatcherservlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.dhanu.employeeconfig.EmployeeConfiguration;

public class EmployeeServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] array = {EmployeeConfiguration.class};
		return array;
	}

	@Override
	protected String[] getServletMappings() {
		String[] array = {"/"};
		return array;
	}

}
