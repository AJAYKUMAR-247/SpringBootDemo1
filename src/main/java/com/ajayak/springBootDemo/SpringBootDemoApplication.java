package com.ajayak.springBootDemo;

import com.ajayak.springBootDemo.model.Alien;
import com.ajayak.springBootDemo.model.Laptop;
import com.ajayak.springBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        // To gave the work of managing the object creation, we have to say the classes, for which class and all, we're going to do that.
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        Alien obj = context.getBean(Alien.class);
        obj.code();

        LaptopService laptopService = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        laptopService.addLaptop(lap);
        System.out.println("Hello World");


    }

}
