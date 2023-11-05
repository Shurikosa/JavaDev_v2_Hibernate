import flyway.FlywayMigration;

public class App {
    public static void main(String[] args) {
        FlywayMigration.migrateDatabase();
    }
}
