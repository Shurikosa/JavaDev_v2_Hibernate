package services;

import entities.Ticket;
import repositories.TicketRepository;

public class TicketService {
    private TicketRepository ticketRepository = new TicketRepository();
    public void persistTicket(Ticket ticket) {
        ticketRepository.persist(ticket);
    }
    public Ticket findTicketById(Long id) {
        return ticketRepository.getById(id);
    }
    public void mergeTicket(Ticket ticket) {
        ticketRepository.merge(ticket);
    }
    public void removeTicket(Ticket ticket) {
        ticketRepository.remove(ticket);
    }
}
