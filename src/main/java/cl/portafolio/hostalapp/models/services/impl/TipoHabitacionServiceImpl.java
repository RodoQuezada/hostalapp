package cl.portafolio.hostalapp.models.services.impl;


import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import cl.portafolio.hostalapp.models.repository.ITipoHabitacionRepository;
import cl.portafolio.hostalapp.models.services.ITipoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoHabitacionServiceImpl implements ITipoHabitacionService {

    @Autowired
    private ITipoHabitacionRepository tipoHabitacionRepository;


    @Override
    public List<TipoHabitacion> getAll() {
        return (List<TipoHabitacion>) tipoHabitacionRepository.findAll();
    }

    @Override
    public TipoHabitacion save(TipoHabitacion tipoHabitacion) {
        return tipoHabitacionRepository.save(tipoHabitacion);
    }
}
