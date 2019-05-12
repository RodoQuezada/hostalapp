package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITipoHabitacionService {

    List<TipoHabitacion> getAll();

    TipoHabitacion save(TipoHabitacion tipoHabitacion);


}
