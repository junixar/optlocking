package com.adcubum.migration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import liquibase.integration.spring.SpringLiquibase;

@Configuration
	public class DefaultLiquibaseConfiguration {

	    @Autowired
	    private DataSource dataSource;

	    //define this property in your embedded properties file or use spring's default
	    @Value("${liquibase.change-log}")
	    private String defaultLiquibaseChangelog;

	    
	    @Bean(name = "defaultLiquibase")
	    public SpringLiquibase liquibase() {
	    	SpringLiquibase liquibase = new SpringLiquibase();
	        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(defaultLiquibaseChangelog);
//	        liquibase.setChangeLog(this.properties.getChangeLog());
//			liquibase.setContexts(this.properties.getContexts());
//			liquibase.setDefaultSchema(this.properties.getDefaultSchema());
//			liquibase.setLiquibaseSchema(this.properties.getLiquibaseSchema());
//			liquibase.setLiquibaseTablespace(this.properties.getLiquibaseTablespace());
//			liquibase.setDatabaseChangeLogTable(this.properties.getDatabaseChangeLogTable());
//			liquibase.setDatabaseChangeLogLockTable(this.properties.getDatabaseChangeLogLockTable());
//			liquibase.setDropFirst(this.properties.isDropFirst());
//			liquibase.setShouldRun(this.properties.isEnabled());
//			liquibase.setLabels(this.properties.getLabels());
//			liquibase.setChangeLogParameters(this.properties.getParameters());
//			liquibase.setRollbackFile(this.properties.getRollbackFile());
//			liquibase.setTestRollbackOnUpdate(this.properties.isTestRollbackOnUpdate());
	        return liquibase;
	    }
	}
