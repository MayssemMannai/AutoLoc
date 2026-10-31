package tn.esprit.mayssemmannai4cce18.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssemmannai4cce18.Domain.Reservation;
import tn.esprit.mayssemmannai4cce18.Services.Impls.ReservationServiceImpl;

import java.util.List;

@Tag(name = "Reservations", description = "Ressource Reservations")
@RequestMapping("/reservations")
@RestController
@RequiredArgsConstructor
public class ReservationRestController {
    private final ReservationServiceImpl reservationService;

    @Operation(summary = "Ajouter une réservation", description = "Cette méthode permet d'ajouter une nouvelle réservation.")
    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Rechercher une réservation par identifiant")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier une réservation")
    public Reservation updateReservation(@PathVariable Long id, @RequestBody Reservation reservation) {
        reservation.setIdReservation(id);
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer une réservation par identifiant")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping
    @Operation(summary = "Récupérer toutes les réservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
}
