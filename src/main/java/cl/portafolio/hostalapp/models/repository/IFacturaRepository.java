package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaRepository extends CrudRepository<Factura, Long> {
}
