package com.hubspot.dropwizard.example;

import com.google.inject.Binder;
import com.hubspot.dropwizard.example.extras.ExampleHealthCheck;
import com.hubspot.dropwizard.example.extras.ExampleManaged;
import com.hubspot.dropwizard.example.extras.ExampleServerLifecycleListener;
import com.hubspot.dropwizard.example.extras.ExampleTask;
import com.hubspot.dropwizard.example.filters.ExampleRequestFilter;
import com.hubspot.dropwizard.example.filters.ExampleResponseFilter;
import com.hubspot.dropwizard.example.resources.ExampleResource;
import com.hubspot.dropwizard.guicier.DropwizardAwareModule;
import com.hubspot.dropwizard.guicier.JerseyBinder;

/**
 * Extend DropwizardAwareModule to gain access to the Bootstrap, Configuration, and Environment
 */
public class ExampleModule extends DropwizardAwareModule<ExampleConfiguration> {

  @Override
  public void configure(Binder binder) {
    // You can use the configuration to conditionally bind resources
    if (getConfiguration().bindResources()) {
      binder.bind(ExampleResource.class);
    }

    // There is also a multibinder for request/response filters
    if (getConfiguration().bindFilters()) {
      JerseyBinder.bindContainerRequestFilter(binder).to(ExampleRequestFilter.class);
      JerseyBinder.bindContainerResponseFilter(binder).to(ExampleResponseFilter.class);
    }

    // Any Managed, Task, HealthCheck, or ServerLifecycleListener bound in Guice will be added to Dropwizard for you
    if (getConfiguration().bindExtras()) {
      binder.bind(ExampleManaged.class);
      binder.bind(ExampleTask.class);
      binder.bind(ExampleHealthCheck.class);
      binder.bind(ExampleServerLifecycleListener.class);
    }
  }
}
