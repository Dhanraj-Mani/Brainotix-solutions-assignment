package com.dhanu.employeecontroller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhanu.employeedto.EmployeeRegistrationDTO;
import com.dhanu.employeeservice.EmployeeService;

@Controller
public class EmployeeRegistrationController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value= "/register", method = RequestMethod.GET)
	public String employeeRegister(@Valid @ModelAttribute("empReg")EmployeeRegistrationDTO employeeRegistrationDTO, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println("registration page has error");
			return"employee-registration-page";
		}
			return "fail";
		
		
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(EmployeeRegistrationDTO employeeRegistrationDTO, Map<String, Object>map) {
		
		employeeService.create(employeeRegistrationDTO);
		return "registration-success-page";
	}
		
	@RequestMapping(value = "/registrationsuccess", method = RequestMethod.POST)
	public String registrationSuccess(@Valid @RequestParam("employeeFirstName")String employeeFirstName,@RequestParam("employeeMiddleName")String employeeMiddleName,@RequestParam("employeeLastName")String employeeLastName,
										@RequestParam("employeeDOB")Integer employeeDOB,@RequestParam("gender")String gender,@RequestParam("address")String address,@RequestParam("pincode")int pincode, Map<String, Object> map,
										@ModelAttribute("empReg")  EmployeeRegistrationDTO EmployeeRegistrationdto, BindingResult result)
	{
		map.put("employeeFirstName", employeeFirstName);
		map.put("employeeMiddleName", employeeMiddleName);
		map.put("employeeLasstName", employeeLastName);
		map.put("employeeDOB", employeeDOB);
		map.put("gender", gender);
		map.put("address", address);
		map.put("pincode", pincode);
		
		if(result.hasErrors())
		{
			System.out.println("Registration is not success");
			return "employee-registration-page";
		}
		
		return "registration-success-page";
	}
}
