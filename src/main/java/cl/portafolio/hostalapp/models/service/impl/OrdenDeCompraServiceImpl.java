package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import cl.portafolio.hostalapp.models.repository.IOrdenDeCompraRepository;
import cl.portafolio.hostalapp.models.service.IOrdenDeCompraService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenDeCompraServiceImpl implements IOrdenDeCompraService {


    private final IOrdenDeCompraRepository ordenDeCompraRepository;

    public OrdenDeCompraServiceImpl(IOrdenDeCompraRepository ordenDeCompraRepository) {
        this.ordenDeCompraRepository = ordenDeCompraRepository;
    }

    @Override
    public List<OrdenDeCompra> findAll() {
        return ordenDeCompraRepository.findAll();
    }

    @Override
    public OrdenDeCompra save(OrdenDeCompra ordenDeCompra) {
        return ordenDeCompraRepository.save(ordenDeCompra);
    }
}
