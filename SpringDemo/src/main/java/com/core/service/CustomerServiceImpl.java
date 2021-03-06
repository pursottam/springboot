package com.core.service;

import com.core.model.Customer;
import com.core.repository.CustomerRepository;
import com.core.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository ;

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
