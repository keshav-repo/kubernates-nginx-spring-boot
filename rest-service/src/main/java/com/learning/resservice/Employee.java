package com.learning.resservice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
}
