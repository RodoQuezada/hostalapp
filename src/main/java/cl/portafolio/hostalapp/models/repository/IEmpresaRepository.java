package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpresaRepository extends JpaRepository<Empresa, Long> {
}
