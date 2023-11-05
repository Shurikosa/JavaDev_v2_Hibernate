package services;

import entities.Client;
import repositories.ClientRepository;

public class ClientService {
    private ClientRepository clientRepository = new ClientRepository();
    public void persistClient(Client client) {
        clientRepository.persist(client);
    }
    public Client findClientById(Long id) {
        return clientRepository.getById(id);
    }
    public void mergeClient(Client client) {
        clientRepository.merge(client);
    }
    public void removeClient(Client client) {
        clientRepository.remove(client);
    }
}
