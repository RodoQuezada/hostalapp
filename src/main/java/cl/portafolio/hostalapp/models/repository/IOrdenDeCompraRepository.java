package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenDeCompraRepository extends JpaRepository<OrdenDeCompra, Long> {
}
