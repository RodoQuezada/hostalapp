package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import org.springframework.data.repository.CrudRepository;

public interface IHabitacionRepository extends CrudRepository <Habitacion, Long> {
}
