package cl.portafolio.hostalapp.models.repository;

import cl.portafolio.hostalapp.models.entity.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.persistence.StoredProcedureQuery;

public interface IHuespedRepository extends JpaRepository<Huesped, Long> {




}
