package com.restapi.springboot.crud.service;

import com.restapi.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
        List<Employee> findAll();
}
