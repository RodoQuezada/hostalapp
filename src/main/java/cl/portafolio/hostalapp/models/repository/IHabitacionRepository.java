package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHabitacionRepository extends JpaRepository<Habitacion, Long> {

}
