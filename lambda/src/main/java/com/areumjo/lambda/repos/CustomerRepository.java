package com.areumjo.lambda.repos;

import com.areumjo.lambda.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
//    Customer findByName(String name);
}
