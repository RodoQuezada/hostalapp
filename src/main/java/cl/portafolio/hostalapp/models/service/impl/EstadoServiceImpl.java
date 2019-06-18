package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDeCompra;
import cl.portafolio.hostalapp.models.entity.EstadoOrdenDePedido;
import cl.portafolio.hostalapp.models.repository.IEstadoEstadiaRepository;
import cl.portafolio.hostalapp.models.repository.IEstadoHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.IEstadoOrdenDeCompraRepository;
import cl.portafolio.hostalapp.models.repository.IEstadoOrdenDePedidoRepository;
import cl.portafolio.hostalapp.models.service.IEstadoService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EstadoServiceImpl implements IEstadoService {

    private final IEstadoHabitacionRepository estadoHabitacionRepository;
    private final IEstadoEstadiaRepository estadoEstadiaRepository;
    private final IEstadoOrdenDeCompraRepository estadoOrdenDeCompraRepository;
    private final IEstadoOrdenDePedidoRepository ordenDePedidoRepository;

    public EstadoServiceImpl(IEstadoHabitacionRepository estadoHabitacionRepository, IEstadoEstadiaRepository estadoEstadiaRepository, IEstadoOrdenDeCompraRepository estadoOrdenDeCompraRepository, IEstadoOrdenDePedidoRepository ordenDePedidoRepository) {
        this.estadoHabitacionRepository = estadoHabitacionRepository;
        this.estadoEstadiaRepository = estadoEstadiaRepository;
        this.estadoOrdenDeCompraRepository = estadoOrdenDeCompraRepository;
        this.ordenDePedidoRepository = ordenDePedidoRepository;
    }

    @Override
    public List<EstadoHabitacion> findAllEstadoHabitacion() {
        return estadoHabitacionRepository.findAll();
    }

    @Override
    public List<EstadoEstadia> findAllEstadoEstadia() {
        return estadoEstadiaRepository.findAll();
    }

    @Override
    public List<EstadoOrdenDeCompra> findAllEstadoOrdenDeCompra() {
        return estadoOrdenDeCompraRepository.findAll();
    }

    @Override
    public List<EstadoOrdenDePedido> findAllEstadoOrdenDePedido() {
        return ordenDePedidoRepository.findAll();
    }

    @Override
    public EstadoEstadia findByIdEstadoEstadia(Long id) {
        return estadoEstadiaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
}
