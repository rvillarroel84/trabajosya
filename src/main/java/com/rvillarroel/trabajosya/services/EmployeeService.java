package com.rvillarroel.trabajosya.services;

import com.rvillarroel.trabajosya.domain.Employee;
import com.rvillarroel.trabajosya.repository.EmployeeRepository;
import org.springframework.stereotype.Service;


public interface EmployeeService {

    void saveEmployee(Employee employee);
}
