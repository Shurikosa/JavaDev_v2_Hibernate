package flyway;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    private FlywayMigration(){
    }
    public static void migrateDatabase(){
        Flyway.configure()
                .dataSource(Config.JDBCURL, Config.USERNAME, Config.PASSWORD)
                .locations("classpath:flyway/scripts")
                .load()
                .migrate();
    }
}
