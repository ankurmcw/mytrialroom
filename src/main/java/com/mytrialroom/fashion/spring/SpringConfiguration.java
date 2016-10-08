package com.mytrialroom.fashion.spring;

import com.mytrialroom.fashion.config.TrialRoomConfig;
import com.mytrialroom.fashion.health.ServiceHealthCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by amarchattiwar on 10/8/16.
 */

@Configuration
public class SpringConfiguration {

    @Autowired
    TrialRoomConfig trialRoomConfig;

    @Bean
    ServiceHealthCheck healthCheck() {
        return new ServiceHealthCheck();
    }

}
