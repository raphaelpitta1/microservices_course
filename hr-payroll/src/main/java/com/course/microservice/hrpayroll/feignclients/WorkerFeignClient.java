package com.course.microservice.hrpayroll.feignclients;

import com.course.microservice.hrpayroll.config.LoadBalancerConfiguration;
import com.course.microservice.hrpayroll.entities.Worker;

import org.slf4j.Logger;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@LoadBalancerClient(name = "customer-service",
configuration=LoadBalancerConfiguration.class)
@FeignClient(name = "hr-worker",  path="/workers")
public interface WorkerFeignClient {
    
    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable  Long id);
}
