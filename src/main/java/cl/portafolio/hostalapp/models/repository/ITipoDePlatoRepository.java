package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.TipoPlato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDePlatoRepository extends JpaRepository<TipoPlato, Long> {
}
