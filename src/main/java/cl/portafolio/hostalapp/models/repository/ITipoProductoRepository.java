package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.TipoPlato;
import cl.portafolio.hostalapp.models.entity.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoProductoRepository extends JpaRepository<TipoProducto, Long> {
}
