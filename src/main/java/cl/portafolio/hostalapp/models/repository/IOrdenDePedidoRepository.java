package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.OrdenDePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenDePedidoRepository extends JpaRepository<OrdenDePedido, Long> {
}
