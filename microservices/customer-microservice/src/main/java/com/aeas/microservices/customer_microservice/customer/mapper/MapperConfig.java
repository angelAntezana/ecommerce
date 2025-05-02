package com.aeas.microservices.customer_microservice.customer.mapper;

import org.mapstruct.ReportingPolicy;

@org.mapstruct.MapperConfig(unmappedTargetPolicy = ReportingPolicy.ERROR,
componentModel = "spring"
)
public interface MapperConfig {
    
}
