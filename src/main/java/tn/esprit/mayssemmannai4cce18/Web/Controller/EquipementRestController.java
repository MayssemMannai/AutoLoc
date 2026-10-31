package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Equipement;
import tn.esprit.mayssemmannai4cce18.Services.Impls.EquipementServiceImpl;

import java.util.List;

@Tag(name = "Equipements", description = "Ressource Equipements")
@RequestMapping("/equipements")
@RestController
@RequiredArgsConstructor
public class EquipementRestController {
    private final EquipementServiceImpl equipementService;

    @Operation(summary = "Ajouter un équipement", description = "Cette méthode permet d'ajouter un nouvel équipement.")
    @PostMapping
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.createEquipement(equipement);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher un équipement par identifiant")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier un équipement")
    public Equipement updateEquipement(@PathVariable Long id, @RequestBody Equipement equipement) {
        equipement.setIdEquipement(id);
        return equipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un équipement par identifiant")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer tous les équipements")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }
}
