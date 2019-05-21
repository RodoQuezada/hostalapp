package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Huesped;
import org.springframework.data.repository.CrudRepository;

public interface IHuespedRepository extends CrudRepository<Huesped, Long> {
}
