package com.example.Laptop.dao.daoImpl;
//Structure of project i.e interface
import com.example.Laptop.dao.daoImpl.LaptopDAOImpl;
import com.example.Laptop.entity.Laptop;
import jakarta.transaction.Transactional;

import java.util.List;

public interface LaptopDAO{

    public void save(Laptop theLaptop );

    Laptop findById(int theId);

    public void remove(int theId);

    List<Laptop> fetchAll();

    Laptop findByImeiNo(long theimeiNo);

    @Transactional
    void update(int theId);
}