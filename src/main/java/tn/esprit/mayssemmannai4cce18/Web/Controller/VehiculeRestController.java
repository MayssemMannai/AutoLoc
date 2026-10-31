package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Services.Impls.VehiculeService;
import tn.esprit.mayssemmannai4cce18.Domain.Vehicule;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Tag(name="Vehicules", description="Ressource Vehicules")

@RequestMapping("/vehicules")
@RestController
@RequiredArgsConstructor
public class VehiculeRestController {
    private final VehiculeService vehiculeService;
    @Operation(summary = "Ajouter un véhicule", description = "Cette méthode permet d'ajouter un nouveau véhicule.")


    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }
    @GetMapping("/{id}")
    @Operation(summary = "Rechercher un véhicule par identifiant")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }
    @PutMapping("/{id}")
    @Operation(summary = "Modifier un véhicule")
    public Vehicule updateVehicule(@PathVariable Long id, @RequestBody Vehicule vehicule) {
        vehicule.setIdVehicule(id);
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un véhicule par identifiant")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
    @GetMapping
    @Operation(summary = "Récupérer tous les véhicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }




}
