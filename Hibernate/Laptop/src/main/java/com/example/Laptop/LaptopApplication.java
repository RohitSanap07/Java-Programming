package com.example.Laptop;
//Brain of project

import com.example.Laptop.dao.daoImpl.LaptopDAO;
import com.example.Laptop.entity.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class LaptopApplication {

    @Bean
    public CommandLineRunner commandLineRunner(LaptopDAO theLaptopDAO){
        return runner ->{

            Scanner sc = new Scanner(System.in);


            System.out.println("Enter 1 for add laptop");
            System.out.println("Enter 2 for fetch laptop with ID");
            System.out.println("Enter 3 for all laptop");
            System.out.println("Enter 4 for fetch laptop with IMEI no");
            System.out.println("Enter 5 for delete laptop by Id");
            System.out.println("Enter 6 for update prize of laptop");
            System.out.print("Enter the Option : ");
            int input = sc.nextInt(); ;
            sc.nextLine();

            switch (input) {

                case 1:
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter Brand Name : ");
                        String brand = sc.nextLine();

                        System.out.print("Enter IMEI Number : ");
                        long imei = sc.nextLong();
                        sc.nextLine();

                        System.out.print("Enter RAM : ");
                        int ram = sc.nextInt();

                        System.out.print("Enter Processor : ");
                        String processor = sc.next();

                        System.out.print("Enter Price : ");
                        double price = sc.nextDouble();
                        sc.nextLine();


                        theLaptopDAO.save(new Laptop(brand, imei, ram, processor, price));
                        System.out.println("Laptop Saved Successfully !!");
                    }
                    break;

                case 2:

                    System.out.print("Enter the Laptop Id to Fetch : ");
                    Laptop byId = theLaptopDAO.findById(sc.nextInt());
                    if (byId != null) {
                        System.out.println(byId);
                        System.out.println("Laptop Found !");
                        break;
                    } else {
                        System.out.println("Laptop Not Found !");
                        break;
                    }
                case 3:

                    List<Laptop> laptops = theLaptopDAO.fetchAll();
                    for (Laptop lappy : laptops) {
                        System.out.println(lappy);
                    }
                    break;

                case 4:

                    System.out.print("Enter Laptop's Imei No. To Fetch : ");
                    Laptop byImei = theLaptopDAO.findByImeiNo(sc.nextLong());
                    if (byImei != null) {
                        System.out.println(byImei);
                        System.out.println("Laptop found Successfully !!");
                        break;
                    } else {
                        System.out.println("Laptop Not Found !!");
                        break;
                    }

                case 5:
                    System.out.println("Enter laptop ID to remove laptop");
                    int idToDelete = sc.nextInt();
                    theLaptopDAO.remove(idToDelete);
                    System.out.println("Laptop removed!");


                case 6:
                    System.out.println("Enter laptop ID to to update price");
                    int idToUpdate = sc.nextInt();
                    theLaptopDAO.update(idToUpdate);
            }

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(LaptopApplication.class, args);
    }

}