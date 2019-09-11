package com.areumjo.lambda.services;

import com.areumjo.lambda.models.Customer;
import com.areumjo.lambda.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository custrepos;

    @Override
    public List<Customer> findAll() {
        List<Customer> rtnList = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(rtnList::add);
        return rtnList;
    }

//    @Override
//    public Customer findCustomerById(long id) {
//        return custrepos.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Id " + id));
//    }


//    @Override
//    public Customer findCustomerByName(String name) {
//        Customer customer = custrepos.findByName(name);
//
//        if (customer == null)
//        {
//            throw new EntityNotFoundException("Customer Not Found " + name);
//        }
//        return customer;
//    }

//    @Override
//    public void delete(long id) {
//    if (custrepos.findById(id).isPresent())
//    {
//        custrepos.deleteById(id);
//    } else
//    {
//        throw new EntityNotFoundException("Id " + id);
//    }

//    @Transactional
//    @Override
//    public Customer save(Customer customer) {
//        return null;
//    }
//
//    @Transactional
//    @Override
//    public Customer update(Customer customer, long id) {
//        return null;
//    }
}
