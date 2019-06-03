package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;

import java.util.List;

public interface IEstadoHabitacionService {

    List<EstadoHabitacion> getAll();

}
