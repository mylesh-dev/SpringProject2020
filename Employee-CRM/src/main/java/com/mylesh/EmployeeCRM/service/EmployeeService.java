package com.mylesh.EmployeeCRM.service;

import java.util.List;

import com.mylesh.EmployeeCRM.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theName);
	
}
