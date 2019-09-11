package com.areumjo.lambda.repos;

import com.areumjo.lambda.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
