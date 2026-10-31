package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Employe;
import tn.esprit.mayssemmannai4cce18.Services.Impls.EmployeServiceImpl;

import java.util.List;

@Tag(name = "Employes", description = "Ressource Employes")
@RequestMapping("/employes")
@RestController
@RequiredArgsConstructor
public class EmployeRestController {
    private final EmployeServiceImpl employeService;

    @Operation(summary = "Ajouter un employé", description = "Cette méthode permet d'ajouter un nouvel employé.")
    @PostMapping
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher un employé par identifiant")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier un employé")
    public Employe updateEmploye(@PathVariable Long id, @RequestBody Employe employe) {
        employe.setIdEmploye(id);
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un employé par identifiant")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer tous les employés")
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }
}
