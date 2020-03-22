package com.rvillarroel.trabajosya.repository;

import com.rvillarroel.trabajosya.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
