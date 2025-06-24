package com.ajayak.springBootDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Compiling by laptop");
    }
}
