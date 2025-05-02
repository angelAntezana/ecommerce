package com.aeas.microservices.customer_microservice.customer.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aeas.microservices.customer_microservice.customer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository <Customer, String> {
    
}
