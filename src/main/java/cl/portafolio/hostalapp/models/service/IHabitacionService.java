package cl.portafolio.hostalapp.models.service;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;

import java.util.List;

public interface IHabitacionService {

    List<Habitacion> findAll();
    Habitacion save(Habitacion habitacion);
    Habitacion findById(Long id);

    List<EstadoHabitacion> findAllEstadoHabitacion();
    EstadoHabitacion saveEstadoHabitacion(EstadoHabitacion estadoHabitacion);
    EstadoHabitacion findByIdEstadoHabitacion(Long id);

    List<TipoHabitacion> findAllTipoHabitacion();
    TipoHabitacion saveTipoHabitacion(TipoHabitacion tipoHabitacion);
    TipoHabitacion findByTipoHabitacion(Long id);


}
