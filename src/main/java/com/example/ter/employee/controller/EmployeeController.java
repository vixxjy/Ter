package com.example.ter.employee.controller;

import com.example.ter.employee.Employee;
import com.example.ter.employee.Gender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {

        List<Employee> employees = Arrays.asList(
                new Employee(1L, "Mike", "mike@gmail.com", Gender.MALE),
                new Employee(2L, "Hanna", "hanna@gmail.com", Gender.FEMALE),
                new Employee(3L, "Mary", "mary@gmail.com", Gender.FEMALE)
        );

        return employees;
    }
}
