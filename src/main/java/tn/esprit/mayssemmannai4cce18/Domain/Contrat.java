package tn.esprit.mayssemmannai4cce18.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    @OneToOne
    private Reservation reservation;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "contrat", fetch = FetchType.EAGER)
    private List<Paiement> paiements;
}
