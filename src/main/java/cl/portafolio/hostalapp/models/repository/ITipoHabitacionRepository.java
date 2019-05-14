package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.TipoHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ITipoHabitacionRepository extends JpaRepository<TipoHabitacion, Long> {
}
