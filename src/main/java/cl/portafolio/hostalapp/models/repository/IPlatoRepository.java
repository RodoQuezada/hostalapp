package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlatoRepository extends JpaRepository<Plato,Long> {
}
