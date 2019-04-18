package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Company;
import cl.portafolio.hostalapp.models.repository.ICompanyRepository;
import cl.portafolio.hostalapp.models.services.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import org.apache.log4j.Logger;

@Service
public class CompanyServiceImpl implements ICompanyService {

   // static final Logger log = Logger.getLogger(CompanyServiceImpl.class);
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
     //   log.info("Valor de company en CompanyServiceImpl :  " + company.toString());
        System.out.println("Valor de company en CompanyServiceImpl :  " + company.toString());
        companyRepository.save(company);
        return company;
    }

    @Override
    public Company findByName(String name) {
        return null;
    }
}
