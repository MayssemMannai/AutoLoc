package tn.esprit.mayssemmannai4cce18.Services;

import tn.esprit.mayssemmannai4cce18.Domain.Agence;
import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence agence);
    Agence getAgenceById(Long id);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
    List<Agence> getAllAgences();
}
