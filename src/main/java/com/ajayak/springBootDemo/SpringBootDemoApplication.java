package com.ajayak.springBootDemo;

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

        System.out.println("Hello World");


    }

}
