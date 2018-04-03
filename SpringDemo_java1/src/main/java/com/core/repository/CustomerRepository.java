package com.core.repository;

import com.core.model.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
