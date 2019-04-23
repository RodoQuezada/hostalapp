package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.repository.IHabitacionRepository;
import cl.portafolio.hostalapp.models.repository.ITipoHabitacionRepository;
import cl.portafolio.hostalapp.models.services.IHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HabitacionServiceImpl implements IHabitacionService {


    @Autowired
    private ITipoHabitacionRepository tipoHabitacionRepository;

    private final IHabitacionRepository habitacionRepository;

    public HabitacionServiceImpl(IHabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;
    }


    @Override
    @Transactional
    public List<Habitacion> getAll(){
        List<Habitacion> habitacionList = new ArrayList<>();
        habitacionRepository.findAll().forEach(habitacionList::add);
        return habitacionList;
    }

    @Override
    @Transactional(readOnly = false)
    public Habitacion save(Habitacion habitacion) {
        habitacionRepository.save(habitacion);
        return habitacion;
    }

    @Override
    @Transactional
    public Habitacion getById(Long id) {
        Habitacion habitacion =  habitacionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return habitacion;
    }

    @Override
    public TipoHabitacion getTipoHabitacionById(Long id) {
        TipoHabitacion tipoHabitacion = tipoHabitacionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return tipoHabitacion;
    }

}
