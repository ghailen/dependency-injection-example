package com.ghailene.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
