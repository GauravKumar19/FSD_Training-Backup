package com.coforge.training.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.model.Employee;

@RestController
public class EmployeeController {
	
	private List<Employee> employees() {
		List<Employee> employees = 
				Arrays.asList(
				 new Employee("John", "Developer"),
				 new Employee("Michel", "Sr Developer"), 
				 new Employee("Harris", "Developer"),
				 new Employee("Kamla", "Sr Developer"), 
				 new Employee("Jerome", "Manager")
				 );
				 return employees;
				}

	@GetMapping("/employees")
	public List<Employee> getEmployees(){//Returns JSON or Returns REST data in JSON format(Default)
		
		return employees();
	}
	
	@GetMapping(value="/employeesxml",produces=MediaType.APPLICATION_XML_VALUE)//Returns REST data in XML Format(Default)
	public List<Employee> getXmlEmployees(){
		
		return employees();
	}
}
