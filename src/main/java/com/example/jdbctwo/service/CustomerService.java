package com.example.jdbctwo.service;

import com.example.jdbctwo.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer create(Customer customerRequest);
    Customer update(Customer customerRequest, Long id );
    boolean delete (Long customerId);

}
