package com.ajayak.springBootDemo.service;

import com.ajayak.springBootDemo.model.Laptop;
import com.ajayak.springBootDemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;


    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop added successfully");
        laptopRepository.saveLaptop(laptop);
    }
}
