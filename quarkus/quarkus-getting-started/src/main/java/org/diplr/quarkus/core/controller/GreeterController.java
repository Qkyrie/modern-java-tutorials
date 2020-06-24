package org.diplr.quarkus.core.controller;

import org.diplr.quarkus.core.service.GreeterService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreeterController {

    @Inject
    GreeterService greeterService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greeterService.greet("world");
    }
}
