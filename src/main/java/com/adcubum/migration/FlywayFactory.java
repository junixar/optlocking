package com.adcubum.migration;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.callback.FlywayCallback;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayFactory {

    @Bean
    public FlywayMigrationInitializer flywayInitializer(Flyway flyway) {
        flyway.setCallbacks(flywayCallback());
        return new FlywayMigrationInitializer(flyway);
    }

    @Bean
    public FlywayCallback flywayCallback() {
        return new ExampleFlywayCallback2();
    }

}
