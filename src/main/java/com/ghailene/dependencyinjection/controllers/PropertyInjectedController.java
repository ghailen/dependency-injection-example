package com.ghailene.dependencyinjection.controllers;

import com.ghailene.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* injection de dépendance avec la proprieté */
@Component
public class PropertyInjectedController {

    @Qualifier("propertyInjectionGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
