package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.ConsumoDiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsumoDiarioRepository extends JpaRepository<ConsumoDiario, Long> {
}
