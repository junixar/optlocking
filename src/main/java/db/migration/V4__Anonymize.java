package db.migration;

import java.sql.ResultSet;
import java.sql.Statement;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

public class V4__Anonymize extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
    	
    	try(Statement insert = context.getConnection().createStatement())
    	{
    		boolean res = insert.execute("insert into a (id, firstname) values (1,'steffi')");
    	}
    }
}


