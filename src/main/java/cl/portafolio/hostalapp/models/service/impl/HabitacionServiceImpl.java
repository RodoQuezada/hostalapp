package cl.portafolio.hostalapp.models.service.impl;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.repository.IEstadoHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.IHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.ITipoHabitacionRepository;
import cl.portafolio.hostalapp.models.service.IHabitacionService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

    private final IHabitacionRepository habitacionRepository;
    private final ITipoHabitacionRepository tipoHabitacionRepository;
    private final IEstadoHabitacionRepository estadoHabitacionRepository;

    public HabitacionServiceImpl(IHabitacionRepository habitacionRepository, ITipoHabitacionRepository tipoHabitacionRepository, IEstadoHabitacionRepository estadoHabitacionRepository) {
        this.habitacionRepository = habitacionRepository;
        this.tipoHabitacionRepository = tipoHabitacionRepository;
        this.estadoHabitacionRepository = estadoHabitacionRepository;
    }

    @Override
    public List<Habitacion> findAll() {
        return habitacionRepository.findAll();
    }

    @Override
    public Habitacion save(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }

    @Override
    public Habitacion findById(Long id) {
        return habitacionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public List<EstadoHabitacion> findAllEstadoHabitacion() {
        return estadoHabitacionRepository.findAll();
    }

    @Override
    public EstadoHabitacion saveEstadoHabitacion(EstadoHabitacion estadoHabitacion) {
        return estadoHabitacionRepository.save(estadoHabitacion);
    }

    @Override
    public EstadoHabitacion findByIdEstadoHabitacion(Long id) {
        return estadoHabitacionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public List<TipoHabitacion> findAllTipoHabitacion() {
        return tipoHabitacionRepository.findAll();
    }

    @Override
    public TipoHabitacion saveTipoHabitacion(TipoHabitacion tipoHabitacion) {
        return tipoHabitacionRepository.save(tipoHabitacion);
    }

    @Override
    public TipoHabitacion findByTipoHabitacion(Long id) {
        return tipoHabitacionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

}
