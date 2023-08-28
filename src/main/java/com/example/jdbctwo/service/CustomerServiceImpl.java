package com.example.jdbctwo.service;

import com.example.jdbctwo.entity.Customer;
import com.example.jdbctwo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer create(Customer customerRequest) {
        return customerRepository.save(customerRequest);

    }

    @Override
    public Customer update(Customer customerRequest, Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (null!=customer){
            if(null!=customerRequest.getEmail()){
                customer.setEmail(customerRequest.getEmail());
            }
            if(null!=customerRequest.getFirstName()){
                customer.setFirstName(customerRequest.getFirstName());
            }
            if(null!=customerRequest.getLastName()){
                customer.setLastName(customerRequest.getLastName());
            }
            if(null!=customerRequest.getPhoneNumber()){
                customer.setPhoneNumber(customerRequest.getPhoneNumber());
            }

            customerRepository.save(customer);
        }

        return customer;
    }

    @Override
    public boolean delete(Long customerId) {
        customerRepository.deleteById(customerId);
        return true;
    }
}
