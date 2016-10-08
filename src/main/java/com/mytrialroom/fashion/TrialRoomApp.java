package com.mytrialroom.fashion;

import com.github.nhuray.dropwizard.spring.SpringBundle;
import com.mytrialroom.fashion.config.TrialRoomConfig;
import io.dropwizard.Application;
import io.dropwizard.bundles.assets.ConfiguredAssetsBundle;
import io.dropwizard.bundles.version.VersionBundle;
import io.dropwizard.bundles.version.VersionSupplier;
import io.dropwizard.bundles.version.suppliers.MavenVersionSupplier;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by amarchattiwar on 10/8/16.
 */
public class TrialRoomApp extends Application<TrialRoomConfig> {

    public static void main(String[] args) throws Exception {
        new TrialRoomApp().run(new String[]{"server", "conf/trial-room.yml"});
    }

    @Override
    public void initialize(Bootstrap<TrialRoomConfig> bootstrap) {
        bootstrap.addBundle(new SpringBundle(applicationContext(), true, true, true));
        VersionSupplier supplier = new MavenVersionSupplier("com.mytrialroom.fashion", "mytrialroom");
        bootstrap.addBundle(new VersionBundle(supplier));
        bootstrap.addBundle(new ConfiguredAssetsBundle("/swagger/", "/swaggerui/"));
        bootstrap.addBundle(new SwaggerBundle<TrialRoomConfig>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(TrialRoomConfig appConfiguration) {
                return appConfiguration.swaggerBundleConfiguration;
            }
        });
    }

    @Override
    public void run(TrialRoomConfig trialRoomConfig, Environment environment) throws Exception {

    }

    private ConfigurableApplicationContext applicationContext() throws BeansException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.mytrialroom.fashion");
        return context;
    }
}
