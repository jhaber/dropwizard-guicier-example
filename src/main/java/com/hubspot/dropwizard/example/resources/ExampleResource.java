package com.hubspot.dropwizard.example.resources;

import com.hubspot.dropwizard.example.MyObj;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {

  private MyObj myObj;

  @Inject
  public ExampleResource(MyObj myObj) {
    this.myObj = myObj;
  }

  @GET
  public String sayHello() {
    return "Hello, World!";
  }
}
