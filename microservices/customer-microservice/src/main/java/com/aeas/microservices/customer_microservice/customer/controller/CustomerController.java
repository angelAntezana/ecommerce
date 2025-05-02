package com.aeas.microservices.customer_microservice.customer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeas.microservices.customer_microservice.web.controller.interfaces.CustomerApi;
import com.aeas.microservices.customer_microservice.web.model.dto.CustomerDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("v1/customer")
public class CustomerController implements CustomerApi{

    @Override
    public ResponseEntity<CustomerDTO> createCustomer(@Valid CustomerDTO customerDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCustomer'");
    }

    @Override
    public ResponseEntity<Void> deleteCustomer(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public ResponseEntity<CustomerDTO> getCustomerByfirstName(String firstName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerByfirstName'");
    }

    @Override
    public ResponseEntity<Void> updateCustomer(String firstName, @Valid CustomerDTO customerDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }
    
}
