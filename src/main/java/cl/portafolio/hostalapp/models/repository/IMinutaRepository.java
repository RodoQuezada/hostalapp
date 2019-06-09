package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Minuta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMinutaRepository extends JpaRepository<Minuta, Long> {
}
