package tn.esprit.mayssemmannai4cce18.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssemmannai4cce18.Domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> { }
