package com.core.service;

import com.core.model.Customer;
import com.core.repository.CustomerRepository;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void setCustomerRepository(CustomerRepository customerRepository);
}
