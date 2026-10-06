package tn.esprit.mayssemmannai4cce18.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}
