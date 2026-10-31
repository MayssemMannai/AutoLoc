package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Contrat;
import tn.esprit.mayssemmannai4cce18.Services.Impls.ContratServiceImpl;

import java.util.List;

@Tag(name = "Contrats", description = "Ressource Contrats")
@RequestMapping("/contrats")
@RestController
@RequiredArgsConstructor
public class ContratRestController {
    private final ContratServiceImpl contratService;

    @Operation(summary = "Ajouter un contrat", description = "Cette méthode permet d'ajouter un nouveau contrat.")
    @PostMapping
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.createContrat(contrat);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher un contrat par identifiant")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier un contrat")
    public Contrat updateContrat(@PathVariable Long id, @RequestBody Contrat contrat) {
        contrat.setIdContrat(id);
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un contrat par identifiant")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer tous les contrats")
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }
}
