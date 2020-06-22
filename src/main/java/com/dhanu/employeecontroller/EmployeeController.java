				package com.dhanu.employeecontroller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhanu.employeedto.EmployeeLoginDTO;

@Controller
public class EmployeeController {

	@RequestMapping("/login")
	public String getEmployeeLogin(@Valid @ModelAttribute("empLogin") EmployeeLoginDTO employeeLoginDTO,
			BindingResult result) {
		
		if (result.hasErrors()) {
			
			System.out.println("My login page has error");
			return "employee-login-page";
			
		}  
			System.out.println("My login successfully done");
			return "employee-registration-page";
	}
	

}
