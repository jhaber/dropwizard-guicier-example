package com.hubspot.dropwizard.example.extras;

import io.dropwizard.lifecycle.ServerLifecycleListener;
import org.eclipse.jetty.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ExampleServerLifecycleListener implements ServerLifecycleListener {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleServerLifecycleListener.class);

  @Inject
  public ExampleServerLifecycleListener() {}

  @Override
  public void serverStarted(Server server) {
    LOG.info("ExampleServerLifecycleListener triggered!");
  }
}
