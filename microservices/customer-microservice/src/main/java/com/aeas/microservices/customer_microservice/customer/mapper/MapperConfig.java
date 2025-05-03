package com.aeas.microservices.customer_microservice.customer.mapper;

import org.mapstruct.ReportingPolicy;

@org.mapstruct.MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE,
componentModel = "spring"
)
public interface MapperConfig {
    
}
