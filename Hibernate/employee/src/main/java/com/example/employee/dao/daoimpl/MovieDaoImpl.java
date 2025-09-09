package com.example.employee.dao.daoimpl;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.dao.MovieDao;
import com.example.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//@Repository
//public class MovieDaoImpl implements MovieDao {
//
//    private final EntityManager theManager ;
//
//
//    @Autowired
//    public MovieDaoImpl(EntityManager theManager) {
//        this.theManager = theManager;
//    }
//
//    @Override
//    @Transactional
//    public void save(Movie theMovie) {
//        theManager.persist(theMovie);
//    }
//}




//@Repository
//
//public class EmployeeDaoImpl implements EmployeeDao {
//
//    private final EntityManager theManager ;
//
//
//    @Autowired
//    public EmployeeDaoImpl(EntityManager theManager) {
//        this.theManager = theManager;
//    }
//
//    @Override
//    @Transactional
//    public void save(Employee theEmployee) {
//        theManager.persist(theEmployee);
//    }
//}
