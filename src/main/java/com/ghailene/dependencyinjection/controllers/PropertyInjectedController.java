package com.ghailene.dependencyinjection.controllers;

import com.ghailene.dependencyinjection.services.GreetingService;

/* injection de dépendance avec la proprieté */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public  String getGreeting(){
        return greetingService.sayGreeting();
    }

}
