package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Empresa;
import cl.portafolio.hostalapp.models.repository.IEmpresaRepository;
import cl.portafolio.hostalapp.models.services.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getAll() {
        return (List<Empresa>) empresaRepository.findAll();
    }

    @Override
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa findById(Long id) {
        return empresaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
}
