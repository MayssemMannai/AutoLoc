package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Maintenance;
import tn.esprit.mayssemmannai4cce18.Services.Impls.MaintenanceServiceImpl;

import java.util.List;

@Tag(name = "Maintenances", description = "Ressource Maintenances")
@RequestMapping("/maintenances")
@RestController
@RequiredArgsConstructor
public class MaintenanceRestController {
    private final MaintenanceServiceImpl maintenanceService;

    @Operation(summary = "Ajouter une maintenance", description = "Cette méthode permet d'ajouter une nouvelle maintenance.")
    @PostMapping
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.createMaintenance(maintenance);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher une maintenance par identifiant")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier une maintenance")
    public Maintenance updateMaintenance(@PathVariable Long id, @RequestBody Maintenance maintenance) {
        maintenance.setIdMaintenance(id);
        return maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer une maintenance par identifiant")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer toutes les maintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }
}
