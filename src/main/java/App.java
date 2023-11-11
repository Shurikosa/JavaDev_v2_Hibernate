import entities.Client;
import entities.Planet;
import entities.Ticket;
import flyway.FlywayMigration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.ClientService;
import services.PlanetService;
import services.TicketService;
import utils.HibernateUtil;

public class App {
    private static final Logger LOG = LogManager.getLogger(App.class);
    private static ClientService clientService = new ClientService();
    private static PlanetService planetService = new PlanetService();
    private static TicketService ticketService = new TicketService();
    public static void main(String[] args) {
        LOG.info("The program has started");
        FlywayMigration.migrateDatabase();

        /*
        create new Client
         */
        Client newClient = new Client();
        newClient.setName("Oleksandr Osaula");
        Client newClient2 = new Client();
        newClient2.setName("Some Client");
        clientService.persistClient(newClient);
        clientService.persistClient(newClient2);

        /*read and print Client by id
         */
       Client client = clientService.findClientById(13L);
       System.out.println("Found Client: " + client.getName());
        Client client11 = clientService.findClientById(11L);
        System.out.println("Found Client: " + client11.getName());
        Client client12 = clientService.findClientById(12L);
        System.out.println("Found Client: " + client12.getName());
        /*
        update Client
         */
        client.setName("Some Dude");
        clientService.mergeClient(client);
        /*
        delete Client
         */
        clientService.removeClient(client);

        /*  work with Ticket

         */
        Client luckyClient = clientService.findClientById(4L);
        Planet fromPlanet = planetService.findPlanetById("MARS");
        Planet toPlanet = planetService.findPlanetById("SATURN");

        Ticket ticket = new Ticket();
        ticket.setClient(luckyClient);
        ticket.setFromPlanet(fromPlanet);
        ticket.setToPlanet(toPlanet);
        ticketService.persistTicket(ticket);

        HibernateUtil.getInstance().close();
        LOG.info("The program has finished");

    }
}
