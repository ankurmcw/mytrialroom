package com.mytrialroom.fashion;

import com.mytrialroom.fashion.config.TrialRoomConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by amarchattiwar on 10/8/16.
 */
public class TrialRoomApp extends Application<TrialRoomConfig> {

    public static void main(String[] args) {

    }

    @Override
    public void initialize(Bootstrap<TrialRoomConfig> bootstrap) {

    }

    @Override
    public void run(TrialRoomConfig trialRoomConfig, io.dropwizard.setup.Environment environment) throws Exception {

    }

    private ConfigurableApplicationContext applicationContext() throws BeansException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.mytrialroom.fashion");
        return context;
    }
}
