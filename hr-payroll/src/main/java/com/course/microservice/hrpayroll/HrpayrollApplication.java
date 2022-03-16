package com.course.microservice.hrpayroll;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class HrpayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpayrollApplication.class, args);
	}

}
