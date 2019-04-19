package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ICompanyRepository extends CrudRepository<Company, Long> {

  //  @Query("SELECT * FROM COMPANIES u WHERE u.name = 1")
  //  Company findByName(String name);

}
