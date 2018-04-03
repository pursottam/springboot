package com.core.repository;

import com.core.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll(){
        List<Customer> customers =new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Purshottam");
        customer.setLastName("Tiwari");
        customers.add(customer);

        return customers;
    }
}
