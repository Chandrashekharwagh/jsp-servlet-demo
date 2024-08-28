package com.electra.repository;

import com.electra.model.Greeting;
import java.util.HashMap;
import java.util.Map;

public class GreetingRepository {
    private Map<String, Greeting> dataStore = new HashMap<>();

    public void save(Greeting greeting) {
        dataStore.put("greeting", greeting);
    }

    public Greeting find() {
        return dataStore.get("greeting");
    }
}
