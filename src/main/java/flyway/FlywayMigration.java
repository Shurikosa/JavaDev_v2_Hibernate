package flyway;



import org.flywaydb.core.Flyway;

public class FlywayMigration {
   // private static final Logger LOG = Logger.getLogger(FlywayMigration.class);

    private FlywayMigration(){
    }
    public static void migrateDatabase(){
      // log.info("Flyway migration execute");
        Flyway.configure()
                .dataSource(Config.JDBCURL, Config.USERNAME, Config.PASSWORD)
                .locations("classpath:flyway/scripts")
                .load()
                .migrate();
      // log.info("Flyway migration complete");
    }
}
