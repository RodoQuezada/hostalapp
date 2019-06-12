package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.EstadoEstadia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoEstadiaRepository extends JpaRepository<EstadoEstadia, Long> {
}
