package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.Proveedor;
import cl.portafolio.hostalapp.models.repository.IProveedorRepository;
import cl.portafolio.hostalapp.models.service.IProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    private final IProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(IProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> getAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}
