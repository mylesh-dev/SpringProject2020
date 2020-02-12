package com.mylesh.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mylesh.springdemo.dao.CustomerDAO;
import com.mylesh.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {	
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
}










