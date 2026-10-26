package tn.esprit.mayssemmannai4cce18.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssemmannai4cce18.Domain.Client;
import tn.esprit.mayssemmannai4cce18.Repositories.IClientRepository;
import tn.esprit.mayssemmannai4cce18.Services.IClientService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
