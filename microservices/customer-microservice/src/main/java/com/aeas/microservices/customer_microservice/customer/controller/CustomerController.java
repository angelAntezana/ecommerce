package com.aeas.microservices.customer_microservice.customer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeas.microservices.customer_microservice.customer.service.CustomerService;
import com.aeas.microservices.customer_microservice.web.controller.interfaces.CustomerApi;
import com.aeas.microservices.customer_microservice.web.model.dto.CustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostRequestCustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostResponseCustomerDTO;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("api/v1/")
@RequiredArgsConstructor
public class CustomerController implements CustomerApi{

    private final CustomerService customerService;

    @Override
    public PostResponseCustomerDTO createCustomer(@Valid PostRequestCustomerDTO postRequestCustomerDTO) {
        return customerService.createCustomer(postRequestCustomerDTO);
    }

    @Override
    public void deleteCustomer(String id) {
        customerService.deleteCustomer(id);
    }

    @Override
    public CustomerDTO getCustomerById(String id) {
        return customerService.getCustomerById(id);
    }

    @Override
    public List<CustomerDTO> getCustomers() {
        return customerService.getCustomers();
    }

    @Override
    public void updateCustomer(String id, @Valid CustomerDTO customerDTO) {
        customerService.updateCustomer(id, customerDTO);
    }




    
}
