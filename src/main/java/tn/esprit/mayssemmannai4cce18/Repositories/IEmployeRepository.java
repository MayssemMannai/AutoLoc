package tn.esprit.mayssemmannai4cce18.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssemmannai4cce18.Domain.Employe;

public interface IEmployeRepository extends JpaRepository<Employe, Long> { }
