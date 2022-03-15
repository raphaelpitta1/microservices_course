package com.course.microservice.hrpayroll.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {

    @Bean
    public ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new DemoInstanceSupplier("hr-worker");
    }
}
