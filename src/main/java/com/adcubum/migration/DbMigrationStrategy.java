package com.adcubum.migration;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * This class implements our own Flyway Migration strategy.
 */
@Component
public class DbMigrationStrategy {

   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final ProcessEngineDbMigrationConfiguration processEngineMigrationConfiguration;

   public DbMigrationStrategy(ProcessEngineDbMigrationConfiguration processEngineMigrationConfiguration) {
      this.processEngineMigrationConfiguration = processEngineMigrationConfiguration;
   }

   @Bean
   public FlywayMigrationStrategy flywayMigrationStrategy() {
      return flyway -> {
         // execute default migrations
         logger.info("running camunda flyway migration strategy");
         DataSource datasource = flyway.getConfiguration().getDataSource();

         try {
            Flyway flywayCamunda;
            String jdbcUrl = datasource.getConnection().getMetaData().getURL();
          
               flywayCamunda = new Flyway(Flyway.configure()
                     .dataSource(datasource)
                     .locations("db/camunda")
                     .table(processEngineMigrationConfiguration.getTableName()));
            flywayCamunda.baseline();
            flywayCamunda.migrate();
         } catch (SQLException exception) {
            throw new RuntimeException("unexpected SQLException", exception);  // NOSONAR: we want to abort execution if this problem occurs
         } finally {
           
               logger.info("executing default flyway migrations");
               flyway.baseline();
               flyway.migrate();
            
         }
      };
   }

}
