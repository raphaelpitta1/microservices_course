package com.course.microservice.hrworker.hrworker.repositories;

import com.course.microservice.hrworker.hrworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface workerRepository extends JpaRepository<Worker, Long> {

    
    
}
