package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Empresa;
import cl.portafolio.hostalapp.models.services.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "http://localhost:54239")
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/load")
    @ResponseStatus(HttpStatus.OK)
    public List<Empresa> load(){
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("Empresa prueba");
        empresa.setDireccionFacturacion("Av. Siempre viva");
        empresa.setRazonSocial("Razon social");
        empresa.setTelefono(123123);
        empresaService.save(empresa);
        return empresaService.getAll();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Empresa> getAll(){
        return empresaService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa save(@RequestBody @Valid Empresa empresa){
        return empresaService.save(empresa);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa update(@PathVariable (value = "id") Long id, @RequestBody Empresa empresa){
        Empresa updateEmp = empresaService.findById(id);
        updateEmp.setNombreEmpresa(empresa.getNombreEmpresa());
        updateEmp.setTelefono(empresa.getTelefono());
        updateEmp.setRazonSocial(empresa.getRazonSocial());
        updateEmp.setDireccionFacturacion(empresa.getDireccionFacturacion());
        empresaService.save(updateEmp);
        return updateEmp;
    }


}
