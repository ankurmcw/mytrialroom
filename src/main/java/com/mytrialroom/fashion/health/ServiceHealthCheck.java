package com.mytrialroom.fashion.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by amarchattiwar on 10/8/16.
 */
public class ServiceHealthCheck extends HealthCheck {

    public ServiceHealthCheck() {
        super();
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
