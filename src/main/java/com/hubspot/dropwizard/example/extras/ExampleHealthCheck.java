package com.hubspot.dropwizard.example.extras;

import com.codahale.metrics.health.HealthCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ExampleHealthCheck extends HealthCheck {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleHealthCheck.class);

  @Inject
  public ExampleHealthCheck() {}

  @Override
  protected Result check() {
    LOG.info("ExampleHealthCheck triggered!");
    return Result.healthy();
  }
}
