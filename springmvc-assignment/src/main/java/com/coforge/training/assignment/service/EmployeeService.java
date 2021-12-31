package com.coforge.training.assignment.service;

import java.util.List;

import com.coforge.training.assignment.model.Employee;



public interface EmployeeService {

	public void saveEmp(Employee theemployee);
	public List<Employee> getemployee();
	public Employee getEmp(int theId);
	public void deleteEmp(int theId);
}
