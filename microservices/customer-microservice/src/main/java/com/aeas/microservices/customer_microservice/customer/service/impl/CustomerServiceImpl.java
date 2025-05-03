package com.aeas.microservices.customer_microservice.customer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aeas.microservices.customer_microservice.customer.mapper.CustomerMapper;
import com.aeas.microservices.customer_microservice.customer.model.Customer;
import com.aeas.microservices.customer_microservice.customer.repository.CustomerRepository;
import com.aeas.microservices.customer_microservice.customer.service.CustomerService;
import com.aeas.microservices.customer_microservice.web.model.dto.CustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostRequestCustomerDTO;
import com.aeas.microservices.customer_microservice.web.model.dto.PostResponseCustomerDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    @Override
    public PostResponseCustomerDTO createCustomer(PostRequestCustomerDTO postRequestCustomerDTO) {
        Customer newCustomer = customerMapper.postRequesttoModel(postRequestCustomerDTO);
        Customer savedCustomer = customerRepository.save(newCustomer);
        PostResponseCustomerDTO response = new PostResponseCustomerDTO();
        response.setId(savedCustomer.getId());
        return response;
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.findById(id)
            .orElseThrow();
        customerRepository.deleteById(id);
    }

    @Override
    public CustomerDTO getCustomerById(String id) {
        return customerRepository.findById(id)
            .map(customerMapper::toDTO)
            .orElseThrow(); 
    }

    @Override
    public List<CustomerDTO> getCustomers() {
        return customerRepository.findAll()
            .stream()
            .map(customerMapper::toDTO)
            .toList();
    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {
        customerRepository.findById(id)
        .orElseThrow();
        customerRepository.save(customerMapper.toModel(customerDTO));
    }

 
    

}
