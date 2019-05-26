package cl.portafolio.hostalapp.controller;

import cl.portafolio.hostalapp.models.entity.OrdenDeCompra;
import cl.portafolio.hostalapp.models.services.IEstadoOrdenCompraService;
import cl.portafolio.hostalapp.models.services.IOrdenDeCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordendecompa")
@CrossOrigin(origins = "http://localhost:54239")
public class OrdenDeCompraController {

    @Autowired
    private IOrdenDeCompraService ordenDeCompraService;

    @Autowired
    private IEstadoOrdenCompraService estadoOrdenCompraService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrdenDeCompra> getAll(){
        return ordenDeCompraService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrdenDeCompra save(OrdenDeCompra ordenDeCompra){
        return ordenDeCompraService.save(ordenDeCompra);
    }

    @GetMapping("/estadoorden/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String consultaEstadoOrden(@PathVariable(value = "id")Long id){
        OrdenDeCompra orde = ordenDeCompraService.findById(id);
        return estadoOrdenCompraService.getEstadoCompra(id);
    }

}
