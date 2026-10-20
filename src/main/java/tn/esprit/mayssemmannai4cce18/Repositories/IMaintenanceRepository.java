package tn.esprit.mayssemmannai4cce18.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssemmannai4cce18.Domain.Maintenance;

public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> { }
