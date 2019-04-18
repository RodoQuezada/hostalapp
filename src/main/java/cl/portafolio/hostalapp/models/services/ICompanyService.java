package cl.portafolio.hostalapp.models.services;

import cl.portafolio.hostalapp.models.entity.Company;

import java.util.List;

public interface ICompanyService {


    List<Company> getAll();

    Company save(Company company);

    Company findByName(String name);


}
