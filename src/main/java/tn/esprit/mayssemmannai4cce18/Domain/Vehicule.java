package tn.esprit.mayssemmannai4cce18.Domain;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "vehicule", fetch = FetchType.EAGER)
    private List<Maintenance> maintenances;

    @ManyToMany
    private List<Equipement> equipements;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "vehicule", fetch = FetchType.EAGER)
    private List<Reservation> reservations;

}
