package com.areumjo.lambda.controllers;

import com.areumjo.lambda.models.Customer;
import com.areumjo.lambda.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    // http://localhost:8000/customer/order -- returns all customers with their orders
    @GetMapping(value = "/customer/order",
                produces = {"application/json"})
    public ResponseEntity<?> listAllCustomer()
    {
        List<Customer> myCustomer = customerService.findAll();
        return new ResponseEntity<>(myCustomer, HttpStatus.OK);
    }

}
