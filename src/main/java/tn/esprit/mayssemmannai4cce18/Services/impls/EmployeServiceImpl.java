package tn.esprit.mayssemmannai4cce18.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssemmannai4cce18.Domain.Employe;
import tn.esprit.mayssemmannai4cce18.Repositories.IEmployeRepository;
import tn.esprit.mayssemmannai4cce18.Services.IEmployeService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeServiceImpl implements IEmployeService {

    private final IEmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
