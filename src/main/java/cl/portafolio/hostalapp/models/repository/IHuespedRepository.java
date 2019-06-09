package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHuespedRepository extends JpaRepository<Huesped, Long> {

}
