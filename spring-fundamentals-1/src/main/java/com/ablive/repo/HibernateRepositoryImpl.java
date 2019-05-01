package com.ablive.repo;

import java.util.ArrayList;
import java.util.List;

import com.ablive.model.Customer;

public class HibernateRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.ablive.repo.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Test FirstName");
		customer.setLastName("Test LastName");
		
		customers.add(customer);
		
		return customers;
	}
	
}