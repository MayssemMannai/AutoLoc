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
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEquipement;
    private String libelle;

    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules;
}
