package cl.portafolio.hostalapp.models.services.impl;

import cl.portafolio.hostalapp.models.entity.Company;
import cl.portafolio.hostalapp.models.repository.ICompanyRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class CompanyServiceImplTest {

    //call of services
    @Mock
    ICompanyRepository companyRepository;
    CompanyServiceImpl companyService;

    //making variables
    public static final long ID_COMPANY = 1l;
    public static final String NAME_COMPANY = "Empresa_uno";
    public static final String ADRESS_COMPANY = "Adress_uno";

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        companyService = new CompanyServiceImpl(companyRepository);
    }

    @Test
    public void getAll() {
        Company company = new Company();
        company.setId(ID_COMPANY);
        company.setName(NAME_COMPANY);
        company.setAdress(ADRESS_COMPANY);

        Company company_two = new Company();
        company_two.setId(2l);
        company_two.setName("Empresa_dos");
        company_two.setAdress("Adress_dos");


        when(companyRepository.findAll()).thenReturn(Arrays.asList(company,company_two));
        List<Company> companyList = companyService.getAll();
        assertEquals(2, companyList.size());
    }

    @Test
    public void save() {



    }

    /*@Test
    public void findByName() {

        Company company = new Company();
        company.setId(ID_COMPANY);
        company.setName(NAME_COMPANY);
        company.setAdress(ADRESS_COMPANY);

        Company company_aux = companyService.findByName(NAME_COMPANY);

        assertTrue(company_aux.getName().equals("Empresa_uno"));

    } */
}