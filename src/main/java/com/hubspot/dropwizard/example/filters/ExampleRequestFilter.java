package com.hubspot.dropwizard.example.filters;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class ExampleRequestFilter implements ContainerRequestFilter {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleRequestFilter.class);

  @Inject
  public ExampleRequestFilter() {}

  @Override
  public ContainerRequest filter(ContainerRequest request) {
    LOG.info("ExampleRequestFilter triggered!");

    return request;
  }
}
