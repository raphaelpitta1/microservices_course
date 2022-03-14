package com.course.microservice.hrpayroll.services;

import com.course.microservice.hrpayroll.entities.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days){

        return new Payment("Bob", 320.0, 30);

    }
    
}
