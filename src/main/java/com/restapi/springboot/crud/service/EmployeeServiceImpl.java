package com.restapi.springboot.crud.service;

import com.restapi.springboot.crud.dao.EmployeeDAO;
import com.restapi.springboot.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDao){
        employeeDAO = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
