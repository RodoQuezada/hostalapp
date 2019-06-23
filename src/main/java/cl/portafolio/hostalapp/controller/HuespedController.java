package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Empresa;
import cl.portafolio.hostalapp.models.entity.Huesped;
import cl.portafolio.hostalapp.models.service.IEmpresaService;
import cl.portafolio.hostalapp.models.service.IHuespedService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/huesped")
@CrossOrigin(origins = "http://localhost:51653")
public class HuespedController {


    private final IHuespedService huespedService;

    private final IEmpresaService empresaService;



    public HuespedController(IHuespedService huespedService, IEmpresaService empresaService) {
        this.huespedService = huespedService;
        this.empresaService = empresaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Huesped> findAll(){
        return huespedService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Huesped save(@RequestBody @Valid Huesped huesped){



     /*  System.out.println(" aaaaaaaaaa " + huesped.getIdEmp());
        Long axu = huesped.getIdEmp();
        Empresa empresa = empresaService.findById(axu);
        huesped.setEmpresa(empresa); */
        return huespedService.save(huesped);
    }



}
