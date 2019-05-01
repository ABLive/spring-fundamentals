package com.ablive.application;

import com.ablive.service.CustomerService;
import com.ablive.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		System.out.println("FirstName : " + customerService.findAll().get(0).getFirstName());
		System.out.println("LastName : " + customerService.findAll().get(0).getLastName());
		
	}
	
}