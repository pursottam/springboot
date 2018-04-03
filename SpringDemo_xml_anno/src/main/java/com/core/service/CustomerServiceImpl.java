package com.core.service;

import com.core.model.Customer;
import com.core.repository.CustomerRepository;
import com.core.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    CustomerRepository customerRepository ;//= new HibernateCustomerRepositoryImpl();



//    public CustomerServiceImpl(){
//
//    }
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;

    }
//    @Autowired
//    public void setCustomerRepository(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//   }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
