package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Estadia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadiaRepository extends JpaRepository<Estadia, Long> {

}
