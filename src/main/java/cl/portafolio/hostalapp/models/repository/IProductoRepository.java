package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
