package com.hubspot.dropwizard.example.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
@Singleton
public class ExampleRequestFilter implements ContainerRequestFilter {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleRequestFilter.class);

  @Inject
  public ExampleRequestFilter() {}

  @Override
  public void filter(ContainerRequestContext requestContext) {
    LOG.info("ExampleRequestFilter triggered!");
  }
}
