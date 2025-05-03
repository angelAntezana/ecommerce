package com.aeas.microservices.customer_microservice.customer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.aeas.microservices.customer_microservice.customer.model.Customer;
import com.aeas.microservices.customer_microservice.web.model.dto.CustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostRequestCustomerDTO;

@Mapper(config = MapperConfig.class)
public interface CustomerMapper {
    
    Customer toModel(CustomerDTO customerDTO);

    CustomerDTO toDTO(Customer customer);

    @Mapping(target = "id", ignore = true)
    Customer postRequesttoModel(PostRequestCustomerDTO postRequestCustomerDTO);
}
