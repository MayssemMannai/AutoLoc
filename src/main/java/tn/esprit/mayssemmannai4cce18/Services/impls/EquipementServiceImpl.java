package tn.esprit.mayssemmannai4cce18.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssemmannai4cce18.Domain.Equipement;
import tn.esprit.mayssemmannai4cce18.Repositories.IEquipementRepository;
import tn.esprit.mayssemmannai4cce18.Services.IEquipementService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipementServiceImpl implements IEquipementService {

    private final IEquipementRepository equipementRepository;

    @Override
    public Equipement createEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}
