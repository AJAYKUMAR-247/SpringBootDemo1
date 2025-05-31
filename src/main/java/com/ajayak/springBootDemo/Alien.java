package com.ajayak.springBootDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {


    // the spring knows that it have to create a obj for Alien class, because of what we have did in the main method
    // like that we inform that, to do it for Laptop class also by using a annotation @Autowiring, this is called wiring in DI.
    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
        System.out.println("Coding");
    }

}
