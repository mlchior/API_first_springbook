package com.openclassrooms.hr.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import com.openclassrooms.hr.API.model.Employee;
import com.openclassrooms.hr.API.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    @PostMapping("/employees")
    public Employee createEmployee(Employee employee) {
        return employeeService.saveEmployee(employee);
    }

}