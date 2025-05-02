package com.aeas.microservices.customer_microservice.customer.mapper;

import org.mapstruct.Mapper;

import com.aeas.microservices.customer_microservice.customer.model.Customer;
import com.aeas.microservices.customer_microservice.web.model.dto.CustomerDTO;

@Mapper(config = MapperConfig.class)
public interface CustomerMapper {
    
    public Customer toModel(CustomerDTO customerDTO);

    public CustomerDTO toDTO(Customer customer);
}
