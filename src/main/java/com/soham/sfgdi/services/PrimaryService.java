package com.soham.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryService implements Greeting{

    @Override
    public String sayGreeting() {
        return "Hello From the Primary";
    }
}
