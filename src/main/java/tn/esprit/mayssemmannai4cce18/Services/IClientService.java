package tn.esprit.mayssemmannai4cce18.Services;

import tn.esprit.mayssemmannai4cce18.Domain.Client;
import java.util.List;

public interface IClientService {
    Client createClient(Client client);
    Client getClientById(Long id);
    Client updateClient(Client client);
    void deleteClient(Long id);
    List<Client> getAllClients();
}
