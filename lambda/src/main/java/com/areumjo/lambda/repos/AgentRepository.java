package com.areumjo.lambda.repos;

import com.areumjo.lambda.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long>
{
//    Agent findByName(String name);
}
