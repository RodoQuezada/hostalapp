package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface ICompanyRepository extends CrudRepository<Company, Long> {

    Company findByName(String name);

}
