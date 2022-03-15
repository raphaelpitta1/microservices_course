package com.course.microservice.hrpayroll.resources;

import com.course.microservice.hrpayroll.entities.Payment;
import com.course.microservice.hrpayroll.services.PaymentService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

@Autowired
private PaymentService service;
    

@GetMapping(value = "/{workerID}/days/{days}")

public ResponseEntity<Payment> getaPayment(@PathVariable Long workerID, @PathVariable int days){
    Payment payment = service.getPayment(workerID, days);

    return ResponseEntity.ok(payment);
}
}
