package com.soham.sfgdi.controllers;

import com.soham.sfgdi.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private final Greeting greeting;

    @Autowired
    public ConstructorController(Greeting greeting) {
        this.greeting = greeting;
        System.out.println("In the constructor, Dependency Injected");
    }

    public String getGreeting(){
        return greeting.sayGreeting();
    }
}
