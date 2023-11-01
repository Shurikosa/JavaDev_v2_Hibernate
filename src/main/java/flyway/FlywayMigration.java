package flyway;

import org.apache.log4j.Logger;
import org.flywaydb.core.Flyway;

public class FlywayMigration {
   // private static final Logger LOG = Logger.getLogger(FlywayMigration.class);

    private FlywayMigration(){
    }
    public static void migrateDatabase(){
       // LOG.info("Flyway migration execute");
        Flyway.configure()
                .dataSource(Config.JDBCURL, Config.USERNAME, Config.PASSWORD)
                .locations("classpath:flyway/scripts")
                .load()
                .migrate();
       // LOG.info("Flyway migration complete");
    }
}
