package com.example.employee.dao;

import com.example.employee.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmployeeDao {

    @Transactional
    void save(Employee theEmployee);

    Employee findByID(int id);

    // public List<Employee> fetchAll();

    @Transactional
    void update(int theId);

    @Transactional
    void updateDes(int theId);

    @Transactional
    void remove(int theId);
}

