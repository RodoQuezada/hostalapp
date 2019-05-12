package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import cl.portafolio.hostalapp.models.entity.TipoHabitacion;

import java.util.List;
import java.util.Optional;

public interface IHabitacionService {

    List<Habitacion> getAll();

    Habitacion save (Habitacion habitacion);



}
