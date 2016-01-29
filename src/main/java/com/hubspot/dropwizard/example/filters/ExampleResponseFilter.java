package com.hubspot.dropwizard.example.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
@Singleton
public class ExampleResponseFilter implements ContainerResponseFilter {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleResponseFilter.class);

  @Inject
  public ExampleResponseFilter() {}

  @Override
  public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
    LOG.info("ExampleResponseFilter triggered!");
  }
}
