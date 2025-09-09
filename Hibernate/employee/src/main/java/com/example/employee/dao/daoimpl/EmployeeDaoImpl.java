package com.example.employee.dao.daoimpl;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private final EntityManager theManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        theManager.persist(theEmployee);
    }

    @Override
    public Employee findByID(int id) {
        return theManager.find(Employee.class, id);
    }

    // Optional helper; not used in current flow
    public Employee findByPhoneNo(long contactNo) {
        try {
            Query query = theManager.createQuery(
                    "select e from Employee e where e.contactInfo = :contactNo");
            query.setParameter("contactNo", contactNo);
            return (Employee) query.getSingleResult();
        } catch (NoResultException noe) {
            return null;
        }
    }

    @Override
    @Transactional
    public void update(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee == null) {
            System.out.println("No such Employee Exist to update");
        } else {
            System.out.println("Enter employee new salary:");
            foundEmployee.setSalary(sc.nextDouble());
        }
    }

    @Override
    @Transactional
    public void updateDes(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee == null) {
            System.out.println("No such Employee Exist to update");
        } else {
            System.out.println("Enter employee new designation:");
            String newDes = sc.nextLine();
            // If an empty line was read first, prompt once more
            if (newDes.trim().isEmpty()) {
                newDes = sc.nextLine();
            }
            foundEmployee.setDesignation(newDes);
        }
    }

    @Override
    @Transactional
    public void remove(int theId) {
        Employee foundEmployee = theManager.find(Employee.class, theId);
        if (foundEmployee == null) {
            System.out.println("No such Employee Exist to delete");
        } else {
            theManager.remove(foundEmployee);
        }
    }
}
