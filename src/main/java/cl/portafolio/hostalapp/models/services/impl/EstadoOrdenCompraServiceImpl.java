package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.EstadoOrdenCompra;
import cl.portafolio.hostalapp.models.repository.IEstadoOrdenCompraRepository;
import cl.portafolio.hostalapp.models.services.IEstadiaService;
import cl.portafolio.hostalapp.models.services.IEstadoOrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class EstadoOrdenCompraServiceImpl implements IEstadoOrdenCompraService {


    @Autowired
    private IEstadoOrdenCompraRepository estadoOrdenCompraRepository;

    @Override
    public EstadoOrdenCompra save(EstadoOrdenCompra estadoOrdenCompra) {
        return  estadoOrdenCompraRepository.save(estadoOrdenCompra);
    }

    @Override
    public EstadoOrdenCompra findById(Long id) {
        return estadoOrdenCompraRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public String getEstadoCompra(Long id) {
        EstadoOrdenCompra ordenCompra = estadoOrdenCompraRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return ordenCompra.getEstado();
    }


}
