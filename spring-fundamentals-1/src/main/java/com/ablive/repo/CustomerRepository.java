package com.ablive.repo;

import java.util.List;

import com.ablive.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}