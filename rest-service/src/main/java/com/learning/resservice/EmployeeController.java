package com.learning.resservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> allEmployees() {
        return employeeService.allEmployees();
    }

    @GetMapping("/{empId}")
    public Employee fetchOneEmployee(@PathVariable int empId){
        return employeeService.fetchEmployee(empId);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{empId}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int empId){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployee(@PathVariable int empId){
        employeeService.deleteEmployee(empId);
    }

}
