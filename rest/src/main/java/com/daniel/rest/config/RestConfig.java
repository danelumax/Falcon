package com.daniel.rest.config;

import com.daniel.rest.monitor.RestMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig {

    @Bean(initMethod = "init")
    public RestMonitor restMonitor() {
        return new RestMonitor();
    }
}
