package com.coforge.training.assignment.dao;

import java.util.List;

import com.coforge.training.assignment.model.Employee;

public interface EmployeeDao {

	public void saveEmp(Employee theemployee);
	public List<Employee> getemployee();
	public Employee getEmp(int theId);
	public void deleteEmp(int theId);
}
