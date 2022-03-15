package com.course.microservice.hrpayroll.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;

import reactor.core.publisher.Flux;

public class DemoInstanceSupplier implements ServiceInstanceListSupplier{

    private final String serviceId;
    
    public DemoInstanceSupplier(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        // TODO Auto-generated method stub
        return Flux.just(Arrays
        .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8001, false),new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8002, false)));
    }

    @Override
    public String getServiceId() {
        // TODO Auto-generated method stub
        return serviceId;
    }

    
}
