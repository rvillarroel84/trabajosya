package com.rvillarroel.trabajosya.services;

import com.rvillarroel.trabajosya.domain.Employee;
import com.rvillarroel.trabajosya.repository.EmployeeRepository;

public class EmployeeImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
