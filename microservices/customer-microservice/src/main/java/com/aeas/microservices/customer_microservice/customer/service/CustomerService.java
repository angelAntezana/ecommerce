package com.aeas.microservices.customer_microservice.customer.service;

import java.util.List;

import com.aeas.microservices.customer_microservice.web.model.dto.CustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostRequestCustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostResponseCustomerDTO;



public interface CustomerService {
    
    PostResponseCustomerDTO createCustomer(PostRequestCustomerDTO postRequestCustomerDTO);

    void deleteCustomer(String id);

    CustomerDTO getCustomerById(String id);

    List<CustomerDTO> getCustomers();
    
    void updateCustomer(String id, CustomerDTO customerDTO);
}
