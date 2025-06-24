package com.ajayak.springBootDemo.repo;

import com.ajayak.springBootDemo.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void saveLaptop(Laptop laptop) {
        System.out.println("Laptop saved successfully");
    }
}
