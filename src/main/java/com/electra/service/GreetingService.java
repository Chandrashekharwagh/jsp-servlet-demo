package com.electra.service;

import com.electra.model.Greeting;
import com.electra.repository.GreetingRepository;

public class GreetingService {
    private GreetingRepository repository = new GreetingRepository();

    public void saveGreeting(String name) {
        Greeting greeting = new Greeting(name);
        repository.save(greeting);
    }

    public String getGreeting() {
        Greeting greeting = repository.find();
        return greeting != null ? greeting.getName() : "Guest";
    }
}
