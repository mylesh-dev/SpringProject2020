package com.mylesh.EmployeeCRM.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylesh.EmployeeCRM.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
	
	// search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}
