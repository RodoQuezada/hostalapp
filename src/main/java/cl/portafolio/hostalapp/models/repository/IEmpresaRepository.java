package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<Empresa, Long> {
}
