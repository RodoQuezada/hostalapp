package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Factura;
import cl.portafolio.hostalapp.models.services.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/factura")
@CrossOrigin(origins = "http://localhost:54239")
public class FacturaController {


    @Autowired
    private IFacturaService facturaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Factura> getAll(){
        return facturaService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Factura save(@RequestBody @Valid Factura factura){
        return facturaService.save(factura);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Factura findById(@PathVariable(value = "id") Long id){
        return facturaService.findById(id);
    }

}

