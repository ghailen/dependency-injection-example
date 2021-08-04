package com.ghailene.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service
public class I18NSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola mundo - ES";
    }
}
