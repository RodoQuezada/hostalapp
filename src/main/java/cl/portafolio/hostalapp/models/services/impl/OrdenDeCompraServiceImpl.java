package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import cl.portafolio.hostalapp.models.repository.IOrdenDeCompraRepository;
import cl.portafolio.hostalapp.models.services.IOrdenDeCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class OrdenDeCompraServiceImpl implements IOrdenDeCompraService {

    @Autowired
    private IOrdenDeCompraRepository ordenDeCompraRepository;

    @Override
    public List<OrdenDeCompra> getAll() {
        return (List<OrdenDeCompra>) ordenDeCompraRepository.findAll();
    }

    @Override
    public OrdenDeCompra save(OrdenDeCompra ordenDeCompra) {
        return ordenDeCompraRepository.save(ordenDeCompra);
    }

    @Override
    public OrdenDeCompra findById(Long id) {
        return ordenDeCompraRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
}
