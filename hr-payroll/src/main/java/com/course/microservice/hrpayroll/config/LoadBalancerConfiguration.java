package com.course.microservice.hrpayroll.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {
    
/* #CONFIGURAÇÃO ESTATICA DO LOAD BALANCE
    @Bean
    public ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new DemoInstanceSupplier("hr-worker");
    }*/


//#CONFIGURAÇÃO DINAMICA DO LOAD BALANCE
@Bean
   public ServiceInstanceListSupplier
discoveryClientServiceInstanceListSupplier(
         ConfigurableApplicationContext context) {
      
      return ServiceInstanceListSupplier.builder()
               .withBlockingDiscoveryClient()  
              
               .build(context);
      }

}
