package com.adcubum.migration;

import java.sql.Connection;

import org.flywaydb.core.api.callback.BaseFlywayCallback;
import org.flywaydb.core.api.logging.Log;
import org.flywaydb.core.api.logging.LogFactory;

public class ExampleFlywayCallback2  extends BaseFlywayCallback {
 
    private Log log = LogFactory.getLog(getClass());
 
    @Override
    public void beforeMigrate(Connection connection) {
        log.info("> beforeMigrate");
        //throw new RuntimeException("Before migrate exception!!");
    }
 
    // other methods
}
