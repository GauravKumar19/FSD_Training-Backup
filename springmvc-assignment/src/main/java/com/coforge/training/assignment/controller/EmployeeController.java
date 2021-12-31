package com.coforge.training.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.coforge.training.assignment.model.Employee;
import com.coforge.training.assignment.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping("/showForm")//Method level mapping
	public String showFormForAdd(ModelMap theModel) {
	Employee theemployee = new Employee();
	theModel.addAttribute("employee", theemployee);
	return "emp-form";//emp-form.jsp
	}
	
	
	@PostMapping("/saveEmp")
	public String saveEmp(@ModelAttribute("employee") Employee theemployee) {
		empService.saveEmp(theemployee);
	return "redirect:/employee/list";//listcustomer.jsp
	}
	
	@GetMapping("/list") // @GetMapping - method level , default GET method
	public String listEmployees(ModelMap theModel) {
	List<Employee> theemployee = empService.getemployee();
	theModel.addAttribute("employee", theemployee);

	return "emp-list"; // customers attributes is added to view & returned
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("empId") int theId,
	ModelMap theModel) {
	Employee theemployee = empService.getEmp(theId);
	theModel.addAttribute("employee", theemployee);
	return "emp-form";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") int theId) {
		empService.deleteEmp(theId);
	return "redirect:/employee/list";
	}

}
