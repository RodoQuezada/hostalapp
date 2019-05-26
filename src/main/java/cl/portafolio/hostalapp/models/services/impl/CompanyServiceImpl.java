package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Company;
import cl.portafolio.hostalapp.models.repository.ICompanyRepository;
import cl.portafolio.hostalapp.models.services.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final ICompanyRepository companyRepository;

    public CompanyServiceImpl(ICompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAll() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    @Override
    public Company save(Company company) {
        System.out.println("Valor de company en CompanyServiceImpl :  " + company.toString());
        companyRepository.save(company);
        return company;
    }

/*    @Override
    public Company findByName(String name) {
        return companyRepository.findByName(name);
    } */
}
