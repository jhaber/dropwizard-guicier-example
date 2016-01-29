package com.hubspot.dropwizard.example.extras;

import com.google.common.collect.ImmutableMultimap;
import io.dropwizard.servlets.tasks.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.PrintWriter;

@Singleton
public class ExampleTask extends Task {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleTask.class);

  @Inject
  public ExampleTask() {
    super("example");
  }

  @Override
  public void execute(ImmutableMultimap<String, String> parameters, PrintWriter output) {
    LOG.info("ExampleTask triggered!");
  }
}
