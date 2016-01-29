package com.hubspot.dropwizard.example.extras;

import io.dropwizard.lifecycle.Managed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ExampleManaged implements Managed {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleManaged.class);

  @Inject
  public ExampleManaged() {}

  @Override
  public void start() {
    LOG.info("ExampleManaged starting!");
  }

  @Override
  public void stop() {
    LOG.info("ExampleManaged stopping!");
  }
}
