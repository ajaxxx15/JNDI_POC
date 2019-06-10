package com.ibm.demo.service;

import com.ibm.demo.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public  Iterable<Employee> getAllEmployee();
    public Employee getEmployeeByName(String name);
    public List getEmployeeDetails(String name,String job);
}
