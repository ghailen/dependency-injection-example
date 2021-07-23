package com.ghailene.dependencyinjection.controllers;

import com.ghailene.dependencyinjection.services.GreetingService;
/* injection de dépendance avec le constructeur */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
