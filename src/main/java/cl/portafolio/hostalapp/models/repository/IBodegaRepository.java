package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBodegaRepository extends JpaRepository<Bodega, Long> {
}
