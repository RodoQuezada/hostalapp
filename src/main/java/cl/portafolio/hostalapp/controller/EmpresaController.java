package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Empresa;
import cl.portafolio.hostalapp.models.service.IEmpresaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    private final IEmpresaService empresaService;


    public EmpresaController(IEmpresaService empresaService) {
        this.empresaService = empresaService;
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
}
