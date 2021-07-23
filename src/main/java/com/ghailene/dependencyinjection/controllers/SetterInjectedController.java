package com.ghailene.dependencyinjection.controllers;

import com.ghailene.dependencyinjection.services.GreetingService;
/* injection de dépendance avec le setter */
public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
