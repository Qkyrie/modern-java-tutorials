package org.diplr.quarkus.core.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterService {

    public String greet(final String name) {
        return "hello " + name;
    }
}
