package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepository extends JpaRepository<Factura, Long> {
}
