package com.learning.resservice;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> allEmployees(){
        return employeeRepo.findAll();
    }

    public Employee fetchEmployee(int empId){
        return employeeRepo.findById(empId).orElse(null);
    }

    public Employee saveEmployee(Employee employee){
       return employeeRepo.save(employee);
    }

    public void deleteEmployee(int empId){
        employeeRepo.deleteById(empId);
    }
}
