package com.dhanu.employeecontroller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhanu.employeedto.EmployeeFamilymembersDTO;

@Controller
public class FamilyMemberController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String familyDetails(@Valid @RequestParam("familymemberName")String familymemberName, @RequestParam("dob")Integer dob, @RequestParam("employeeRelationship")String employeeRelationship,
								Map<String, Object> map,@ModelAttribute("fmDetails") EmployeeFamilymembersDTO employeeFamilymembersdto, BindingResult result)
	{
		map.put("familymemberName", familymemberName);
		map.put("dob", dob);
		map.put("employeeRelationship", employeeRelationship);
		
		if(result.hasErrors())
		{
			System.out.println("Family details is not valid");
			return "employee-registration-page";
		}
		System.out.println("Employee family details generated");
		return"family-memberdetails-page";
	}
	
}
