package com.adcubum.migration;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.FlywayCallback;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration.FlywayConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayConfigurationCustomizer;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ResourceLoader;

@Configuration
@Profile("!integration")
class FlywayConfig extends FlywayConfiguration {
    public FlywayConfig(FlywayProperties properties, DataSourceProperties dataSourceProperties,
			ResourceLoader resourceLoader, ObjectProvider<DataSource> dataSource,
			ObjectProvider<DataSource> flywayDataSource, ObjectProvider<FlywayMigrationStrategy> migrationStrategy,
			ObjectProvider<FlywayConfigurationCustomizer> fluentConfigurationCustomizers,
			ObjectProvider<Callback> callbacks, ObjectProvider<FlywayCallback> flywayCallbacks) {
		super(properties, dataSourceProperties, resourceLoader, dataSource, flywayDataSource, migrationStrategy,
				fluentConfigurationCustomizers, callbacks, flywayCallbacks);
	}

	@Primary
    @Bean(name = "flywayInitializer")
    @DependsOn("springUtility")
    public FlywayMigrationInitializer flywayInitializer(Flyway flyway){
        return super.flywayInitializer(flyway);
    }
}