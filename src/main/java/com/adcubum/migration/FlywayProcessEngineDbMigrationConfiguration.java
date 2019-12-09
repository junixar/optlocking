package com.adcubum.migration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuration for process engine db migrations.
 */
@Configuration
@ConfigurationProperties(prefix = "processengine.dbmigration")
@PropertySource("classpath:processengine.properties")
public class FlywayProcessEngineDbMigrationConfiguration {

   private String tableName;

   public String getTableName() {
      return tableName;
   }

   public void setTableName(String tableName) {
      this.tableName = tableName;
   }
}
