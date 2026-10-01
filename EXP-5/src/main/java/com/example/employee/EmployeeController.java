package com.example.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/retrieve")
    public Employee retrieve() {

        Employee emp = new Employee(101, "Bhavani", 5000);

        return emp;
    }
}