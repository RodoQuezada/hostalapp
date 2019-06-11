package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.entity.TipoPlato;
import cl.portafolio.hostalapp.models.entity.TipoProducto;
import cl.portafolio.hostalapp.models.repository.ITipoDePlatoRepository;
import cl.portafolio.hostalapp.models.repository.ITipoHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.ITipoProductoRepository;
import cl.portafolio.hostalapp.models.service.IConsumoDiarioService;
import cl.portafolio.hostalapp.models.service.ITipoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServiceImpl implements ITipoService {

    private final ITipoHabitacionRepository tipoHabitacionRepository;
    private final ITipoDePlatoRepository tipoDePlatoRepository;
    private final ITipoProductoRepository tipoProductoRepository;

    public TipoServiceImpl(ITipoHabitacionRepository tipoHabitacionRepository, ITipoDePlatoRepository tipoDePlatoRepository, ITipoProductoRepository tipoProductoRepository) {
        this.tipoHabitacionRepository = tipoHabitacionRepository;
        this.tipoDePlatoRepository = tipoDePlatoRepository;
        this.tipoProductoRepository = tipoProductoRepository;
    }

    @Override
    public List<TipoHabitacion> findAllHabitaciones() {
        return tipoHabitacionRepository.findAll();
    }

    @Override
    public List<TipoPlato> findAllPlatos() {
        return tipoDePlatoRepository.findAll();
    }

    @Override
    public List<TipoProducto> findAllProductos() {
        return tipoProductoRepository.findAll();
    }
}
