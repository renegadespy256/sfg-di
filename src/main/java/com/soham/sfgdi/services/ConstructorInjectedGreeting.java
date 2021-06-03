package com.soham.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreeting implements Greeting {
    @Override
    public String sayGreeting() {
        System.out.println("In a service");
        return "Hello World";
    }
}
