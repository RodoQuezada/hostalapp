package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.Factura;
import cl.portafolio.hostalapp.models.service.IFacturaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/factura")
@CrossOrigin(origins = "http://localhost:51653")
public class FacturaController {

    private final IFacturaService facturaService;

    public FacturaController(IFacturaService facturaService) {
        this.facturaService = facturaService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Factura> findAll(){
      //  List<Factura> list = facturaService.findAll();
        return facturaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Factura save(@RequestBody @Valid Factura factura){
        return facturaService.save(factura);
    }


    @PutMapping("/actualizar")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura actualizar(@RequestBody @Valid Factura factura){
        Factura newFactura = facturaService.findById(factura.getId());

        newFactura.setFechaEmision(factura.getFechaEmision());
        newFactura.setFechaVencimiento(factura.getFechaVencimiento());
        newFactura.setTotal(factura.getTotal());
        newFactura.setNumeroDeHuespedes(factura.getNumeroDeHuespedes());
        newFactura.setFacturada(factura.isFacturada());

        return facturaService.save(newFactura);
    }


}
