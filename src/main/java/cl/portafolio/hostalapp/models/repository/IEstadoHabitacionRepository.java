package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import org.springframework.data.repository.CrudRepository;

public interface IEstadoHabitacionRepository extends CrudRepository <EstadoHabitacion, Long> {
}
