package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Agence;
import tn.esprit.mayssemmannai4cce18.Services.Impls.AgenceServiceImpl;

import java.util.List;

@Tag(name = "Agences", description = "Ressource Agences")
@RequestMapping("/agences")
@RestController
@RequiredArgsConstructor
public class AgenceRestController {
    private final AgenceServiceImpl agenceService;

    @Operation(summary = "Ajouter une agence", description = "Cette méthode permet d'ajouter une nouvelle agence.")
    @PostMapping
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.createAgence(agence);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher une agence par identifiant")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier une agence")
    public Agence updateAgence(@PathVariable Long id, @RequestBody Agence agence) {
        agence.setIdAgence(id);
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer une agence par identifiant")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer toutes les agences")
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }
}
