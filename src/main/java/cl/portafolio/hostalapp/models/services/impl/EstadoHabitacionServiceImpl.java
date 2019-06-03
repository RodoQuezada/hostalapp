package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.repository.IEstadoHabitacionRepository;
import cl.portafolio.hostalapp.models.services.IEstadoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoHabitacionServiceImpl implements IEstadoHabitacionService {

    @Autowired
    private IEstadoHabitacionRepository estadoHabitacionRepository;


    @Override
    public List<EstadoHabitacion> getAll() {
        return (List<EstadoHabitacion>) estadoHabitacionRepository.findAll();
    }
}
