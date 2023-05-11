package com.learning.resservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private List<Employee> employeeList;
    public EmployeeController() {
        employeeList = new ArrayList<>(
                List.of(
                        Employee.builder().empId(1).firstName("John").lastName("Doe").build(),
                        Employee.builder().empId(2).firstName("Richard").lastName("Roe").build(),
                        Employee.builder().empId(3).firstName("Wilson").lastName("Pickett").build()
                )
        );
    }
    @GetMapping
    public List<Employee> allEmployees() {
        return employeeList;
    }
}
