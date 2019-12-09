package com.adcubum.migration;

import java.sql.Connection;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import liquibase.database.Database;
import liquibase.exception.DatabaseException;
import liquibase.integration.spring.SpringLiquibase;
import liquibase.resource.ResourceAccessor;

//@Component
public class LiquibaseCamunda extends SpringLiquibase{

	protected Database createDatabase(Connection c, ResourceAccessor resourceAccessor) throws DatabaseException {
		Database database = super.createDatabase(c, resourceAccessor);
		
        //if (StringUtils.trimToNull(this.databaseChangeLogTable) != null) {
            database.setDatabaseChangeLogTableName("CamundaChangeLog");
        //}
        //if (StringUtils.trimToNull(this.databaseChangeLogLockTable) != null) {
            database.setDatabaseChangeLogLockTableName("CamundaChangeLogLock");
        //}
		return database;	
	}
			
	public String getChangeLog()
	{
		return "classpath:db/changeLogCamunda.xml";
	}
		}
			
		

