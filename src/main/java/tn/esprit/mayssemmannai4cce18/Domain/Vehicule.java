package tn.esprit.mayssemmannai4cce18.Domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
    @JsonIgnore
    private Agence agence;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "vehicule", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Maintenance> maintenances;

    @ManyToMany
    @JsonIgnore
    private List<Equipement> equipements;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "vehicule", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Reservation> reservations;

}
