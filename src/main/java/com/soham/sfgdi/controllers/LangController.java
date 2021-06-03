package com.soham.sfgdi.controllers;

import com.soham.sfgdi.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LangController {

    private final Greeting greeting;

    @Autowired
    public LangController(@Qualifier("LangGreeting") Greeting greeting) {
        this.greeting = greeting;
    }
    
    public String sayHello(){
        return this.greeting.sayGreeting();
    }
}
