package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.EstadoHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoHabitacionRepository extends JpaRepository<EstadoHabitacion, Long> {
}
