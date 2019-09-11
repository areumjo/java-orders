package com.areumjo.lambda.services;

// contract between controller and the service
import com.areumjo.lambda.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAll();

//    Customer findCustomerById(long id);
//
//    Customer findCustomerByName(String name);
//
//    void delete(long id);
//
//    Customer save(Customer customer);
//
//    Customer update(Customer customer, long id);
}
