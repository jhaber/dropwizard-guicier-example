package com.hubspot.dropwizard.example.filters;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class ExampleResponseFilter implements ContainerResponseFilter {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleResponseFilter.class);

  @Inject
  public ExampleResponseFilter() {}

  @Override
  public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {
    LOG.info("ExampleResponseFilter triggered!");

    return response;
  }
}
