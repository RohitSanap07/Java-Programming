
package com.example.Laptop.dao.daoImpl;
//entry point of project

import com.example.Laptop.entity.Laptop;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class LaptopDAOImpl implements LaptopDAO {


    private final EntityManager theLatpot ;

    @Autowired
    public LaptopDAOImpl(EntityManager theLaptop) {
        this.theLatpot = theLaptop;
    }

    @Override
    @Transactional
    public void save(Laptop theLaptop) {
     theLatpot.persist(theLaptop);
    }

    @Override
    @Transactional
    public void remove(int theId) {
        Laptop foundLaptop = theLatpot.find(Laptop.class, theId);
        if (foundLaptop == null) {
            System.out.println("No such Employee Exist to delete");
        } else {
            theLatpot.remove(foundLaptop);
        }
    }

    @Override
    @Transactional
    public void update(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop foundLaptop = theLatpot.find(Laptop.class, theId);

        if (foundLaptop == null) {
            System.out.println("No such laptop Exist to update");
        } else {
            System.out.println("Enter new price of laptop:");
            foundLaptop.setPrice(sc.nextDouble());
        }
    }




    @Override
    public Laptop findById(int theId) {
        return theLatpot.find(Laptop.class, theId);
    }

    @Override
    public List fetchAll()
    {
        Query query = theLatpot.createQuery("Select l from Laptop l");
        return query.getResultList();

    };
    @Override
    public Laptop findByImeiNo(long theimeiNo)
    {
        try {
            Query query = theLatpot.createQuery("Select l from Laptop l Where imei=:imeiNo");
            query.setParameter("imeiNo" , theimeiNo);
            return (Laptop) query.getSingleResult();
        }

        catch (Exception E)
        {
            return null;
        }
    };

}