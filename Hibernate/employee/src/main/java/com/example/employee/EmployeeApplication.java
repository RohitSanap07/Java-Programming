package com.example.employee;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class EmployeeApplication {

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeDao theEmployeeDao) {
        return runner -> {
            Scanner sc = new Scanner(System.in);


//            System.out.println("Enter Employee First Name");
//            String firstName = sc.nextLine();
//
//            System.out.println("Enter Employee Last Name");
//            String lastName = sc.nextLine();
//
//            System.out.println("Enter Employee Contact No.");
//            long contact = sc.nextLong();
//            sc.nextLine();
//
//            System.out.println("Enter Employee Designation");
//            String design = sc.nextLine();
//
//            System.out.println("Enter Employee Salary");
//            double salary = sc.nextDouble();
//            sc.nextLine();
//
//            theEmployeeDao.save(new Employee(firstName, lastName, contact, design, salary));
//            System.out.println("Employee Saved SuccessFully!!");




                    System.out.println("Enter the ID:");
            Employee byId = theEmployeeDao.findByID(sc.nextInt());

            if (byId != null) {
                System.out.println(byId);
                System.out.println("Employee found!");
            } else {
                System.out.println("Employee not present!");
            }

            System.out.println("Enter employee ID to update the salary");
            int idToUpdate = sc.nextInt();
            theEmployeeDao.update(idToUpdate);

            System.out.println("Enter employee ID to delete");
            int idToDelete = sc.nextInt();
            theEmployeeDao.remove(idToDelete);

            // Clear any leftover newline before next inputs to avoid Scanner issues
            sc.nextLine();

            System.out.println("Enter employee ID to update the Designation");
            int idForDes = sc.nextInt();
            // consume the newline so DAO's Scanner can read the designation properly
            sc.nextLine();

            theEmployeeDao.updateDes(idForDes);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }
}
