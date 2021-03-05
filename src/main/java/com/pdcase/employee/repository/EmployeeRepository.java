package com.pdcase.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdcase.employee.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
