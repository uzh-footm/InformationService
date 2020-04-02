package com.footm.informationservice;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class InformationServiceApplication extends Application<InformationServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new InformationServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "InformationService";
    }

    @Override
    public void initialize(final Bootstrap<InformationServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final InformationServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
