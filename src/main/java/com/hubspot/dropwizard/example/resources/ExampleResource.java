package com.hubspot.dropwizard.example.resources;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Singleton
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {

  @Inject
  public ExampleResource() {}

  @GET
  public String sayHello() {
    return "Hello, World!";
  }
}
