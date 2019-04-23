package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Company;
import cl.portafolio.hostalapp.models.services.ICompanyService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/company")
public class CompanyController {


    @Autowired
    private ICompanyService companyService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Company> getAll(){
        return companyService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Company save(@RequestBody @Valid Company company){
        System.out.println("Valor de company en CompanyController :  " + company.toString());
        return companyService.save(company);
    }


}
