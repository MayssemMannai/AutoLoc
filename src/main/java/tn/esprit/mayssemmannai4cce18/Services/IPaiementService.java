package tn.esprit.mayssemmannai4cce18.Services;

import tn.esprit.mayssemmannai4cce18.Domain.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement paiement);
    Paiement getPaiementById(Long id);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    List<Paiement> getAllPaiements();
}
