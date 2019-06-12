package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.EstadoOrdenDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoOrdenDeCompraRepository extends JpaRepository<EstadoOrdenDeCompra, Long> {
}
