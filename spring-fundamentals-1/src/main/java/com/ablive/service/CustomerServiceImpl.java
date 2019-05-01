package com.ablive.service;

import java.util.List;

import com.ablive.model.Customer;
import com.ablive.repo.CustomerRepository;
import com.ablive.repo.HibernateRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo = new HibernateRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.ablive.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}