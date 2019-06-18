package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Empresa;
import cl.portafolio.hostalapp.models.repository.IEmpresaRepository;
import cl.portafolio.hostalapp.models.service.IEmpresaService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    private final IEmpresaRepository empresaRepository;

    public EmpresaServiceImpl(IEmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa findById(Long id) {
        System.out.println("----EmpresaServiceImpl  "+ id);
        return empresaRepository.findById(id).orElseThrow(() ->  new EntityNotFoundException());
    }
}
