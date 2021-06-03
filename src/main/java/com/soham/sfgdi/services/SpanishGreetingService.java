package com.soham.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("LangGreeting")
public class SpanishGreetingService implements Greeting{
    @Override
    public String sayGreeting() {
        return "Hola Mundo !";
    }
}
