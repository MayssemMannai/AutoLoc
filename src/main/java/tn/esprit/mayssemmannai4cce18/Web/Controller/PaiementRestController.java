package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Paiement;
import tn.esprit.mayssemmannai4cce18.Services.Impls.PaiementServiceImpl;

import java.util.List;

@Tag(name = "Paiements", description = "Ressource Paiements")
@RequestMapping("/paiements")
@RestController
@RequiredArgsConstructor
public class PaiementRestController {
    private final PaiementServiceImpl paiementService;

    @Operation(summary = "Ajouter un paiement", description = "Cette méthode permet d'ajouter un nouveau paiement.")
    @PostMapping
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher un paiement par identifiant")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier un paiement")
    public Paiement updatePaiement(@PathVariable Long id, @RequestBody Paiement paiement) {
        paiement.setIdPaiement(id);
        return paiementService.updatePaiement(paiement);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un paiement par identifiant")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer tous les paiements")
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }
}
