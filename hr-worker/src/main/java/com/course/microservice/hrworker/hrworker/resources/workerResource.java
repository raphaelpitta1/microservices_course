package com.course.microservice.hrworker.hrworker.resources;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import com.course.microservice.hrworker.hrworker.entities.Worker;
import com.course.microservice.hrworker.hrworker.repositories.workerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workers")

public class workerResource {
    @Autowired
    private workerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> listWorker = repository.findAll();
        return ResponseEntity.ok().body(listWorker);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable  Long id) {
       
        Worker worker = repository.findById(id).get();

        return ResponseEntity.ok().body(worker);
    }
}
