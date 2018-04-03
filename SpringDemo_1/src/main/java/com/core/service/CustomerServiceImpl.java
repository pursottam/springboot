package com.core.service;

import com.core.model.Customer;
import com.core.repository.CustomerRepository;
import com.core.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository ;//= new HibernateCustomerRepositoryImpl();



//    public CustomerServiceImpl(){
//
//    }
//    public CustomerServiceImpl(CustomerRepository customerRepository){
//        this.customerRepository=customerRepository;
//
//    }
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
   }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
