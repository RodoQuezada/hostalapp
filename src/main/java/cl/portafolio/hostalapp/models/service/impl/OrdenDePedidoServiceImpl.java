package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.OrdenDePedido;
import cl.portafolio.hostalapp.models.repository.IOrdenDePedidoRepository;
import cl.portafolio.hostalapp.models.service.IOrdenDePedidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenDePedidoServiceImpl implements IOrdenDePedidoService {

    private final IOrdenDePedidoRepository ordenDePedidoRepository;

    public OrdenDePedidoServiceImpl(IOrdenDePedidoRepository ordenDePedidoRepository) {
        this.ordenDePedidoRepository = ordenDePedidoRepository;
    }


    @Override
    public List<OrdenDePedido> findAll() {
        return ordenDePedidoRepository.findAll();
    }

    @Override
    public OrdenDePedido save(OrdenDePedido ordenDePedido) {
        return ordenDePedidoRepository.save(ordenDePedido);
    }
}
