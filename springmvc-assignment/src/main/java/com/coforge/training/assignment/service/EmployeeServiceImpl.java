package com.coforge.training.assignment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.assignment.dao.EmployeeDao;
import com.coforge.training.assignment.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empDao;
	
	@Override
	@Transactional
	public void saveEmp(Employee theemployee) {

		empDao.saveEmp(theemployee);
		
	}

	@Override
	@Transactional
	public List<Employee> getemployee() {


		return empDao.getemployee();
	}

	@Override
	@Transactional
	public Employee getEmp(int theId) {
		
		return empDao.getEmp(theId);
	}

	@Override
	@Transactional
	public void deleteEmp(int theId) {
		
		empDao.deleteEmp(theId);
		
	}

	

}
