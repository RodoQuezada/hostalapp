package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository extends JpaRepository<Proveedor, Long> {
}
