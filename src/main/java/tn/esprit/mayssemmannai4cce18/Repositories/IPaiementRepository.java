package tn.esprit.mayssemmannai4cce18.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssemmannai4cce18.Domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> { }
