import entities.Client;
import flyway.FlywayMigration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.ClientService;
import utils.HibernateUtil;

public class App {
    private static final Logger LOG = LogManager.getLogger(App.class);
    private static ClientService clientService = new ClientService();
    public static void main(String[] args) {
        LOG.info("The program has started");
        FlywayMigration.migrateDatabase();

        /*
        create new Client
         */
        Client newClient = new Client();
        newClient.setName("Oleksandr Osaula");
        clientService.persistClient(newClient);
        /*
        read and print Client by id
         */
        Client client = clientService.findClientById(11L);
        System.out.println("Found Client: " + client.getName());
        /*
        update Client
         */
        client.setName("Some Dude");
        clientService.mergeClient(client);
        /*
        delete Client
         */
        clientService.removeClient(client);

        HibernateUtil.getInstance().close();
        LOG.info("The program has finished");

    }
}
