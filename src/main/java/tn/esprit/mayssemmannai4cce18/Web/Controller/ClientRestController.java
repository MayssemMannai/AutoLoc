package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Client;
import tn.esprit.mayssemmannai4cce18.Services.Impls.ClientServiceImpl;

import java.util.List;

@Tag(name = "Clients", description = "Ressource Clients")
@RequestMapping("/clients")
@RestController
@RequiredArgsConstructor
public class ClientRestController {
    private final ClientServiceImpl clientService;

    @Operation(summary = "Ajouter un client", description = "Cette méthode permet d'ajouter un nouveau client.")
    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher un client par identifiant")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier un client")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        client.setIdClient(id);
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un client par identifiant")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer tous les clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
