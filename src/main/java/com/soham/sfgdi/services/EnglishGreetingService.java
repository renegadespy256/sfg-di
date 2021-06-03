package com.soham.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("LangGreeting")
public class EnglishGreetingService implements Greeting{
    @Override
    public String sayGreeting() {
        return "HEllO WORLD !";
    }
}
