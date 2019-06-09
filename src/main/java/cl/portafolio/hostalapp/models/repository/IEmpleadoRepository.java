package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
}
