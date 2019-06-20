package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Empresa;
import cl.portafolio.hostalapp.models.service.IEmpresaService;
import cl.portafolio.hostalapp.models.service.IHuespedService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "http://localhost:51653")
public class EmpresaController {

    private final IEmpresaService empresaService;
    private final IHuespedService huespedService;


    public EmpresaController(IEmpresaService empresaService, IHuespedService huespedService) {
        this.empresaService = empresaService;
        this.huespedService = huespedService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa save(@RequestBody @Valid Empresa empresa){
        return empresaService.save(empresa);
    }


    @GetMapping("/load-list")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Empresa> loadList(){

        System.out.println("-----  prueba logggggg");

        

        return empresaService.findAll();
    }



}
